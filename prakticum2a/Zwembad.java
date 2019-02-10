package prakticum2a;

public class Zwembad {
	private double breedte;
	private double lengte;
	private double diepte;
	
	public Zwembad() {
		breedte = 0.0;
		lengte = 0.0;
		diepte = 0.0;
	}
	
	public Zwembad(double brd, double lng, double dpt) {
		breedte = brd;
		lengte = lng;
		diepte = dpt;
	}
	
	public double getBreedte() {
		return breedte;
	}
	
	public double getLengte() {
		return lengte;
	}
	
	public double getDiepte() {
		return diepte;
	}
	
	public void setBreedte(double brd) {
		breedte = brd;
	}
	
	public void setLengte(double lng) {
		lengte = lng;
	}
	
	public void setDiepte(double dpt) {
		diepte = dpt;
	}
	
	public double inhoud() {
		return (lengte * breedte * diepte);
	}
	
	public String toString() {
		return "lengte is: " + lengte + 
				" breedte is: " + breedte + 
				" diepte is: " + diepte + 
				" dit maakte de inhoud: " + inhoud();
	}
}
