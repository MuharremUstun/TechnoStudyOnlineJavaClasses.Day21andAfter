package Day48.Task1;

public class Food {
    private String brand;
    private double price;
    private int cal;

    public Food(String brand, double price, int cal) {
        this.brand = brand;
        this.price = price;
        this.cal = cal;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getCal() {
        return cal;
    }

}
