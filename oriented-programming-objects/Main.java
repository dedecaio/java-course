
public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[] {
                new Car("Nissan", "Green", 5000, 2020, new String[] { "tires", "keys" }),
                new Car("Toyota", "Red", 12000, 2022, new String[] { "tires", "keys" }),
                new Car("Honda", "White", 8700, 2013, new String[] { "tires", "keys" }),
                new Car("Chevrollet", "Black", 3000, 2002, new String[] { "tires", "keys" }),
                new Car("Fiat", "Gold", 123000, 2023, new String[] { "tires", "keys" }),
        };

        Dealership dealership = new Dealership(cars);

        // Get a deep copy of the car at index 0
        Car carAtIndex0 = dealership.getCar(0);
        System.out.println("Original car make: " + carAtIndex0.getMake());

        // Modify the car's make
        carAtIndex0.setMake("Toyota");
        System.out.println("Modified car make: " + carAtIndex0.getMake());

        // Verify that the car in the dealership is not affected
        System.out.println("Dealership car make: " + dealership.getCar(0).getMake());

        // Create a new Car object
        Car newCar = new Car("BMW", "Silver", 10000, 2018, new String[] { "tires", "filter", "transmission" });

        // Set the car at index 1 in the dealership to a deep copy of the newCar
        dealership.setCar(1, newCar);

        // Verify that the car at index 1 in the dealership has been updated
        System.out.println("Dealership car make at index 1: " + dealership.getCar(1).getMake());

        // Modify the newCar object
        newCar.setMake("Audi");

        // Verify that the car in the dealership is not affected
        System.out.println("Dealership car make at index 1 after modifying newCar: " + dealership.getCar(1).getMake());
    }
}
