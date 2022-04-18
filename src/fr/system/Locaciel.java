package fr.system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bo.Adresse;
import bo.Client;
import bo.Gyropode;
import bo.Gyroroue;
import bo.Location;
import bo.Magasin;
import bo.Vehicule;
import bo.Velo;

public class Locaciel {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Velo velo1 = new Velo("Yamaha", "Be-546", LocalDate.of(2019, 05, 20), 5);
		Velo velo3 = new Velo("Yamaha", "Be-546", LocalDate.of(2018, 05, 20), 5);
		Velo velo2 = new Velo("Yamaha", "V-45-y", LocalDate.of(2018, 07, 18), 7);
		
		Gyroroue gyro1 = new Gyroroue("Epson", "Re-197", LocalDate.of(2020, 12, 2), 250);
		Gyroroue gyro2 = new Gyroroue("Toyota", "Build4", LocalDate.of(2019, 01, 03), 190);
		
		Gyropode gyro3 = new Gyropode("Gaia", "Lp45", LocalDate.of(2019, 11, 05),200,170);
		List<Vehicule> listeVehicule = new ArrayList<Vehicule>();
		Magasin mag1 = new Magasin(listeVehicule);
		mag1.ajouterVehicule(velo1);
		mag1.ajouterVehicule(velo2);
		mag1.ajouterVehicule(velo3);
		mag1.ajouterVehicule(gyro1);
		mag1.ajouterVehicule(gyro2);
		mag1.ajouterVehicule(gyro3);
		
		
		Adresse ad01 = new Adresse(10, "ter", "rue", "De la Coursive", "79800", "Sainte Verge", "3", "2");
		Adresse ad02 = new Adresse(7, "rue", "Augustin Truveau", "85000", "Paillasson les Bains");
		Adresse ad03 = new Adresse(6, "avenue", "Guillaume Tell", "83200", "Bonlieu");
		Client cli1 = new Client("Leblanc", "Leonard", ad01, null);
		Client cli2 = new Client("Nurte", "Nathan", ad02, null);
		Client cli3 = new Client("Marron", "Claire", ad03, null);
		
		Location loc1 = new Location(cli1,gyro3);
		Location loc2 = new Location(cli2, velo3);
		Location loc3 = new Location(cli3, velo3);
		mag1.ajouterLocation(loc1);
		mag1.ajouterLocation(loc2);
		mag1.ajouterLocation(loc3);
		mag1.getListeLocation().get(1).isEstRegle();
		mag1.getListeLocation().get(1).terminerLocation();
		int choix = -1;
		
		while(choix != 0) {
		System.out.println("⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜Bienvenue sur Locaciel⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜⚜");
		System.out.println("Faites votre choix :");
		System.out.println("1 - Chercher un article");
		System.out.println("2 - Créer un article");
		System.out.println("3 - Supprimer un article");
		System.out.println("4 - Locations en cours");
		
		choix = sc.nextInt();
			switch(choix) {
				case 1:{
					mag1.rechercheVehicule();
					break;
				}
				case 2:{
					mag1.creerArticle();
					break;
				}
				case 3:{
					mag1.supprimerArticle();
					break;
				}
				case 4:{
					mag1.consulterLocationEnCours();
					break;
				}
			}
		}
}
	

}
