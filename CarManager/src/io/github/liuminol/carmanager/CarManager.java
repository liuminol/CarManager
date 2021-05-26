package io.github.liuminol.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new PassengerCar("Toyota Prius1", 2008, 15000, 1200, Color.GREEN);

		Car renault = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);

		Car renault2 = new PassengerCar("Renault Laguna", 2000, 9700, 1600, Color.WHITE);

		List<Car> cars = new ArrayList<>();
		
		cars.add(prius);
		cars.add(renault);
		cars.add(renault2);
		
		System.out.println(cars);
		
		prius.addDistance(-2000);
		prius.addDistance(100.6);
		prius.addDistance(15000);
		
		System.out.println("Need service? - " + prius.isReadyToService());

		System.out.println(prius);
		System.out.println(renault);
		System.out.println(renault2);
		System.out.println(renault.equals(renault2));
		System.out.println(prius.equals(renault2));

		/**
		ArrayList<Car> cars = new ArrayList<Car>();
		
		cars.add(prius);
		cars.add(renault);
		cars.add(renault2);
		
		System.out.println(cars);
		*/
	}

}
