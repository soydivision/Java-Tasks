package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaxiPark {
	private List<? extends Car> taxies;

	public TaxiPark(List<? extends Car> taxies) {
		this.taxies = taxies;
	}

	public List<? extends Car> getCars() {
		return taxies;
	}

	public List<Taxi> getTaxiCars() {
		List<Taxi> TaxiCars = new ArrayList<>();
		for (Car taxi : taxies) {
			if (taxi instanceof Taxi) {
				TaxiCars.add((Taxi) taxi);
			}
		}
		return TaxiCars;
	}

	public List<VanTaxi> getVanTaxies() {
		List<VanTaxi> VanTaxies = new ArrayList<>();
		for (Car taxi : taxies) {
			if (taxi instanceof VanTaxi) {
				VanTaxies.add((VanTaxi) taxi);
			}
		}
		return VanTaxies;
	}

	public TaxiPark sortByFuelConsumption() {
		Collections.sort(taxies, new Comparator<Car>() {
			public int compare(Car o1, Car o2) {
				return o1.getfuelConsumption() - o2.getfuelConsumption();
			}
		});
		return this;
	}

	public Taxi getMaxSpeedTaxi() {
		List<Taxi> taxies = getTaxiCars();
		Taxi taxiWithMaxSpeed = taxies.get(0);
		for (int i = 0; i < taxies.size(); i++) {
			if (taxies.get(i).getMaxSpeed() > taxiWithMaxSpeed.getMaxSpeed()) {
				taxiWithMaxSpeed = taxies.get(i);
			}
		}
		return taxiWithMaxSpeed;
	}

	public VanTaxi getMaxSpeedVanTaxi() {
		List<VanTaxi> vanTaxies = getVanTaxies();
		VanTaxi vanTaxiWithMaxSpeed = vanTaxies.get(0);
		
	}

}
