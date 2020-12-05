package be.intecbrussel.gameshop;

import java.util.Date;

public class Client {

    private String name;
    private Date birthday;
    private int money;

    public Client(String name, Date birthday) {
        this(name,birthday,0);
    }

    public Client(String name, Date birthday, int money) {
        this.name = name;
        this.birthday = birthday;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
                ", birthday=" + birthday;
    }
}
