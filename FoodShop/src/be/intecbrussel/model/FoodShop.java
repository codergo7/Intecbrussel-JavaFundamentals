package be.intecbrussel.foodshop.model;

import be.intecbrussel.foodshop.exception.NotEnoughFoodInStockException;
import be.intecbrussel.foodshop.exception.NotEnoughMoneyException;
import be.intecbrussel.foodshop.service.CustomerRepository;
import java.util.ArrayList;
import java.util.List;

public class FoodShop {

    private List<Register> registers;
    private Stock stock;
    private CustomerRepository customerRepository;
    private Order order;

    public FoodShop() {
        this.registers = new ArrayList<>();
        registers.add(new Register());
    }

    public List<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register> registers) {
        this.registers = registers;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /*
    public Order takeOrder(Map<Food, Integer> foods) throws NotEnoughFoodInStockException {
        return null;
    }
    
     */

    public void sellFood(Order order, Customer payingCustomer) throws NotEnoughMoneyException, NotEnoughFoodInStockException {
        // check if all food is available
        stock.checkStockByOrder(order);

        // calculate the total order price and check if customer has enough money
        checkMoney(order, payingCustomer);

        // remove order from stock
        order.getFoodItems().entrySet().forEach(entry->stock.removeFromStock(entry.getKey(), entry.getValue()));

        // update the money of customer
        double  totalPrice = order.getTotalPrice();
        double moneyInHand = payingCustomer.getMoney() - totalPrice;
        payingCustomer.setMoney(moneyInHand);

        // add money to register (In which register will I add money ???)
        // TODO Register -> multithreading
        registers.get(0).addMoney(totalPrice);
    }

    private boolean checkMoney(Order order, Customer payingCustomer) throws NotEnoughMoneyException {
        double  totalPrice = order.getTotalPrice();
        double moneyInHand = payingCustomer.getMoney() - totalPrice;
        if (moneyInHand < 0) {
            throw new NotEnoughMoneyException();
        }
        return true;
    }
}
