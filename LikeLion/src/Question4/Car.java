package Question4;

public class Car extends Vehicle {
	private String model;
	private String type;
	private String year;
	private String typeOfFuel;

	public Car(String model, String type, String year, String typeOfFuel) {
		this.model = model;
		this.type = type;
		this.year = year;
		this.typeOfFuel = typeOfFuel;
	}

	@Override
	public void name() {
		System.out.println("Car Model: " + model);
	}

	@Override
	public void fuelEfficiency() {
		System.out.println("Fuel Efficiency: 2.355mpg");
	}

	@Override
	public void distance() {
		System.out.println("Distance Traveled: 14.419665 miles");
	}

	@Override
	public void maxSpeed() {
		System.out.println("Max Speed: 120.0mph");
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
