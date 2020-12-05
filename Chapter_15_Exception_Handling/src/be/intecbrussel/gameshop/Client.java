package be.intecbrussel.gameshop;

import java.util.Date;

public class Client {

    private String name;
    private int birthYear;
    private int money;

    public Client(String name, int birthYear) {
        this(name,birthYear,0);
    }

    public Client(String name, int birthYear, int money) {
        this.name = name;
        this.birthYear = birthYear;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Client:" +
                "name='" + name + '\'' +
                ", birthday=" + birthYear;
    }
}
