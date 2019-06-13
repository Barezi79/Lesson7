package optional;

public class GeneralPractitioner extends Doctor {

	public GeneralPractitioner(String name) {
		super(name);
	}

	void doHouseVisits() {
		System.out.println("Visiting old patients are my obligation.");
	}

	void doMedicine() {
		System.out.println("I am a General practitioner. I listen to my patients about helt problems,"
				+ " examin it and make a presription.");
	}
}
