package model;

public class ReservationSpectacle extends Reservation {
	private int numeroZone;
	private int numeroChaise;
	
	private ReservationSpectacle(int jours, int mois, int numeroZone, int numeroChaise) {
		super(jours,mois);
		this.numeroZone = numeroZone;
		this.numeroChaise = numeroChaise;
	}
}
