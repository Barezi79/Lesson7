package nesic.branislav;

public class Doctor {

	private String name;

	public Doctor(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + ".";
	}

	public void setName(String name) {
		this.name = name;
	}

	void doMedicine() {
		System.out.println("I listen my patients for their helt problems, do diagnosis and treat them");
	}

}
