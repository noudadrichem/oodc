package prakticum4;

import java.util.ArrayList;

public class Klas {
	
	private String klasCode; 
	private ArrayList<Leerling> leerlingen;  

	public Klas(String klasCode) {
		this.klasCode = klasCode;
		this.leerlingen = new ArrayList<Leerling>();
	}
	
	public void voegLeerlingToe(Leerling l) {
		leerlingen.add(l);
	}
	
	public void wijzigCijfer(String naam, double nieuwCijfer) {
		for(Leerling leerling : leerlingen) {
			if(leerling.getNaam().equals(naam)) {
				leerling.setCijfer(nieuwCijfer);
			}
		}
	}
	
	public ArrayList<Leerling> getLeerlingen() {
		return leerlingen;
	}
	
	public int aantalLeerlingen() {
		return leerlingen.size();
	}
	
	public String toString() {
		String s = "In de klas " + this.klasCode + " zitten de volgende leerlingen: \n";
		for(Leerling leerling : leerlingen) {
			s += leerling;
		};
		return s;
	}

}
