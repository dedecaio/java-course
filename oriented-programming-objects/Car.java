import java.util.Arrays;

public class Car {
    private String make, color;
    private double price;
    private int year;
    private String[] parts;

    public Car(String make, String color, double price, int year, String[] parts) {
        this.make = make;
        this.color = color;
        this.price = price;
        this.year = year;
        this.parts = Arrays.copyOf(parts, parts.length);

    }

    public Car(Car source) {
        this.make = source.make;
        this.color = source.color;
        this.price = source.price;
        this.year = source.year;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void drive() {
        System.out.println("You bought the car " + this.make + " " + this.color + " " + this.price + " " + this.year);
    }

    public String toString() {
        return "Make: " + this.make + ".\n"
                + "Price: " + this.price + ".\n"
                + "Year: " + this.year + ".\n"
                + "Color: " + this.color + ".\n"
                + "Parts: " + Arrays.toString(parts) + ".\n";

    }

}
