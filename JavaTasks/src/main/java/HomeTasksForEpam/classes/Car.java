package classes;

class Car {
	private int id;
	private String brand;
	private String model;
	private int year;
	private String color;
	private int price;
	private String registerNumber;

	public Car(int id, String brand, String model, int year, String color, int price, String registerNumber) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.registerNumber = registerNumber;
	}

	public Car(int id, String brand, String model) {
		this.id = id;
		this.brand = brand;
		this.model = model;

	}

	public Car(int id, String brand, String model, int year) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Car{");
		sb.append("id=").append(id);
		sb.append(", brand='").append(brand).append('\'');
		sb.append(", year=").append(year);
		sb.append(", color='").append(color).append('\'');
		sb.append(", price=").append(price);
		sb.append(", registerNumber=").append(registerNumber);
		sb.append('}');
		return sb.toString();
	}

}