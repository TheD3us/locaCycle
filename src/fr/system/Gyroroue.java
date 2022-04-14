package fr.system;

import java.time.LocalDate;

public class Gyroroue extends Gyro {
	
	private static final double tarif = 29.90;
	
	public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat, autonomie);
		
	}

	@Override
	public void afficher() {
		System.out.println("---------------------------Gyropode---------------------------" );
		System.out.println("Marque         : " + this.marque);
		System.out.println("Modèle         : "+ this.modele);
		System.out.println("Date d'achat   : " + this.dateAchat);
		System.out.println("Tarif          : " + tarif);
		System.out.println("Autonomie      : " + this.autonomie);
		
	}

}
