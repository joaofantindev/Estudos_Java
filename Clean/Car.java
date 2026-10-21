package Clean;

public class Car {
    public String brand;
    public String model;
    private double price;
    private int year;
    protected int quantity;
    protected String firmware_code;

    // Private constructor to prevent direct instantiation
    private Car(String brand, String model, double price, int year) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    // Factory method to create a Car object
    public static Car createCar(String brand, String model, double price, int year) {
        return new Car(brand, model, price, year);
    }
}
