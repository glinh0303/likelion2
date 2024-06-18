package Question4;

public class Main {

	public static void main(String[] args) {
		Truck truck = new Truck("Tatra 810 4x4", "truck", "2000", "f1");
		Car car = new Car("Virtus", "car", "2000", "f2");
		Motorcycle motorcycle = new Motorcycle("Warrior200", "motorcycle", "2000", "f3");
		
		truck.showDetail();
		car.showDetail();
		motorcycle.showDetail();

	}

}
