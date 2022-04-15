package fr.system;

import java.time.LocalDate;

public class Gyropode extends Gyro {
	private final static double tarif = 18.90;
	private double tailleMin;
	
	public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, double tailleMin) {
		super(marque, modele, dateAchat, autonomie);
		this.tailleMin = tailleMin;
	}

	public double getTailleMin() {
		return tailleMin;
	}

	public void setTailleMin(double tailleMin) {
		this.tailleMin = tailleMin;
	}

	@Override
	public void afficher() {
		System.out.println("---------------------------Gyropode---------------------------" );
		System.out.println("Marque         : " + this.marque);
		System.out.println("Modèle         : "+ this.modele);
		System.out.println("Date d'achat   : " + this.dateAchat);
		System.out.println("Tarif          : " + tarif + " euros/heure");
		System.out.println("Autonomie      : " + this.autonomie);
		System.out.println("Taille Minimum : " + this.tailleMin);
		
	}
	
}
