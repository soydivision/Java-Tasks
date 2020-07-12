package collections;

import java.util.Arrays;
import java.util.List;

import collections.taxiTypes.*;

public class Main {

	static List<Car> taxies = Arrays.asList(new Taxi("Priora", 9, 6200, 220, TaxiType.STANDART),
			new Taxi("nexia", 10, 6100, 180, TaxiType.STANDART),
			new Taxi("Mercedes-Benz E-Class", 10, 55000, 242, TaxiType.LUXURY),
			new Taxi("Volvo S90", 9, 47350, 209, TaxiType.LUXURY), 
			new Taxi("Lexus ES", 9, 40000, 210, TaxiType.LUXURY),
			new Taxi("Skoda Octavia", 6, 37000, 231, TaxiType.BUSINESS)
			
	);

	public static void main(String[] args) {
		int totalCost = 0;
		
	}

}
