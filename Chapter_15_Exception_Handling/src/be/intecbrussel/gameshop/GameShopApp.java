package be.intecbrussel.gameshop;

import be.intecbrussel.gameshop.exception.*;

public class GameShopApp {
    public static void main(String[] args) {

        GameShop gameShop = new GameShop();
        Stock stock = new Stock();
        gameShop.setStock(stock);
        stock.addGame(GameShop.Game.GHOST);
        stock.addGame(GameShop.Game.COLD_WAR);
        stock.addGame(GameShop.Game.WATCH_DOGS_LEGION);

        Client client1 = new Client("Brad",1990,500);
        Client client2 = new Client("Jhon",2009,200);
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
            System.out.println(ese.getMessage());
            ese.printStackTrace();
        } catch (TooYoungToGameException tytge) {
            System.out.println(tytge.getMessage());
            tytge.printStackTrace();
        } catch (GameNotFoundException gnfe) {
            System.out.println(gnfe.getMessage());
            gnfe.printStackTrace();
        } catch (NotEnoughMoneyException neme) {
            System.out.println(neme.getMessage());
            neme.printStackTrace();
        }
        catch (GameException ge) {
            System.out.println("Game exception");

        }
    }
}
