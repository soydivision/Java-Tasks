package collections;

import collections.taxiTypes.*;

public class TaxiVan extends Car {

	public TaxiVan(String model, int fuelConsumption, int price, int maxSpeed, TaxiVanType type) {
		super(model, fuelConsumption, price, maxSpeed);
		this.type = type;
	}

	private TaxiVanType type;

	public TaxiVanType getType() {
		return type;
	}

	public void setType(TaxiVanType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString().replace(".", ", type=" + type);
	}

}
