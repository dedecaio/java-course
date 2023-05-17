import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if (age < 0) {
        // throw new IllegalArgumentException("Age cannot be negative.");
        // }

        // sc.close();

        for (int vCar = 0; vCar <= 150; vCar++) {
            System.out.println("Randandam... ROOOOONNNN BROOOOOON");
            if (vCar <= 40) {
                System.out.println("Seu carro está dentro dos limites: " + vCar + "km/h");
            } else {
                System.out.println("Você passou dos limites de velocidade: " + vCar + "km/h");
            }
        }
    }

    // in == :
}