import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;


public class TweetRequest {
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
    private String id_str;
    private String created_at;
    private String text;
    private String user;
    private double longitude;
    private double latitude;
    
    public static TweetRequest fromJson(final InputStream json) 
            throws IOException {
        
        return MAPPER.readValue(json, TweetRequest.class);
    }

	public String getId_str() {
		return id_str;
	}

	public void setId_str(String id_str) {
		this.id_str = id_str;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

    
    
    public String toJson() throws IOException {
        return MAPPER.writeValueAsString(this);
    }
    
}
