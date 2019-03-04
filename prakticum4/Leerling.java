package prakticum4;

public class Leerling {
	
	private String naam;
	private double cijfer;

	public Leerling(String naam) {
		this.naam = naam;
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public double getCijfer() {
		return this.cijfer;
	}

	public void setCijfer(double cijfer) {
		this.cijfer = cijfer;
	}
	
	public String toString() {
		String s = this.naam + " heeft cijfer: " + this.cijfer + "\n";
		return s;
	}
}
