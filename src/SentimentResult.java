
public class SentimentResult {
	public String status;
	public String language;
	public DocSentiment docSentiment;
	public String mixed;
	public String url;
	public String statusInfo;


	public class DocSentiment {
		public String type;
		public double score;
	}
}
