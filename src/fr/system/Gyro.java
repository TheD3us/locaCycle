package fr.system;

import java.time.LocalDate;

public abstract class Gyro extends Vehicule {
	protected int autonomie;
	
	

	public Gyro(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat);
		this.autonomie = autonomie;
	}

	public int getAutonomie() {
		return autonomie;
	}

	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}


	
	
}
