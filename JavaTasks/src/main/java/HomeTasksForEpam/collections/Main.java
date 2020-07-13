package collections;

import java.util.Arrays;
import java.util.List;

import collections.taxiTypes.*;

public class Main {

	static List<Car> taxies = Arrays.asList(new TaxiCab("Priora", 9, 6200, 220, TaxiType.STANDART),
			new TaxiCab("nexia", 10, 6100, 180, TaxiType.STANDART),
			new TaxiCab("Mercedes-Benz E-Class", 10, 55000, 242, TaxiType.LUXURY),
			new TaxiCab("Volvo S90", 9, 47350, 209, TaxiType.LUXURY),
			new TaxiCab("Lexus ES", 9, 40000, 210, TaxiType.LUXURY),
			new TaxiCab("Skoda Octavia", 6, 37000, 231, TaxiType.BUSINESS)

	);

	public static void main(String[] args) {
		int totalCost = 0;

	}

}
