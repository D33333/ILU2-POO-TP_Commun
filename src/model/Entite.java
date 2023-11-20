package model;

public enum Entite {
	RESTAURANT(0), HOTEL(1), SPECTACLE(2);
	
	private int numero;
	
	private Entite(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		if (numero == 0) {
			return "restaurant";
		} else if (numero == 1) {
			return "hotel";
		} else {
			return "spectacle";
		}
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
}