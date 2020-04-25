package user;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String username;
	private String password;
	private List<String> datesOfPastReservations;
	
	public User() {
		this.datesOfPastReservations = new ArrayList<String>();
		
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.datesOfPastReservations = new ArrayList<String>();
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void addPastReservation(String reservationDate) {
		this.datesOfPastReservations.add(reservationDate);
	}
	
	public List<String> getPastReservations() {
		return this.datesOfPastReservations;
	}
	
}
