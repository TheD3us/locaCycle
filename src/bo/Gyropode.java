package bo;

import java.time.LocalDate;

public class Gyropode extends Gyro {
	private final static double tarif = 18.90;
	private double tailleMin;
	
	public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, double tailleMin) {
		super(marque, modele, dateAchat, autonomie);
		this.tailleMin = tailleMin;
	}

	public Gyropode() {
		// TODO Auto-generated constructor stub
	}

	public double getTailleMin() {
		return tailleMin;
	}

	public void setTailleMin(double tailleMin) {
		this.tailleMin = tailleMin;
	}

	@Override
	public String toString() {
		String resultat = "Gyropode ";
		resultat += super.toString();
		resultat += "Taille Minimum   : " + this.tailleMin + "\n";
		return resultat;
	}

	@Override
	public double getTarif() {
		return tarif;
	}
	
}
