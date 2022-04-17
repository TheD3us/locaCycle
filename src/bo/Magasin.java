package bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magasin {
	private Map<Integer,Vehicule> listeVehicule = new HashMap<>();
	private List<Location> listeLocation = new ArrayList<Location>();
	private static int compteur = 0;
	
	public List<Location> getListeLocation() {
		return listeLocation;
	}

	public void setListeLocation(List<Location> listeLocation) {
		this.listeLocation = listeLocation;
	}

	
	
	public Map<Integer, Vehicule> getListeVehicule() {
		return listeVehicule;
	}

	public void setListeVehicule(Map<Integer, Vehicule> listeVehicule) {
		this.listeVehicule = listeVehicule;
	}
	
	
	
	public Magasin(Map<Integer, Vehicule> listeVehicule) {
		this.listeVehicule = listeVehicule;
	}

	public Magasin() {
		// TODO Auto-generated constructor stub
	}

	public void ajouterVehicule(Vehicule vehicule) {
		listeVehicule.put(compteur,vehicule);
		compteur ++;
	}
	
	public void afficherVehicule() {

		System.out.println("🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲Liste des Articles🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲");
		for(Map.Entry current : listeVehicule.entrySet()) {
			System.out.println(current.getKey());
			System.out.println(current.getValue().toString());
			
		}
		
	}
	
	public Vehicule chercherVehicule(String nomModèle) {
		
		
		for(Map.Entry current : listeVehicule.entrySet()) {
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
	
	public void supprimerVehicule(Vehicule vehicule) {

				listeVehicule.remove(vehicule);
			
		
	}
}
