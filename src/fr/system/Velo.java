package fr.system;

import java.time.LocalDate;

public class Velo extends Vehicule {
	
	private int changementDeVitesse;
	private static double tarif = 4.90;

	
	
	

	public Velo(String marque, String modele, LocalDate dateAchat, int changementDeVitesse) {
		super(marque, modele, dateAchat);
		this.changementDeVitesse = changementDeVitesse;
	}

	public static double getTarif() {
		return tarif;
	}

	public static void setTarif(double tarif) {
		Velo.tarif = tarif;
	}

	public int getChangementDeVitesse() {
		return changementDeVitesse;
	}

	public void setChangementDeVitesse(int changementDeVitesse) {
		this.changementDeVitesse = changementDeVitesse;
	}



	@Override
	public void afficher() {
		System.out.println("---------------------------Vélo---------------------------" );
		System.out.println("Marque       : " + this.marque);
		System.out.println("Modèle       : "+ this.modele);
		System.out.println("Date d'achat : " + this.dateAchat);
		System.out.println("Tarif        : " + tarif);
		System.out.println("Vitesses     : " + this.changementDeVitesse);
		
	}
	
}
