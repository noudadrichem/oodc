package prakticum3b;

public class Klant {

	private String naam;
	private double kortingsPercentage;

	public Klant(String nm) {
		this.naam = nm;
		this.kortingsPercentage = 0.0;
	}

	public void setKorting(double kP) {
		this.kortingsPercentage = kP;
	}

	public double getKorting() {
		return this.kortingsPercentage;
	}

	public String toString() {
		return "op naam van: " + this.naam + " (korting: " + this.kortingsPercentage + " )\n";
	}
}
