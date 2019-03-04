package prakticum7;

import java.time.LocalDate;

public abstract class Voertuig implements Goed{
	
	private String type;
	protected double nieuwprijs;
	protected int bouwjaar;
	
	public Voertuig() {
		this("", 0.0, LocalDate.now().getYear());
	}
	
	public Voertuig(String tp, double pr, int jr) {
		this.type = tp;
		this.nieuwprijs = pr;
		this.bouwjaar = jr;
	}
	
	public boolean equals(Object obj) {
		boolean result = obj instanceof Voertuig;
		
		result = result && this.type == ((Voertuig)obj).type;
		result = result && this.nieuwprijs == ((Voertuig)obj).nieuwprijs;
		result = result && this.bouwjaar == ((Voertuig)obj).bouwjaar;
		
		
		return result;
	}

	public String toString() {
		String s = "Type: " + this.type + " Nieuwprijs: " + this.huidigeWaarde() + " bouwjaar: " + this.bouwjaar;
		return s;
	}
	
}
