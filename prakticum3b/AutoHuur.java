package prakticum3b;

public class AutoHuur {

	private int aantalDagen;
	private Auto gehuurdeAuto;
	private Klant huurder;

	public AutoHuur() {
	}

	public void setAantalDagen(int aD) {
		this.aantalDagen = aD;
	}

	public void setGehuurdeAuto(Auto gA) {
		this.gehuurdeAuto = gA;
	}

	public Auto getGehuurdeAuto() {
		return gehuurdeAuto;
	}

	public void setHuurder(Klant k) {
		this.huurder = k;
	}

	public Klant getHuurder() {
		return huurder;
	}

	public double totaalPrijs() {
		if (this.gehuurdeAuto != null && this.huurder != null) {
			double korting = 1.0 - (huurder.getKorting() / 100);
			double prijs = (aantalDagen * gehuurdeAuto.getPrijsPerDag()) * korting;
			return prijs;
		} else {
			return 0.0;
		}
	}

	public String toString() {
		String s = "Aantal dagen: " + this.aantalDagen + " en dat kost " + this.totaalPrijs() + " ";

		if (this.gehuurdeAuto == null) {
			s += "Er is geen auto bekend.";
		} else {
			s += this.gehuurdeAuto;
		}

		if (this.huurder == null) {
			s += "er is geen huurder bekent";
		} else {
			s += this.huurder;
		}
		return s;
	}
}
