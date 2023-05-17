package products;

public class Shirt extends Product {

    private Size size;

    public Shirt(Size size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;
    }

    public enum Size {
        SMALL, MEDIUM, LARGE
    };

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Shirt here BRO");
    }

    @Override
    public void wear() {
        System.out.println("A camisa de tamanho " + this.size + " ficou ótima em você.");
    }

}
