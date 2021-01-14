package be.intecbrussel.foodshop.model;

import java.util.Map;

public class Order {

    private Map<Food, Integer> foodItems;

    public void setFoodItems(Map<Food, Integer> foodItems) {
        this.foodItems = foodItems;
    }

    public double getTotalPrice() {
        return 1;
    }

    public Map<Food, Integer> getFoodItems() {

        return this.foodItems;
    }
}
