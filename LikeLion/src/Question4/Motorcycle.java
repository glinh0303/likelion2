package Question4;

public class Motorcycle extends Vehicle {
	private String model;
	private String type;
	private String year;
	private String typeOfFuel;

	public Motorcycle(String model, String type, String year, String typeOfFuel) {
		super(model, type, year, typeOfFuel);
	}

	@Override
	public void name() {
		System.out.println("Motorcycle Model: " + model);
	}

	@Override
	public void fuelEfficiency() {
		System.out.println("Fuel Efficiency: 2.1mpg");
	}

	@Override
	public void distance() {
		System.out.println("Distance Traveled: 4.41 miles");
	}

	@Override
	public void maxSpeed() {
		System.out.println("Max Speed: 80.0mph");
	}

	@Override
	public void showDetail() {
		name();
		fuelEfficiency();
		distance();
		maxSpeed();
		System.out.println();
	}

}
