import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Venâncio Aires");
        cities.add("Buenos Aires");
        cities.add("São Paulo");
        cities.add("São Tomé");
        cities.add("Pedro Alvares Cabral");
        cities.add("Porto Alegre");
        cities.add("Londres");
        cities.add("Paris");
        cities.add("Rio de Janeiro");
        cities.add("Salvador");
        cities.add("Tokio");
        cities.set(2, "Dubai");
        cities.remove(5);
    }
}