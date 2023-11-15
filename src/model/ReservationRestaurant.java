package model;

public class ReservationRestaurant extends Reservation {
	private int numeroService;
	private int numeroTableRes;
	
	public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTableRes) {
		super(jour, mois);
		this.numeroService = numeroService;
		this.numeroTableRes = numeroTableRes;
	}
	
	@Override
	public String toString() {
		StringBuilder msg = new StringBuilder(super.toString()+"table n°"+numeroTableRes+" pour le ");
		if (numeroService == 0) {
			msg.append("premier service.");
		} else {
			msg.append("deuxième service.");
		}
		return msg.toString();
	}
}
