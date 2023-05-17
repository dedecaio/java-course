public class Main {
    public static void main(String[] args) {

        Dessert[] desserts = new Dessert[] {
                new Dessert("Cake", 4.99),
                new Dessert("Pie", 2.99),
                new Dessert("Brownie", 1.99),
                new Dessert("Sundae", 2.49),
        };

        Store store = new Store();

        for (int i = 0; i < desserts.length; i++) {
            store.setDessert(desserts[i], i);
        }

        System.out.println(store.getDessert(1));

    }
}
