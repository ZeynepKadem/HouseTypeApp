package entity.abstracts;

public abstract class HouseType {

	private int price;
	private int hallCount;
	private int roomCount;
	private int squaremeter;
	
	
	public HouseType(int price, int hallCount, int roomCount, int squaremeter) {
		super();
		this.price = price;
		this.hallCount = hallCount;
		this.roomCount = roomCount;
		this.squaremeter = squaremeter;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getHallCount() {
		return hallCount;
	}


	public void setHallCount(int hallCount) {
		this.hallCount = hallCount;
	}


	public int getRoomCount() {
		return roomCount;
	}


	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}


	public int getSquaremeter() {
		return squaremeter;
	}


	public void setSquaremeter(int squaremeter) {
		this.squaremeter = squaremeter;
	}
	
	

}
