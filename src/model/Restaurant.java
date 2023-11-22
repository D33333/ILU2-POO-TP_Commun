package model;

public class Restaurant {
	
	private CentraleReservation<FormulaireRestaurant,EntiteReservable<FormulaireRestaurant>>  centrale;
	
	public Restaurant() {
		this.centrale = new CentraleReservation<FormulaireRestaurant,EntiteReservable<FormulaireRestaurant>>(new Restaurant[] {});
	}
	
	private class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService;
		
		public Table(int nbChaises) {
			super();
			this.nbChaises = nbChaises;
		}
		
		@Override
		public boolean compatible(FormulaireRestaurant formulaireRestaurant) {
			int nbConvives = formulaireRestaurant.getNombrePersonnes();
			if(nbChaises == nbConvives || nbChaises == nbConvives+1) {
				if (formulaireRestaurant.getNumService() == 1) {
					if (estLibre(formulaireRestaurant)) {
						return true;
					}
				} else { //deuxième service
					boolean deuxiemeServiceLibre = calendrierDeuxiemeService.estLibre(formulaireRestaurant.getJour(), formulaireRestaurant.getMois());
					if (deuxiemeServiceLibre) {
						return true;
					}
				}
			}
			return false;
		}
		
		@Override
		public Reservation reserver(FormulaireRestaurant formulaireRestaurant) {
			boolean resAboutie;
			if (formulaireRestaurant.getNumService() == 1) {
				resAboutie = calendrier.reserver(formulaireRestaurant.getJour(), formulaireRestaurant.getMois());
			} else { //deuxième service
				resAboutie = calendrierDeuxiemeService.reserver(formulaireRestaurant.getJour(), formulaireRestaurant.getMois());
			}
			if (resAboutie) {
				return new ReservationRestaurant(formulaireRestaurant.getJour(), formulaireRestaurant.getMois(), formulaireRestaurant.getNumService(), formulaireRestaurant.getNumeroEntite());
			}
			return null;
		}
	}
	
	public void ajouterTable(int nbChaises) {
		Table table = new Table(nbChaises);
		int numero = centrale.ajouterEntite(table);
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}
	
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		return centrale.reserver(numEntite, formulaire);
	}
}
