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

	public List<TaxiCab> getTaxiCars() {
		List<TaxiCab> TaxiCars = new ArrayList<>();
		for (Car taxi : taxies) {
			if (taxi instanceof TaxiCab) {
				TaxiCars.add((TaxiCab) taxi);
			}
		}
		return TaxiCars;
	}

	public List<TaxiVan> getVanTaxies() {
		List<TaxiVan> VanTaxies = new ArrayList<>();
		for (Car taxi : taxies) {
			if (taxi instanceof TaxiVan) {
				VanTaxies.add((TaxiVan) taxi);
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

	public TaxiCab getMaxSpeedTaxiCab() {
		List<TaxiCab> taxies = getTaxiCars();
		TaxiCab taxiWithMaxSpeed = taxies.get(0);
		for (int i = 0; i < taxies.size(); i++) {
			if (taxies.get(i).getMaxSpeed() > taxiWithMaxSpeed.getMaxSpeed()) {
				taxiWithMaxSpeed = taxies.get(i);
			}
		}
		return taxiWithMaxSpeed;
	}

	public TaxiVan getMaxSpeedTaxiVan() {
		List<TaxiVan> vanTaxies = getVanTaxies();
		TaxiVan vanTaxiWithMaxSpeed = vanTaxies.get(0);
		for (int i = 0; i < vanTaxies.size(); i++) {
			if (vanTaxies.get(i).getMaxSpeed() > vanTaxiWithMaxSpeed.getMaxSpeed()) {
				vanTaxiWithMaxSpeed = vanTaxies.get(i);
			}
		}
		return vanTaxiWithMaxSpeed;
	}

	public int getTaxiCabsTotalCost() {
		List<TaxiCab> taxiesTotalCost = getTaxiCars();
		
		
		
	return 
	}

}
