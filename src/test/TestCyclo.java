package test;

import java.time.LocalDate;

import fr.system.Gyropode;
import fr.system.Gyroroue;
import fr.system.Velo;

public class TestCyclo {

	public static void main(String[] args) {
		Velo velo1 = new Velo("Yamaha", "Be-546", LocalDate.of(2019, 05, 20), 5);
		Velo velo2 = new Velo("Yamaha", "V-45-y", LocalDate.of(2018, 07, 18), 7);
		
		Gyroroue gyro1 = new Gyroroue("Epson", "Re-197", LocalDate.of(2020, 12, 2), 250);
		Gyroroue gyro2 = new Gyroroue("Toyota", "Build4", LocalDate.of(2019, 01, 03), 190);
		
		Gyropode gyro3 = new Gyropode("Gaia", "Lp45", LocalDate.of(2019, 11, 05),200,170);
		
		velo1.afficher();
		velo2.afficher();
		gyro1.afficher();
		gyro2.afficher();
		gyro3.afficher();
		
		
	}

}
