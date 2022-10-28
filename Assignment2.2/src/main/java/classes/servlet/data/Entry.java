package classes.servlet.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry {
	private String username;
	private String message;
	private String date;
	private String[] sport;
	public Entry(){

	}

	public String[] getSport() {
		return sport;
	}

	public void setSport(String[] sport) {
		this.sport = sport;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public SimpleDateFormat getDateFormat() {
		return dateFormat;
	}

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy HH:mm");
	
	public Entry(String username, String message, String[] sport) {
		this.username=username;
		this.message=message;
		this.sport = sport;
		this.date=dateFormat.format(new Date());
		
	}
	
	public String SearchByUsername(String username) {
		if(this.username.equals(username))
			return this.toString();
		
		return "";
		
	}
	
	
	//Define SearchByDate()
	
	
	
	public String SearchByMessage(String phrase) {
		if(this.message.contains(phrase))
			return this.toString();
		
		return "";
		
	}
	
	
	
	
	public String toString() {
		return "<tr><td>" + date + "</td><td>" + username + "</td><td>" + message + "</td></tr>";
	}
	
	
	
	
	
	

	
	

}
