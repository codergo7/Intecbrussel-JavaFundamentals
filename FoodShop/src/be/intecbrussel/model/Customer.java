package be.intecbrussel.foodshop.model;

public class Customer {
    private String name;
    private final int ID;
    private String email;
    private double money;

    public Customer(String name, int ID, String email, double money) {
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return String.format("CUSTOMER   Name: %-10s  ID: %-10s  E-mail: %-15s  Money: %-5.2f€  ",
                name, ID, email, money);
    }
}
