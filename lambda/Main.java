import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> facts = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

        facts.forEach(fact -> System.out.println(fact));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        integers.sort((right, left) -> right.compareTo(left));

        Map<String, Integer> mercado = new HashMap<>();
        mercado.put("Feijão", 2);
        mercado.put("Arroz", 5);
        mercado.put("Pão", 12);
        mercado.put("Batata", 19);
        mercado.put("Smirnoff", 231);
        mercado.put("Café", 321);
        mercado.put("Cachorro quente", 41);
        mercado.put("Mortadela", 12);
        mercado.put("Frango", 23);
        mercado.put("Feijão", 47);

        mercado.forEach((item, valor) -> System.out.println("Item: " + item + ", Valor do item: R$" + valor));

        List<Double> prices = Arrays.asList(2.3, 343.4, 4354.43, 123.32, 213.45, 98.12, 15.9);
        prices.stream()
                .filter(price -> price > 100)
                .map(price -> price - 20)
                .sorted((right, left) -> right.compareTo(left))
                .map(price -> "R$" + price)
                .forEach(price -> System.out.println(price));

        facts.stream()
                .map(item -> item.toUpperCase())
                .forEach(item -> System.out.println(item));
        Double totalPrice = prices.stream().reduce(0.00, ((x, y) -> x + y));
        System.out.println(totalPrice);

        BigDecimal x = new BigDecimal("0.1");
        BigDecimal y = new BigDecimal("0.2");

        System.out.println(y.subtract(x));
    }
}