package model;

public class FormulaireRestaurant extends Formulaire {
	private int nbPers;
	private int numService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPers, int numService) {
		super(jour, mois);
		this.nbPers = nbPers;
		this.numService = numService;
	}

	public int getNombrePersonnes() {
		return nbPers;
	}

	public int getNumService() {
		return numService;
	}
}
