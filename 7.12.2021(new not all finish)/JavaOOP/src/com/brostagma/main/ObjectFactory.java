/**
 * 
 */
package com.brostagma.main;

import com.brostagma.objectoriented.vehicle.Bus;
import com.brostagma.objectoriented.vehicle.Car;

/**
 * @author brostagma
 *
 */
public class ObjectFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setNameOfVehicle("Araba");
		car.setNumberOfSeats(4);
		car.setNumberOfWheels(4);
		Bus bus = new Bus();
		bus.setNameOfVehicle("Otobüs");
		bus.setNumberOfSeats(14);
		bus.setNumberOfWheels(6);

		car.start();
		bus.start();

		car.start();
		bus.start();
		
		car.stop();
		bus.stop();
		
		car.stop();
		bus.stop();
		
	}

}
