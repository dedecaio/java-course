import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Banana", 3.99);
        map.put("Mamão", 2.99);
        map.put("Feijão", 4.99);
        map.put("Pão", 0.99);
        map.put("Arroz", 13.99);
        map.put("Maçã", 1.99);
        map.put("Bolacha recheada", 2.99);
        map.put("Figo", 3.99);
        map.put("Picanha", 89.99);
        map.put("Pêra", 1.39);
        map.put("Cachos de Uva", 3.39);

        System.out.println("Escolha um item de nosso mercado: ");
        System.out.println(map);

        Scanner scanner = new Scanner(System.in);

        String itemEscolhido = scanner.nextLine();

        if (map.containsKey(itemEscolhido)) {
            System.out.println("Você escolheu " + itemEscolhido + "e terá que pagar R$ " + map.get(itemEscolhido));
        } else {
            System.out.println("Este item não existe");
        }

        scanner.close();
    }
}