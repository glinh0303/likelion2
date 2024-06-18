package Question3;

public class Developer extends Employee {
	private String name;
	private String address;
	private double salary;
	private String position;

	public Developer(String name, String address, double salary, String position) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.position = position;
	}

	@Override
	public void bonus() {
		System.out.println("Developer's Bonus: $" + salary);
	}

	@Override
	public void performance(String s) {
		System.out.println("Performance report for Developer " + name + ": " + s);
	}

	@Override
	public void ManageProject() {
		System.out.println("Developer " + name + " is writing code in Java");
	}

}
