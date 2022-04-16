package bo;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private Adresse adresse;
	private List<Location> listeLocation = new ArrayList<Location>();
	
	
	
	public Client(String nom, String prenom, Adresse adresse, List<Location> listeLocation) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.listeLocation = listeLocation;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public List<Location> getListeLocation() {
		return listeLocation;
	}
	public void setListeLocation(List<Location> listeLocation) {
		this.listeLocation = listeLocation;
	}
	
	public void afficher() {
		System.out.println("***************Client***************");
		System.out.println("Nom : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		adresse.afficher();
	}
}
