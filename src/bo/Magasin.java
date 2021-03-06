package bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magasin {
	private List<Vehicule> listeVehicule = new ArrayList<>();
	private List<Location> listeLocation = new ArrayList<Location>();
	private List<Client> listeClient = new ArrayList<Client>();
	
	static Scanner sc = new Scanner(System.in);
	
	
	public List<Location> getListeLocation() {
		return listeLocation;
	}

	public void setListeLocation(List<Location> listeLocation) {
		this.listeLocation = listeLocation;
	}

	public void ajouterLocation(Location location) {
		listeLocation.add(location);
	}
	
	public void consulterLocationEnCours() {
		List<Location> listeLocationEnCours = new ArrayList<>();
		for(Location current : listeLocation) {
			if(current.getDateFin() == null) {
				listeLocationEnCours.add(current);
			}
		}
		System.out.println("ð¸ð¸ð¸ð¸ð¸ð¸ð¸ð¸ð¸ð¸ð¸Location En Coursð¸ð¸ð¸ð¸ð¸ð¸ð¸ð¸ð¸ð¸ð¸");
		for(Location current : listeLocationEnCours) {
			System.out.println("ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾ð§¾");
			current.afficher();		
		}
	}
	
	public double facturesClientNonReglees(Client client) {
		double montantTotal = 0;
		for(Location current : listeLocation) {
			if(current.getClient().equals(client) && !current.isEstRegle()) {
				montantTotal += current.calculerMontant();
			}
		}
		return montantTotal;
	}
	
	
	public List<Vehicule> getListeVehicule() {
		return listeVehicule;
	}

	public void setListeVehicule(List<Vehicule> listeVehicule) {
		this.listeVehicule = listeVehicule;
	}
	
	
	
	public Magasin(List<Vehicule> listeVehicule) {
		this.listeVehicule = listeVehicule;
	}

	public Magasin() {
		// TODO Auto-generated constructor stub
	}

	public void ajouterVehicule(Vehicule vehicule) {
		listeVehicule.add(vehicule);
	}
	
	public void afficherVehicule() {

		System.out.println("ð²ð²ð²ð²ð²ð²ð²ð²ð²ð²ð²ð²Liste des Articlesð²ð²ð²ð²ð²ð²ð²ð²ð²ð²ð²ð²");
		for(int i = 0; i < listeVehicule.size(); i++) {
			System.out.println(i);
			System.out.println(listeVehicule.get(i).toString());
			
		}
		
	}
	
	public List<Vehicule> chercherVehicule(String nomModele){
		List<Vehicule> listeVehiculeTrouve = new ArrayList<>();
		for(Vehicule current : listeVehicule) {
			if(current.getModele().contains(nomModele)) {
				listeVehiculeTrouve.add(current);
			}
		}
		return listeVehiculeTrouve;
	}
	
	public void rechercheVehicule() {
		
		String recherche = "";
		System.out.println("Veuillez rentrer le nom du modÃ¨le Ã  rechercher :");
		
		recherche = sc.nextLine();
		afficherVehicule(chercherVehicule(recherche));
	}
	
	public static void afficherVehicule(List<Vehicule> listeVehiculeTrouve) {

		System.out.println("ð²ð²ð²ð²ð²ð²ð²ð²ð²ð²ð²ð²Liste des Articlesð²ð²ð²ð²ð²ð²ð²ð²ð²ð²ð²ð²");
		for(int i = 0; i < listeVehiculeTrouve.size(); i++) {
			System.out.println(i);
			System.out.println(listeVehiculeTrouve.get(i).toString());
		}
	}
	
	public void creerArticle() {
		int choix = -1;
		
		System.out.println("Voulez vous entrer :");
		System.out.println("1 - Velo");
		System.out.println("2 - Gyropode");
		System.out.println("3 - Gyroroue");
		choix = sc.nextInt();
		System.out.println("Veuillez entrer la marque :");
		sc.nextLine();
		String marque = sc.nextLine();
		System.out.println("Veuillez entrer le modÃ¨le :");
		String modele = sc.nextLine();
		LocalDate date = LocalDate.now();
			switch(choix) {
				case 1 :{
					System.out.println("Veuillez entrer le nombre de vitesses");
					int vitesse = sc.nextInt();
					Velo velo = new Velo(marque,modele,date,vitesse);
					ajouterVehicule(velo);
					break;
				}
				case 2 :{
					System.out.println("Veuillez entrer l'autonomie");
					int autonomie = sc.nextInt();
					System.out.println("Veuillez entrer la taille minimum");
					double taillemin = sc.nextDouble();
					Gyropode gyropode = new Gyropode(marque,modele,date,autonomie,taillemin);
					ajouterVehicule(gyropode);
					break;
				}
				case 3 :{
					System.out.println("Veuillez entrer l'autonomie");
					int autonomie = sc.nextInt();
					Gyroroue gyroroue = new Gyroroue(marque,modele,date,autonomie);
					ajouterVehicule(gyroroue);
					break;
				}default :{
					System.out.println("Veuillez entrer une valeur correcte");
				}
			}
		
	}
	

	public void supprimerVehicule(Vehicule vehicule) {

				listeVehicule.remove(vehicule);
			
		
	}
	
	public void supprimerArticle() {
		int choix = -1;
		System.out.println("Voici la liste des articles, tapez le numÃ©ro devant l'article que vous souhaitez supprimer :");
		afficherVehicule();
		System.out.println("Quel article supprimer ?");
		choix = sc.nextInt();
		supprimerVehicule(listeVehicule.get(choix));
		System.out.println("Article supprimÃ©");
		
	}

	public List<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}

	public void ajouterClient(Client client) {
		listeClient.add(client);
	}
	
	public void rechercheClient() {
		System.out.println("Veuillez saisir un nom de client");
		String nom = sc.nextLine();
		afficherClient(chercheClient(nom));
	}
	
	public List<Client> chercheClient(String nom) {
		List<Client> cRecherche = new ArrayList<Client>();
		for(Client current : listeClient) {
			if(current.getNom().contains(nom)) {
				cRecherche.add(current);
			}
		}
		return cRecherche;
	}
	
	public static void afficherClient(List<Client> listeClient) {
		System.out.println("ð¦ð§ð¨ð©ðµð´ð¨âð¦³ð©âð¦³ð¤´ð¸Liste de clients correspondantsð¸ð¤´ð©âð¦³ð¨âð¦³ð´ðµð©ð¨ð§ð¦");
		for(Client current : listeClient) {
			current.afficher();
		}
	}
	
	public void afficherClient() {
		System.out.println("ð¦ð§ð¨ð©ðµð´ð¨âð¦³ð©âð¦³ð¤´ð¸Liste de clients correspondantsð¸ð¤´ð©âð¦³ð¨âð¦³ð´ðµð©ð¨ð§ð¦");
		for(int i = 0; i < listeClient.size(); i++) {
			System.out.println(i);
			getListeClient().get(i).afficher();
		}
	}
	
	
	
	
}
