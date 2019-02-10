package prakticum2b;

public class Voetbalclub {
	private String naam;
	private int aantalGewonnen;
	private int aantalVerloren;
	private int aantalGelijk;
	
	public Voetbalclub(String nm) {
		naam = nm;
	}
	
	public int aantalGespeeld() {
		return (aantalGewonnen + aantalVerloren + aantalGelijk);
	}
	
	public int aantalPunten() {
		return (aantalGewonnen * 3) + aantalGelijk;
	}
	
	public void verwerkResultaat(char ch) {
		if (ch == 'w')
			aantalGewonnen = aantalGewonnen + 1;
		if (ch == 'g')
			aantalGelijk = aantalGelijk + 1;
		if (ch == 'v')
			aantalVerloren = aantalVerloren + 1;
	}
	
	public String toString() {
		return "" + aantalGespeeld() + "	" + aantalGewonnen + "	" + aantalGelijk + "	" + aantalVerloren + "	" + aantalPunten();
	}
}
