package prakticum7;

import java.time.LocalDate;

public class Fiets extends Voertuig {

	private int framenummer;

	public Fiets(String tp, double pr, int jr, int nm) {
		super(tp, pr, jr);
		this.framenummer = nm;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = obj instanceof Voertuig;

		result = result && super.equals(obj);
		result = result && this.framenummer == ((Fiets) obj).framenummer;

		return result;
	}

	@Override
	public double huidigeWaarde() {
		double huidigeWaarde = this.nieuwprijs;
		int huidigJaar = LocalDate.now().getYear();
		int jaarOud = huidigJaar - this.bouwjaar;

		for(int i = 0; i < jaarOud; i++) {
			huidigeWaarde = huidigeWaarde * 0.9;
		}

		return huidigeWaarde;
	}
}
