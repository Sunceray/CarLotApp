
public class UsedCar extends Car {
	double mileage;
	
	public UsedCar() {
		super();
	}
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Make: " + getMake() + "  Model: " + getModel() + "  Year: " + getYear() + 
				"  Price: " + getPrice() + "  Mileage: " + mileage;
	}
	
	
}
