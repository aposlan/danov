package tourism;

public class Trip extends Journey{
	
	private String hotelName;

	Trip(String destination, int days, double price, String hotelName) {
		super(destination, days, price);
		this.hotelName = hotelName;
	}

	public String getHotel() {
		return hotelName;
	}

	@Override
	public double fixPrice(double price) {
		return getPrice() + price + getPrice()*0.4;
	}
	
}
