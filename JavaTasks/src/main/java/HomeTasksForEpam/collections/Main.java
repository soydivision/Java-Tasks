package collections;

import java.util.Arrays;
import java.util.List;

import collections.taxiTypes.*;

public class Main {

	static List<Car> taxi = Arrays.asList(new Taxi("Taz", 9, 6200, 220, TaxiType.STANDART),
			new Taxi("Maz", 10, 6100, 180, TaxiType.STANDART),
			new Taxi("Mercedes-Benz E-Class", 10, 55000, 242, TaxiType.LUXURY)

	);

	public static void main(String[] args) {
		int totalCost = 0;

	}

}
