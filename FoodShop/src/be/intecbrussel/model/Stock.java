package be.intecbrussel.foodshop.model;

import be.intecbrussel.foodshop.exception.NotEnoughFoodInStockException;

import java.util.Map;

public class Stock {

    private Map<Food,Integer> foodStock;

    public Map<Food, Integer> getFoodStock() {
        return foodStock;
    }

    public void setFoodStock(Map<Food, Integer> foodStock) {
        this.foodStock = foodStock;
    }

    public void addFood(Food food){

    }

    public void removeFood(Food food){

    }

    public void removeFromStock(Food food, int amount){

    }

    public void addToStock(Food food, int amount){

    }

    public boolean checkStockByOrder(Order order) throws NotEnoughFoodInStockException {
        for(Map.Entry<Food, Integer> entry : foodStock.entrySet()){
            if(entry.getValue()<foodStock.get(entry.getKey())){
                throw new NotEnoughFoodInStockException(String.format("No enough %s. There is Only %d"
                        ,entry.getKey().getName(), foodStock.get(entry.getKey())));
            }
        }
        return true;
    }
}
