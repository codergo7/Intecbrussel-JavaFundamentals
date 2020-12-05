package be.intecbrussel.gameshop;

public class GameShopApp {
    public static void main(String[] args) {

        GameShop gameShop = new GameShop();
        GameShop.Stock stock = gameShop.new Stock();
        gameShop.setStock(stock);
        stock.setWatchDogAmount(1);
        stock.setColdWarAmount(0);
        stock.setGhostAmount(1);

        Client client1 = new Client("Brad",1990,500);
        Client client2 = new Client("Jhon",2009,100);
        Client client3 = new Client("Angelina",1990,50);

        gameBuy(gameShop,client1, GameShop.Game.GHOST);
        gameBuy(gameShop,client1, GameShop.Game.GHOST);
        gameBuy(gameShop,client1, GameShop.Game.FIFA_21);
        gameBuy(gameShop,client2, GameShop.Game.COLD_WAR);
        gameBuy(gameShop,client3, GameShop.Game.WATCH_DOGS_LEGION);

    }

    private static void gameBuy(GameShop gameShop,Client client1, GameShop.Game game) {

        try {
            gameShop.buyGame(client1, game);
        } catch (EmptyStockException ese) {
            ese.getMessage();
            ese.printStackTrace();
        } catch (TooYoungToGameException tytge) {
            tytge.getMessage();
            tytge.printStackTrace();
        } catch (GameNotFoundException gnfe) {
            gnfe.getMessage();
            gnfe.printStackTrace();
        } catch (NotEnoughMoneyException neme) {
            neme.getMessage();
            neme.printStackTrace();
        }
    }
}
