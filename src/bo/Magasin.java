package bo;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
	private List<Vehicule> listeVehicule = new ArrayList<Vehicule>();
	private List<Location> listeLocation = new ArrayList<Location>();
	
	
	public List<Location> getListeLocation() {
		return listeLocation;
	}

	public void setListeLocation(List<Location> listeLocation) {
		this.listeLocation = listeLocation;
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
	
	public void afficher(List<Vehicule> listeVehicules) {
		for(Vehicule current : listeVehicules) {
			System.out.println(current.toString());
		}
		for(Location current : listeLocation) {
			current.afficher();
		}
	}
	
	public Vehicule chercherVehicule(String nomModèle) {
		
		
		for(Vehicule current : listeVehicule) {
			if(current.getModele().equals(nomModèle) && current instanceof Velo) {
				Velo recherche = new Velo();
				recherche = (Velo) current;
				return recherche;
			}
			else if(current.getModele().equals(nomModèle) && current instanceof Gyropode) {
				Gyropode recherche = new Gyropode();
				recherche = (Gyropode) current;
				return recherche;
			}
			else if(current.getModele().equals(nomModèle) && current instanceof Gyroroue) {
				Gyroroue recherche = new Gyroroue();
				recherche = (Gyroroue) current;
				return recherche;
			}else {
				System.out.println("...");
			}
			
		
		}
		
		return null;
		
	}
}
