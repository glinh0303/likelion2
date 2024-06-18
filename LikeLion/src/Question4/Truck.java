package Question4;

public class Truck extends Vehicle {
	private String model;
	private String type;
	private String year;
	private String typeOfFuel;

	public Truck(String model, String type, String year, String typeOfFuel) {
		this.model = model;
		this.type = type;
		this.year = year;
		this.typeOfFuel = typeOfFuel;
	}

	@Override
	public void name() {
		System.out.println("Truck Model: " + model);
	}

	@Override
	public void fuelEfficiency() {
		System.out.println("Fuel Efficiency: 8.075659532105526mgp");
	}

	@Override
	public void distance() {
		System.out.println("Distance Traveled: 65.5097501 miles");
	}

	@Override
	public void maxSpeed() {
		System.out.println("Max speed: 80.0mph");
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
