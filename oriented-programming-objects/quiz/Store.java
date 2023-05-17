public class Store {

    Dessert[] desserts;

    public Store() {
        desserts = new Dessert[4];
    }

    public Dessert getDessert(int index) {
        return new Dessert(this.desserts[index]);
    }

    public void setDessert(Dessert dessert, int index) {
        this.desserts[index] = new Dessert(dessert);
    }

}
