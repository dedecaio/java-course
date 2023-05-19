package entities;

public class Triangle {
    public double b, a, c;


    public double area() {
        double p = (a + b + c)/2.0;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}
