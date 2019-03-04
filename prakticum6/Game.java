package prakticum6;

import java.time.LocalDate;

public class Game {

	private String naam;
	private int releaseJaar;
	private double nieuwPrijs;

	public Game(String naam, int releaseJaar, double nieuwPrijs) {
		this.naam = naam;
		this.releaseJaar = releaseJaar;
		this.nieuwPrijs = nieuwPrijs;
	}

	public String getNaam() {
		return this.naam;
	}

	public double huidigeWaarde() {
		int huidigJaar = LocalDate.now().getYear();
		int jarenGeleden = huidigJaar - this.releaseJaar;
		
		double prijsNa1Jaar = this.nieuwPrijs * 0.7;
		double prijsNa2Jaar = prijsNa1Jaar * 0.7;
		
		if(jarenGeleden == 0) {
			return this.nieuwPrijs;
		} else if(jarenGeleden == 1) {
			return prijsNa1Jaar;
		} else if(jarenGeleden == 2) {
			return prijsNa2Jaar;
		} else {
			return 0.0;
		}
	}

	public boolean equals(Object anderObject) {
		boolean isGelijk = false;

		if (anderObject instanceof Game) {
			Game andereGame = (Game)anderObject;

			if (this.naam.equals(andereGame.naam) && this.releaseJaar == andereGame.releaseJaar && this.nieuwPrijs == andereGame.nieuwPrijs) {
				isGelijk = true;
			}

		} else {
			isGelijk = false;
		}

		return isGelijk;
	}

	public String toString() {
		String s = this.naam + ", uitgegeven in "+ this.releaseJaar +"; nieuwprijs: €"+this.nieuwPrijs+" nu voor: " + this.huidigeWaarde() + "\n";
		return s;
	}

}
