import utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        for (double i =0; i  < 400.00;) {
            System.out.println("\n\nEnter radius");
            double radius = sc.nextDouble();

            double c = Calculator.circumference(radius);
            double v = Calculator.volume(radius);
            i = v;
            System.out.printf("Circumference: %.2f%n", c);
            System.out.printf("Volume: %.2f%n", v);
            System.out.printf("PI value: %f", Math.PI);
        }


    }

}