package tourism;

public abstract class Journey {

	private String destination;
	private int days;
	private double price;
	
	Journey(String destination, int days, double price) {
		super();
		this.destination = destination;
		this.days = days;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDestination() {
		return destination;
	}

	public int getDays() {
		return days;
	}
	
	public abstract double fixPrice(double price);
	
}
