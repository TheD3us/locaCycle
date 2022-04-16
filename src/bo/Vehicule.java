package bo;

import java.time.LocalDate;

public abstract class Vehicule {
	protected String marque;
	protected String modele;
	protected LocalDate dateAchat;
	
	public abstract double getTarif();
	
	
	public Vehicule() {
	}


	public Vehicule(String marque, String modele, LocalDate dateAchat) {
		this.marque = marque;
		this.modele = modele;
		this.dateAchat = dateAchat;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public LocalDate getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}
	@Override
	public String toString() {
		String resultat = "";
		resultat += "Marque         : " + this.marque + "\n";
		resultat +="Modèle         : "+ this.modele+ "\n";
		resultat +="Date d'achat   : " + this.dateAchat+ "\n";
		resultat +="Tarif          : " + getTarif() + " euros/heure"+ "\n";
		return resultat;
	}
	

}
