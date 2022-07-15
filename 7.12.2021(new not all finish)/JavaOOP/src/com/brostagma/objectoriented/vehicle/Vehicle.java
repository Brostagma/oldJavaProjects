package com.brostagma.objectoriented.vehicle;

public class Vehicle implements Engine {

	int numberOfSeats;
	int numberOfWheels;
	boolean isStatusOfEngine;
	String statusOfEngine;
	String nameOfVehicle;
	
	public void start() {
		System.out.println(statusOfEngine = isStatusOfEngine ? getNameOfVehicle() + " zaten çalışıyor." : getNameOfVehicle() + " çalıştırıldı.");
		isStatusOfEngine = true;
		
	}

	public void stop() {
		System.out.println(statusOfEngine = isStatusOfEngine ? getNameOfVehicle() + " durduruldu." : getNameOfVehicle() + " zaten çalışmıyor.");
		isStatusOfEngine = false;
	}

	// Getters
	public int getNumberOfSeats() {
		System.out.println(getNameOfVehicle() + " Koltuk Sayısı : " + numberOfSeats);
		return numberOfSeats;
	}

	public int getNumberOfWheels() {
		System.out.println(getNameOfVehicle() + " Teker Sayısı : " + numberOfWheels);
		return numberOfWheels;
	}

	public String getNameOfVehicle() {
		return nameOfVehicle = nameOfVehicle == null ? "İsimsiz araç:" : nameOfVehicle;
	}

	// Setters
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public void setNameOfVehicle(String nameOfVehicle) {
		this.nameOfVehicle = nameOfVehicle;
	}

}
