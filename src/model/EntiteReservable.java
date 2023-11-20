package model;

public class EntiteReservable <T extends Formulaire> {
	private CalendrierAnnuel calendrier;
	private Entite identifiant;
	
	public EntiteReservable(T formulaire) {
	}
	
	public int getNumero() {
		return identifiant.getNumero();
	}
	
	public void setNumero(int numero) {
		identifiant.setNumero(numero);
	}
	
	public boolean estLibre(T formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
}
