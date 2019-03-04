package prakticum7;

import java.time.LocalDate;

public class Auto extends Voertuig {

	private String kenteken;

	public Auto(String tp, double pr, int jr, String kt) {
		super(tp, pr, jr);
		this.kenteken = kt;
	}

	public double huidigeWaarde() {
		double huidigeWaarde = this.nieuwprijs;
		int huidigJaar = LocalDate.now().getYear();
		int jaarOud = huidigJaar - this.bouwjaar;

		for (int i = 0; i < jaarOud; i++) {
			huidigeWaarde = huidigeWaarde * 0.7;
		}

		return huidigeWaarde;
	}

	public boolean equals(Object obj) {
		boolean result = obj instanceof Voertuig;
		
		result = result && super.equals(obj);
		result = result && this.kenteken.equals(((Auto)obj).kenteken);
		
		return result;
	}
}
