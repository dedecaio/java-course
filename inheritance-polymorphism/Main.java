import products.Pants;
import products.Product;
import products.Shirt;
import products.Shirt.Size;

public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt(Size.LARGE, 12.09, "RED", "NIQUE");
        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants(32, 32, 27.60, "BLACK PIANO", "ARDIDAS");
        pants.fold();
        productStore(pants);

    }

    public static void productStore(Product products) {

        System.out.println(
                "\nThanks for purchasing " + products.getBrand() + " "
                        + products.getClass().getSimpleName().toLowerCase()
                        + ". Your total comes to: " + products.getPrice());
        products.wear();

    }

}