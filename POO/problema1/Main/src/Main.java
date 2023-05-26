import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Product[] produto = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Qual o nome do produto que desejas adicionar?");
            String name = sc.nextLine();
            System.out.println("Quanto está custando:");
            double price = sc.nextDouble();
            System.out.println("Qual a quantidade que desejas adicionar?");
            int quantity = sc.nextInt();

            produto[i] = new Product(name, price, quantity);

            System.out.println("\n"+produto[i]);

            System.out.println("Quanto gostaria de remover da quantidade");
            int unidadeRemovida = sc.nextInt();
            produto[i].removeProducts(unidadeRemovida);
            sc.nextLine();
            System.out.println("\n"+produto[i]+ " agora");
        }
        for (int v = 0; v < n; v++){
            System.out.println(produto[v]);
        }




        sc.close();
    }
}