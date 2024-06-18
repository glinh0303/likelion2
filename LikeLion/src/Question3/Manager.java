package Question3;

public class Manager extends Employee {
	private String name;
	private String address;
	private double salary;
	private String position;

	public Manager() {

	}

	public Manager(String name, String address, double salary, String position) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.position = position;
	}

	@Override
	public void bonus() {
		System.out.println("Manager's Bonus: $" + salary);
	}

	@Override
	public void performance(String s) {
		System.out.println("Performance report for Manager " + name + ": " + s);
	}

	@Override
	public void ManageProject() {
		System.out.println("Manager " + name + " is managing a project.");
	}

}
