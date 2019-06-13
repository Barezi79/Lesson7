package optional;

public class DoctorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeneralPractitioner gp = new GeneralPractitioner("Dr.Maria");
		System.out.println(gp.getName());
		gp.doHouseVisits();
		gp.doMedicine();

		Surgeon s = new Surgeon("Dr.Mike");
		System.out.println(s.getName());
		s.performSurgery();
		s.doConsultation();

	}

}
