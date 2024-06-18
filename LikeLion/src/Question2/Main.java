package Question2;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee(4000);
		HRManager hrManager = new HRManager(7000);

		emp.working();
		hrManager.working();
		hrManager.addEmployee();

	}

}
