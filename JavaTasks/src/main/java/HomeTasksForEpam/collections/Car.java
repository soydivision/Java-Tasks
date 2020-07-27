package collections;

abstract public class Car {
    private String model;
    private int fuelConsumption;
    private int price;
    private int maxSpeed;

    public Car(String model, int fuelConsumption, int price, int maxSpeed) {
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return "Model: " + model + " Fuel consumption " + fuelConsumption + " Car price " + price + " Maximum Speed "
                + maxSpeed + "\n";
    }
}