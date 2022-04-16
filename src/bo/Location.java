package bo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Location {
	private LocalDateTime dateDebut;
	private LocalDateTime dateFin;
	private Client client;
	private Vehicule vehicule;
	private boolean estRegle = false;
	
	
	
	
	public Location( Client client, Vehicule vehicule) {
		this.dateDebut = LocalDateTime.now();
		this.client = client;
		this.vehicule = vehicule;
	}
	
	public Location(Location location) {
		this(location.getClient(), location.vehicule);
	}
	public LocalDateTime getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDateTime getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public boolean isEstRegle() {
		return estRegle;
	}
	public void setEstRegle(boolean estRegle) {
		this.estRegle = estRegle;
	}
	
	public void terminerLocation() {
		setDateFin(LocalDateTime.now());
	}
	
	public double calculerMontant() {
		double diff = 0;
		if(getDateFin() != null) {
		diff = ChronoUnit.HOURS.between( getDateDebut(), getDateFin());
		}else {

			diff = ChronoUnit.HOURS.between(  getDateDebut() ,LocalDateTime.now());
		}
		return vehicule.getTarif() * diff;
	}
	
	public void afficher() {
		System.out.println("***************Location***************");
		System.out.println("Date de début :" + this.dateDebut.getDayOfMonth() + "/" + this.dateDebut.getMonthValue() + "/" + this.dateDebut.getYear() + " a " + 
		this.dateDebut.getHour() + ":" + this.dateDebut.getMinute() + ":" + this.dateDebut.getSecond());
		if(this.dateFin == null) {
			System.out.println("En cours de location");
		}else {
		System.out.println("Date de fin   :" + this.dateFin);
		}
		this.client.afficher();
		this.vehicule.toString();
		if(estRegle == true) {
			System.out.println("Facture réglée " + calculerMontant() + " euros");
		}else {
			System.out.println("En attente de paiement");
		}
		
	}
}
