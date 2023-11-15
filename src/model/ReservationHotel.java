package model;

public class ReservationHotel extends Reservation {
	private int nbLitsS;
	private int nbLitsD;
	private int numeroChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitsS, int nbLitsD, int numeroChambre) {
		super(jour, mois);
		this.nbLitsS = nbLitsS;
		this.nbLitsD = nbLitsD;
		this.numeroChambre = numeroChambre;
	}
}
