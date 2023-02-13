package tourism;

public class Excursion extends Journey implements NumberOfStays{

	private int hotels;
	
	Excursion(String destination, int days, double price, int hotels) {
		super(destination, days, price);
		this.hotels = hotels;
	}
	
	public int getHotels() {
		return hotels;
	}

	@Override
	public double fixPrice(double price) {
		return getPrice() + price + getPrice()*0.1;
	}

	@Override
	public int getNightStays(int days) {
		
		return 0;
	}
	
}
