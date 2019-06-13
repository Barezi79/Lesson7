package optional;

public class Surgeon extends Doctor {
	
	public Surgeon (String name) {
		super (name);
	}
	void performSurgery() {
		System.out.println("I am a Surgery doctor. I operate on patients to treat their diseases or injuries.");
	}
	void doConsultation() {
		System.out.println("Usually I do consulatations with other colleagues during the surgery and after" + 
	" to give the best treatment to our patients.");
	}
	
}
