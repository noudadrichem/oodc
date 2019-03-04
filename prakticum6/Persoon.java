package prakticum6;

import java.util.ArrayList;

public class Persoon {

	private String naam;
	private double budget;
	private ArrayList<Game> mijnGames;
	
	public Persoon(String naam, double budget) {
		this.naam = naam;
		this.budget = budget;
		this.mijnGames = new ArrayList<Game>();
	}
	
	public boolean koop(Game g) {
		if(this.budget >= g.huidigeWaarde() && !mijnGames.contains(g)) { 
			mijnGames.add(g);
			this.budget -= g.huidigeWaarde();
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verkoop(Game g, Persoon koper) {
		if(mijnGames.contains(g) && !koper.mijnGames.contains(g) && koper.budget >= g.huidigeWaarde()) {
			this.budget += g.huidigeWaarde();
			koper.koop(g);
			mijnGames.remove(g);
			return true;
		} else {
			return false;
		}
	}

	
	public Game zoekGameOpNaam(String gameNaam) {
		Game heeftGame = null;
		for(Game game : mijnGames) {
			if (game.getNaam().equals(gameNaam)) {
				heeftGame = game;
			}
		}
		return heeftGame;
	}
	
	
	public String toString() {
		String s = this.naam + " heeft een budget van €"+ this.budget +" en bezit de volgende games:\n";
		for(int i = 0; i < mijnGames.size(); i++) {
			s += mijnGames.get(i);
		}
		return s;
	}
}
