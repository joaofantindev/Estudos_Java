package Clean;

public class Main {
    public static void main(String[] args) {
        Human human1 = Human.createHuman("John Doe", 30, 5.9f, "123-45-6789", "Engineer", "American", "Male");
        Car car = Car.createCar("Toyota", "Corolla", 20000.0, 2020);

        System.out.println("Human Details:");
        System.out.println("Name: " + human1.name);
        System.out.println("Age: " + human1.age);
        System.out.println("Height: " + human1.height);
        System.out.println("Occupation: " + human1.occupation);
        System.out.println("Nationality: " + human1.nationality);
        System.out.println("Gender: " + human1.gender);

        System.out.println("\nCar Details:");
        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.model);
 
    }
}
