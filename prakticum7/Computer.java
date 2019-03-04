package prakticum7;

import java.time.LocalDate;

public class Computer implements Goed {

	private String type;
	private String MacAdres;
	private double aanschafPrijs;
	private int productieJaar;

	public Computer(String tp, String adr, double pr, int jr) {
		this.type = tp;
		this.MacAdres = adr;
		this.aanschafPrijs = pr;
		this.productieJaar = jr;
	}

	public double huidigeWaarde() {
		double huidigeWaarde = this.aanschafPrijs;
		int huidigJaar = LocalDate.now().getYear();
		int jaarOud = huidigJaar - this.productieJaar;

		for (int i = 0; i < jaarOud; i++) {
			huidigeWaarde = huidigeWaarde * 0.6;
		}

		return huidigeWaarde;
	}

	public boolean equals(Object obj) {
		boolean result = obj instanceof Computer;

		result = result && this.type.equals(((Computer) obj).type);
		result = result && this.MacAdres.equals(((Computer) obj).MacAdres);

		return result;
	}
	
	public String toString() {
		return "Computer: " + this.type + " heeft een waarde van: " + this.huidigeWaarde();
	}
}
