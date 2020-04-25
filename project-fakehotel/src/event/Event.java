package event;

public class Event {
	
	private String dateName;
	private String dateDay;
	private String eventDescription;
	private String eventTitle;
	
	public Event() {
		
	}
	
	public Event(String dateName, String dateDay, String eventDescription, String eventTitle) {
		this.dateName = dateName;
		this.dateDay = dateDay;
		this.eventDescription = eventDescription;
		this.eventTitle = eventTitle;
	}
	
	public void setDateName(String dateName) {
		this.dateName = dateName;
	}
	
	public String getDateName() {
		return this.dateName;
	}
	
	public void setDateDay(String dateDay) {
		this.dateDay = dateDay;
	}
	
	public String getDateDay() {
		return this.dateDay;
	}
	
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	
	public String getEventTitle() {
		return this.eventTitle;
	}
	
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	public String getEventDescription() {
		return this.eventDescription;
	}
	
	

}
