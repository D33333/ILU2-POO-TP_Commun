package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int numeroEntite;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getNumeroEntite() {
		return numeroEntite;
	}

	public void setNumeroEntite(int numeroEntite) {
		this.numeroEntite = numeroEntite;
	}
}