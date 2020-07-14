package collections;

import java.util.Arrays;
import java.util.List;

import collections.taxiTypes.*;
import collections.TaxiPark;

public class Main {

	static List<Car> taxies = Arrays.asList(new TaxiCab("Priora", 9, 6200, 220, TaxiType.STANDART),
			new TaxiCab("nexia", 10, 6100, 180, TaxiType.STANDART),
			new TaxiCab("Mercedes-Benz E-Class", 10, 55000, 242, TaxiType.LUXURY),
			new TaxiCab("Volvo S90", 9, 47350, 209, TaxiType.LUXURY),
			new TaxiCab("Lexus ES", 9, 40000, 210, TaxiType.LUXURY),
			new TaxiCab("Skoda Octavia", 6, 37000, 231, TaxiType.BUSINESS),
			new TaxiVan("Toyota Sienna", 10, 31640, 193, TaxiVanType.FOREIGHTPEOPLE));

	public static void main(String[] args) {
		int cost = 0;
		TaxiPark taxiPark = new TaxiPark(taxies);
		TaxiPark taxiCabs = new TaxiPark(taxiPark.getTaxiCars());
		TaxiPark taxiVans = new TaxiPark(taxiPark.getTaxiVans());

		System.out.println("Taxi cabs sorted by max fuel consumption: " + taxiCabs.sortByFuelConsumption());
		System.out.println("Taxi vans sorted by max fuel consumption: " + taxiVans.sortByFuelConsumption());
		System.out.println("Taxi cab with max speed: " + taxiCabs.getMaxSpeedTaxiCab());
		System.out.println("Taxi van with max speed: " + taxiVans.getMaxSpeedTaxiVan());
		System.out.println(
				"Taxipark total cost: " + (cost = taxiCabs.getTaxiCabsTotalCost() + taxiVans.getTaxiVansTotalCost()));
	}

}
