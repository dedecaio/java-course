import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do produto que desejas adicionar?");
        String name = sc.nextLine();
        System.out.println("Quanto está custando:");
        double price = sc.nextDouble();
        System.out.println("Qual a quantidade que desejas adicionar?");
        int quantity = sc.nextInt();

        Product produto = new Product(name,price,quantity);


        System.out.println("\n"+produto);

        System.out.println("Quanto gostaria de remover da quantidade");
        int unidadeRemovida = sc.nextInt();
        produto.removeProducts(unidadeRemovida);

        System.out.println("\n"+produto+ "agora");


        sc.close();
    }
}