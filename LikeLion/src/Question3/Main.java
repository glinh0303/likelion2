package Question3;

public class Main {

	public static void main(String[] args) {

		Manager m = new Manager("Avril Aroldo", "HCM", 12000.0, "manager");
		Developer dev = new Developer("Iver Dipali", "Hanoi", 7200.0, "developer");
		Programmer prog = new Programmer("Yaron Gabriel", "HCM", 9120.0, "programmer");

		m.bonus();
		dev.bonus();
		prog.bonus();

		m.performance("Excellent");
		dev.performance("Good");
		prog.performance("Excellent");

		m.ManageProject();
		dev.ManageProject();
		prog.ManageProject();

	}

}
