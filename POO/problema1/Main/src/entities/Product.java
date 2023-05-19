package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return this.price * this.quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        name = this.name;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        price = this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        quantity = this.quantity;
    }

}
