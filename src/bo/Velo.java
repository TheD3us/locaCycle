package bo;

import java.time.LocalDate;

public class Velo extends Vehicule {
	
	private int changementDeVitesse;
	private static double tarif = 4.90;

	
	
	

	public Velo() {
	}

	public Velo(String marque, String modele, LocalDate dateAchat, int changementDeVitesse) {
		super(marque, modele, dateAchat);
		this.changementDeVitesse = changementDeVitesse;
	}

	public double getTarif() {
		return tarif;
	}

	public int getChangementDeVitesse() {
		return changementDeVitesse;
	}

	public void setChangementDeVitesse(int changementDeVitesse) {
		this.changementDeVitesse = changementDeVitesse;
	}



	@Override
	public String toString() {
		String resultat = "Velo ";
		resultat += super.toString();
		resultat += "Vitesses     : " + this.changementDeVitesse + "\n";
		return resultat;
	}
}
