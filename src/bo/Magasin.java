package bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magasin {
	private List<Vehicule> listeVehicule = new ArrayList<>();
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
	
	public void afficherVehicule() {

		System.out.println("🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲Liste des Articles🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲🚲");
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
	

	public void supprimerVehicule(Vehicule vehicule) {

				listeVehicule.remove(vehicule);
			
		
	}
}
