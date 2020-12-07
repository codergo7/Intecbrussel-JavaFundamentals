package be.intecbrussel.gameshop;

import be.intecbrussel.gameshop.exception.EmptyStockException;
import be.intecbrussel.gameshop.exception.GameNotFoundException;
import be.intecbrussel.gameshop.exception.NotEnoughMoneyException;
import be.intecbrussel.gameshop.exception.TooYoungToGameException;

import java.time.LocalDate;
import java.util.Calendar;

public class GameShop {

    private Stock stock;
    private Human vendor;

    public GameShop() {
        this(null, null);
    }

    public GameShop(Stock stock, Human vendor) {
        this.stock = stock;
        this.vendor = vendor;
    }

    public void buyGame(Client client, String gameName) throws EmptyStockException, TooYoungToGameException, GameNotFoundException, NotEnoughMoneyException {
        Game game =Game.valueOf(gameName);
        clientMoneyCheck(client, game);
        if(clientAgeCheck(client, game)){
            stock.soldGame(game);
        }
    }

    private void clientMoneyCheck(Client client, Game game) throws NotEnoughMoneyException {
        if (client.getMoney() < game.getPrice()) {
            //System.out.println("Money: " + client.getMoney() +" --- Price: " +game.getPrice());
            throw new NotEnoughMoneyException("You have no enough money.");
        }
    }

    private boolean clientAgeCheck(Client client, Game game) throws EmptyStockException, TooYoungToGameException, GameNotFoundException {
        int year = LocalDate.now().getYear();
        if (year - client.getBirthYear() < 18) {
            throw new TooYoungToGameException("You can not buy any game. Because you are too young");
        }
        return true;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Human getVendor() {
        return vendor;
    }

    public void setVendor(Human vendor) {
        this.vendor = vendor;
    }

    public enum Game {
        GHOST("Ghost", 100),
        WATCH_DOGS_LEGION("Watch Dog Legion", 120),
        COLD_WAR("Cold War", 160),
        FIFA_21("Fifa 21", 130);

        private String name;
        private int price;

        Game(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }


}
