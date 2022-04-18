package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import bo.Adresse;
import bo.Client;
import bo.Gyropode;
import bo.Gyroroue;
import bo.Location;
import bo.Magasin;
import bo.Vehicule;
import bo.Velo;

public class TestCyclo {

	public static void main(String[] args) {
		Velo velo1 = new Velo("Yamaha", "Be-546", LocalDate.of(2019, 05, 20), 5);
		Velo velo2 = new Velo("Yamaha", "V-45-y", LocalDate.of(2018, 07, 18), 7);
		
		Gyroroue gyro1 = new Gyroroue("Epson", "Re-197", LocalDate.of(2020, 12, 2), 250);
		Gyroroue gyro2 = new Gyroroue("Toyota", "Build4", LocalDate.of(2019, 01, 03), 190);
		
		Gyropode gyro3 = new Gyropode("Gaia", "Lp45", LocalDate.of(2019, 11, 05),200,170);
		List<Vehicule> listeVehicule = new ArrayList<Vehicule>();
		Magasin mag1 = new Magasin(listeVehicule);
		mag1.ajouterVehicule(velo1);
		mag1.ajouterVehicule(velo2);
		mag1.ajouterVehicule(gyro1);
		mag1.ajouterVehicule(gyro2);
		mag1.ajouterVehicule(gyro3);
		
		
		Adresse ad01 = new Adresse(10, "ter", "rue", "De la Coursive", "79800", "Sainte Verge", "3", "2");
		Adresse ad02 = new Adresse(7, "rue", "Augustin Truveau", "85000", "Paillasson les Bains");
		Adresse ad03 = new Adresse(6, "avenue", "Guillaume Tell", "83200", "Bonlieu");
		Client cli1 = new Client("Leblanc", "Leonard", ad01, null);
		Location loc1 = new Location(cli1,velo1);
		mag1.afficherVehicule();
		loc1.afficher();
		loc1.setDateFin(LocalDateTime.of(2022, 04, 16, 16, 50));
		loc1.setEstRegle(true);
		loc1.afficher();
		
		
	}

}
