package model;

public class FormulaireHotel extends Formulaire {
	private int nbLitsS;
	private int nbLitsD;
	
	public FormulaireHotel(int jour, int mois, int nbLitsS, int nbLitsD) {
		super(jour, mois);
		this.nbLitsS = nbLitsS;
		this.nbLitsD = nbLitsD;
	}

	public int getNbLitsS() {
		return nbLitsS;
	}

	public int getNbLitsD() {
		return nbLitsD;
	}
}
