package Question2;

public class HRManager extends Employee {
	private int salary;

	public HRManager(int salary) {
		this.salary = salary;
	}

	@Override
	public void working() {
		System.out.println("Managing employees");
		System.out.println("Manager salary: " + salary + "\n");
	}

	public void addEmployee() {
		System.out.println("Adding new employee!" + "\n");
	}

}
