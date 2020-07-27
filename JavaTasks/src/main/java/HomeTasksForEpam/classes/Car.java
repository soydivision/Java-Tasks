package classes;

import java.util.*;

class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;
    private String registerNumber;

    public static void main(String[] args) {
        int choice = 0;
        int modelYear;
        int yearsUsed;
        int minimalPrice;
        int brandNumber;
        int modelNumber;
        Scanner input = new Scanner(System.in);
        Car[] carlist = new Car[]{new Car(1, "Fiat", "Spider Turbo", 1982, "light blue", 1790, "us37721llp"),
                new Car(2, "Plymouth", "Cuda", 1972, "blue", 19700, "Plmt996"),
                new Car(3, "AMC", "Rebel ", 1970, "white/blue", 18988, "965vgg"),
                new Car(4, "Ford", "Mustang", 1967, "green", 16000, "mstng67"),
                new Car(5, "Cadillac", "Eldorado Biarritz", 1960, "Champagne ", 58000, "545dlgow"),
                new Car(6, "Toyota", "LC Bandeirante", 1964, "Judson Green", 27500, "8j39f"),
                new Car(7, "Ford", "Thunderbird", 1962, "Chestnut", 21000, "869735"),
                new Car(8, "Chevrolet", "Chevelle SS 572", 1966, "Pearl White", 35500, "mfwi77"),
                new Car(9, "Maserati", "GranSport Coupe ", 1966, "Nero Carbonio", 5000, "h1fgbvwo3"),
                new Car(10, "Chevrolet", "Chevy II Nova 400", 1962, "Red with tan", 13000, "npp3p2p"),
                new Car(11, "Mercedes-Benz", "450SL", 1979, "blau", 11500, "mbsl_pimp"),
                new Car(12, "Toyota", "Camry", 1983, "Brown", 30000, "OdQVVm"),
                new Car(13, "Toyota", "Camry", 1993, "Brown", 30000, "UA4MqC"),
                new Car(14, "Toyota", "Camry", 2003, "Brown", 30000, "u0G3i2"),
                new Car(15, "Toyota", "Camry", 2013, "Brown", 30000, "b4atQr"),
                new Car(16, "Toyota", "Camry", 2023, "Brown", 30000, "zOfw8I"),
                new Car(17, "Toyota", "Camry", 1973, "Brown", 30000, "Lc22Hg"), new Car(18, "Triumph", "GT6", 1969),
                new Car(19, "Ford", "Mustang"), new Car(20, "Alfa Romeo", "Giulia Super", 1967),
                new Car(21, "Jaguar", "XJ12", 1976, "Cherry", 17000, "jqr279"),
                new Car(22, "Volkswagen", "Karmann Ghia TC", 1974, "Silver", 16250, "i7f3n9"),
                new Car(23, "Mercedes-Benz", "280SE", 1970, "Silver", 0, "MB")
        };
        List<Car> resultList = new ArrayList<>();
        do {
            showMenu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    listCarBrands(Arrays.asList(carlist));
                    brandNumber = input.nextInt();
                    listCarBrand(Arrays.asList(carlist), brandNumber);
                    break;
                case 2:
                    listCarModels(Arrays.asList(carlist));
                    modelNumber = input.nextInt();
                    System.out.println("Enter a number of years car is in use");
                    System.out.println("Введите количество лет которая автомобиль используется");
                    yearsUsed = input.nextInt();
                    listCarModel(Arrays.asList(carlist), modelNumber, yearsUsed);
                    break;
                case 3:
                    System.out.println("Enter production year for a car");
                    System.out.println("Введите год выпуска");
                    modelYear = input.nextInt();
                    System.out.println("Price is more than:");
                    System.out.println("Введите минимальную цену:");
                    minimalPrice = input.nextInt();
                    for (int i = 0; i < carlist.length; i++) {
                        if (carlist[i].getYear() == modelYear && carlist[i].getPrice() > minimalPrice)
                            resultList.add(carlist[i]);
                    }
                    showResult(resultList);
                    break;
                default:
                    break;
                case 4:
                    printCars(Arrays.asList(carlist));
                    break;
            }
        } while (choice != 5);
    }

    private static void showMenu() {
        System.out.printf("%10s \n", "Menu");
        System.out.println("1. Specific car brand. \n  Искать по авто-маркам.");
        System.out.println(
                "2. Specific car model that in use more than n years. \n  Искать по модели и времени в эксплуатации.");
        System.out.println(
                "3. Cars of some period, price of which is more than.  \n Машины определенного года выпуска, с ценой выше.");
        System.out.println("4. [TEST] All cars. \n Вывести все авто. ");
        System.out.println("5. Exit. Выход.");
    }

    private static void showResult(List<Car> resultList) {
        if (resultList.isEmpty()) {
            System.out.println("Nothing found. Ничего не найдено.");
        } else {
            printCars(resultList);
            resultList.clear();
        }
    }

    private static void printCars(List<Car> carlist) {
        System.out.printf("%-5s%-20s%-20s%-10s%-20s%-10s%-20s\n", "id", "brand", "model", "year", "color", "price",
                "register number");
        for (int i = 0; i < carlist.size(); i++) {
            System.out.printf("%-5s", String.valueOf(carlist.get(i).getId()));
            System.out.printf("%-20s", String.valueOf(carlist.get(i).getBrand()));
            System.out.printf("%-20s", String.valueOf(carlist.get(i).getModel()));
            System.out.printf("%-10s", String.valueOf(carlist.get(i).getYear()));
            System.out.printf("%-20s", String.valueOf(carlist.get(i).getColor()));
            System.out.printf("%-10s", String.valueOf(carlist.get(i).getPrice()));
            System.out.printf("%-20s", String.valueOf(carlist.get(i).getRegisterNumber()));
            System.out.println();
        }
    }

    static ArrayList<String> brands = new ArrayList<String>();
    static ArrayList<String> models = new ArrayList<String>();

    private static void listCarBrands(List<Car> carlist) {
        System.out.printf("%-20s", "Car brands:");
        System.out.println();
        for (int i = 0; i < carlist.size(); i++) {
            if (!brands.contains(carlist.get(i).getBrand())) {
                brands.add(String.valueOf(carlist.get(i).getBrand()));
            }
        }
        for (int i = 0; i < brands.size(); i++) {
            System.out.println(i + "." + brands.get(i));
        }
        System.out.println();
    }

    private static void listCarBrand(List<Car> carlist, int n) {
        System.out.printf("%-5s%-20s%-20s%-10s%-10s%-10s%-20s\n", "id", "brand", "model", "year", "color", "price",
                "register number");
        for (int i = 0; i < carlist.size(); i++) {
            if (String.valueOf(carlist.get(i).getBrand()) == brands.get(n)) {
                System.out.printf("%-5s", String.valueOf(carlist.get(i).getId()));
                System.out.printf("%-20s", String.valueOf(carlist.get(i).getBrand()));
                System.out.printf("%-20s", String.valueOf(carlist.get(i).getModel()));
                System.out.printf("%-10s", String.valueOf(carlist.get(i).getYear()));
                System.out.printf("%-10s", String.valueOf(carlist.get(i).getColor()));
                System.out.printf("%-10s", String.valueOf(carlist.get(i).getPrice()));
                System.out.printf("%-20s", String.valueOf(carlist.get(i).getRegisterNumber()));
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void listCarModels(List<Car> carlist) {
        System.out.printf("%-20s", "Car models:");
        System.out.println();
        for (int i = 0; i < carlist.size(); i++) {
            if (!models.contains(carlist.get(i).getModel())) {
                models.add(String.valueOf(carlist.get(i).getModel()));
            }
        }
        for (int i = 0; i < models.size(); i++) {
            System.out.println(i + "." + models.get(i));
        }
        System.out.println();
    }

    private static void listCarModel(List<Car> carlist, int n, int yearsUsed) {
        System.out.printf("%-5s%-20s%-20s%-10s%-10s%-10s%-20s\n", "id", "brand", "model", "year", "color", "price",
                "register number");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());
        for (int i = 0; i < carlist.size(); i++) {
            if (String.valueOf(carlist.get(i).getModel()) == models.get(n)
                    && calendar1.get(Calendar.YEAR) - yearsUsed >= carlist.get(i).getYear()) {
                System.out.printf("%-5s", String.valueOf(carlist.get(i).getId()));
                System.out.printf("%-20s", String.valueOf(carlist.get(i).getBrand()));
                System.out.printf("%-20s", String.valueOf(carlist.get(i).getModel()));
                System.out.printf("%-10s", String.valueOf(carlist.get(i).getYear()));
                System.out.printf("%-10s", String.valueOf(carlist.get(i).getColor()));
                System.out.printf("%-10s", String.valueOf(carlist.get(i).getPrice()));
                System.out.printf("%-20s", String.valueOf(carlist.get(i).getRegisterNumber()));
                System.out.println();
            }
        }
        System.out.println();
    }

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