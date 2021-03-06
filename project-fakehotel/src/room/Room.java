package room;

public class Room {
	
	public String price;
	private String check_in;
	private String check_out;
	public int guests;
	public String floor;
	private int beds;
	public int roomnumber;
	
	public Room(String price, String check_in, String check_out, int guests, String floor, int beds, int roomnumber) {
		this.price = price;
		this.check_in = check_in;
		this.check_out = check_out;
		this.guests = guests;
		this.floor = floor;
		this.beds = beds;
		this.roomnumber = roomnumber;
	}
	
	public Room() {
		
	}
	
	public void setCheckIn(String check_in) {
		this.check_in = check_in;
	}
	
	public String getCheckIn() {
		return this.check_in;
	}
	
	public void setCheckOut(String check_out) {
		this.check_out = check_out;
	}
	
	public String getCheckOut() {
		return this.check_out;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getPrice() {
		return this.price;
	}
	
	public void setGuests(int guests) {
		this.guests = guests;
	}
	
	public int getGuests() {
		return this.guests;
	}
	
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	public String getFloor() {
		return this.floor;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}
	
	public int getBeds() {
		return this.beds;
	}
	
	public void setNumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	
	public int getNumber() {
		return this.roomnumber;
	}
}
