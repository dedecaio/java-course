import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product banana = new Product("Banana", 2.99, 12);
        Product maca = new Product("Maçã", 3.99, 6);

        System.out.println("O produto "+ banana.getName() +" está custando " + banana.getPrice()
                + " e possuímos cerca de " + banana.getQuantity());
        sc.close();
    }
}