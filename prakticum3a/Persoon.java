// Noud Adrichem
package prakticum3a;

public class Persoon {

	private String naam;
	private int leeftijd;
	
	public Persoon(String nm, int lftd) {
		this.naam = nm;
		this.leeftijd = lftd;
	}
	
	public String toString() {
		return "naam: " + this.naam + " leeftijd: " + this.leeftijd;
	}
}
