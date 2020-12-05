package be.intecbrussel.gameshop;

import java.util.Calendar;

public class GameShop {

    private Stock stock;
    private Human vendor;

    public GameShop(){
        this(null,null);
    }

    public GameShop(Stock stock, Human vendor) {
        this.stock = stock;
        this.vendor = vendor;
    }

    public void buyGame(Client client, Game game) throws EmptyStockException, TooYoungToGameException, GameNotFoundException {
        clientAgeCheck(client, game);
    }

    private void clientAgeCheck(Client client, Game game) throws EmptyStockException, TooYoungToGameException, GameNotFoundException {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if(year-client.getBirthYear()>=18){
            stock.soldGame(game);
        }
        else{
            throw new TooYoungToGameException();
        }
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
        GHOST("Ghost",100),
        WATCH_DOGS_LEGION("Watch Dog Legion",120),
        COLD_WAR("Cold War",160);

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

    public class Stock {

        private int ghostAmount;
        private int coldWarAmount;
        private int watchDogAmount;


        public void soldGame(Game game) throws EmptyStockException, GameNotFoundException {

            if(game.name.equals(Game.COLD_WAR)) {
                prepareColdWar();
            }
            else if (game.equals(Game.GHOST)) {
                prepareGhost();
            }
            else if (game.name.equals(Game.WATCH_DOGS_LEGION)) {
                prepareWatchDog();
            }
            else throw new  GameNotFoundException("We don't have this game");
        }

        private void prepareColdWar() throws EmptyStockException {
            if(getGhostAmount()>0){
                setColdWarAmount(getColdWarAmount()-1);
            }
            else throw new EmptyStockException("No more Cold War in the stock.");
        }
        private void prepareGhost() throws EmptyStockException {
            if(getGhostAmount()>0){
                setGhostAmount(getGhostAmount()-1);
            }
            else throw new EmptyStockException("No more Ghost in the stock.");
        }
        private void prepareWatchDog() throws EmptyStockException {
            if(getGhostAmount()>0){
                setWatchDogAmount(getWatchDogAmount()-1);
            }
            else throw new EmptyStockException("No more Watch Dog Legion in the stock.");
        }


        public int getGhostAmount() {
            return ghostAmount;
        }

        public void setGhostAmount(int ghostAmount) {
            this.ghostAmount = ghostAmount;
        }

        public int getColdWarAmount() {
            return coldWarAmount;
        }

        public void setColdWarAmount(int coldWarAmount) {
            this.coldWarAmount = coldWarAmount;
        }

        public int getWatchDogAmount() {
            return watchDogAmount;
        }

        public void setWatchDogAmount(int watchDogAmount) {
            this.watchDogAmount = watchDogAmount;
        }
    }
}
