package Question3;

public class Programmer extends Employee {
	private String name;
	private String address;
	private double salary;
	private String position;

	public Programmer(String name, String address, double salary, String position) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.position = position;
	}

	@Override
	public void bonus() {
		System.out.println("Programmer's Bonus: $" + salary);
	}

	@Override
	public void performance(String s) {
		System.out.println("Performance report for Programmer " + name + ": " + s);
	}

	@Override
	public void ManageProject() {
		System.out.println("Programmer " + name + " is debugging code in Python");
	}

}
