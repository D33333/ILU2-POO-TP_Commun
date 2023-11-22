package model;

public class CentraleReservation <T extends Formulaire, E extends EntiteReservable<T>> {
	private E[] entites;
	private int nbEntites;
	
	public CentraleReservation(E[] entites) {
		this.entites = entites;
		nbEntites = 0;
	}
	
	public int ajouterEntite(E entite) {
		entites[nbEntites] = entite;
		nbEntites++;
		return nbEntites;
	}
	
	public int[] donnerPossibilites(T formulaire) {
		int[] possibilites = new int[nbEntites];
		for (int i = 0; i < nbEntites; i++) {
			E entite = entites[i];
			if (entite.estLibre(formulaire)) {
				possibilites[i] = entite.getNumero();
			} else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}
	
	public Reservation reserver(int numero, T formulaire) {
		E entite = entites[numero];
		formulaire.setNumeroEntite(numero);
		return entite.reserver(formulaire);
	}
}
