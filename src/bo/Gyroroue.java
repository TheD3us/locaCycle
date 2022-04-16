package bo;

import java.time.LocalDate;

public class Gyroroue extends Gyro {
	
	private static final double tarif = 29.90;
	
	public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat, autonomie);
		
	}

	public Gyroroue() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String resultat = "Gyroroue ";
		resultat += super.toString();
		return resultat;
	}

	@Override
	public double getTarif() {
		// TODO Auto-generated method stub
		return tarif;
	}

}
