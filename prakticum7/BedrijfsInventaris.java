package prakticum7;

import java.util.ArrayList;

public class BedrijfsInventaris {
	
	private String bedrijfsnaam;
	private double budget;
	private ArrayList<Goed> alleGoederen;
	
	public BedrijfsInventaris(String nm, double bud) {
		this.bedrijfsnaam = nm;
		this.budget = bud;
		this.alleGoederen = new ArrayList<Goed>();
	}
	
	public void schafAan(Goed g) {
		if(!alleGoederen.contains(g) && this.budget >= g.huidigeWaarde()) {
			alleGoederen.add(g);
		}
	}
	
	public String toString() {
		String s = this.bedrijfsnaam + " met inventaris :\n";
		for(int i =0; i < alleGoederen.size(); i++) {
			s += alleGoederen.get(i) + "\n";
		}
		return s;
	}

}
