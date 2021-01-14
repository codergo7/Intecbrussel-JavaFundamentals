package be.intecbrussel.foodshop.model;

public class Food {

    private String name;
    private double price;
    private double calori;
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCalori() {
        return calori;
    }

    public void setCalori(double calori) {
        this.calori = calori;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
