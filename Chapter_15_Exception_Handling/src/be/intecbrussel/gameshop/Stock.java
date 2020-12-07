package be.intecbrussel.gameshop;

import be.intecbrussel.gameshop.exception.EmptyStockException;
import be.intecbrussel.gameshop.exception.GameNotFoundException;

import java.util.Arrays;

public class Stock {

    private int ghostAmount;
    private int coldWarAmount;
    private int watchDogAmount;
    private GameShop.Game[] games;
    private int amountGames;

    public Stock() {
        this.games = new GameShop.Game[100];
    }

    public void soldGame(GameShop.Game game) throws EmptyStockException, GameNotFoundException {
        if (game.equals(GameShop.Game.COLD_WAR)) {
            prepareColdWar(game);
        } else if (game.equals(GameShop.Game.GHOST)) {
            prepareGhost(game);
        } else if (game.equals(GameShop.Game.WATCH_DOGS_LEGION)) {
            prepareWatchDog(game);
        } else throw new GameNotFoundException("We don't have this game");

        deleteFromStock(game);
    }

    private void deleteFromStock(GameShop.Game game) {
        for (int i = 0; i < games.length; i++) {
            if (games[i] != null && games[i].equals(game)) {
                games[i] = null;
               break;
            }
        }
        rearrangeAmounts();
    }

    private void prepareColdWar(GameShop.Game game) throws EmptyStockException {
        if (getColdWarAmount() > 0) {
            deleteFromStock(game);
        } else throw new EmptyStockException("No more Cold War in the stock.");
    }

    private void prepareGhost(GameShop.Game game) throws EmptyStockException {
        if (getGhostAmount() > 0) {
            deleteFromStock(game);
        } else throw new EmptyStockException("No more Ghost in the stock.");
    }

    private void prepareWatchDog(GameShop.Game game) throws EmptyStockException {
        if (getWatchDogAmount() > 0) {
            deleteFromStock(game);
        } else throw new EmptyStockException("No more Watch Dog Legion in the stock.");
    }

    private void rearrangeAmounts() {
        coldWarAmount=0;
        ghostAmount=0;
        watchDogAmount=0;
        for (GameShop.Game game : games) {
            if (game!=null && game.equals(GameShop.Game.GHOST)) {
                ghostAmount++;
            } else if (game!=null && game.equals(GameShop.Game.COLD_WAR)) {
                coldWarAmount++;
            } else if (game!=null && game.equals(GameShop.Game.WATCH_DOGS_LEGION)) {
                watchDogAmount++;
            }
        }
        amountGames = ghostAmount + watchDogAmount + coldWarAmount;
    }

    public void addGame(GameShop.Game game){
        if(amountGames > games.length-10){
            extendTheList();
        }

        if (game.equals(GameShop.Game.GHOST)) {
            ghostAmount++;
        } else if (game.equals(GameShop.Game.COLD_WAR)) {
            coldWarAmount++;
        } else if (game.equals(GameShop.Game.WATCH_DOGS_LEGION)) {
            watchDogAmount++;
        }
        games[getFreeIndexFromGamesList()] = game;
        amountGames++;
    }

    private void extendTheList() {
        games = Arrays.copyOf(games, games.length + 20);
    }

    private int getFreeIndexFromGamesList() {
        for (int i = 0; i < games.length; i++) {
            if(games[i]==null)
                return i;
        }
        return -1;
    }

    // GETTERS AND SETTERS
    public GameShop.Game[] getGames() {
        return games;
    }

    public void setGames(GameShop.Game[] games) {
        this.games = games;
        rearrangeAmounts();
    }

    public int getGhostAmount() {
        return ghostAmount;
    }

    public int getColdWarAmount() {
        return coldWarAmount;
    }

    public int getWatchDogAmount() {
        return watchDogAmount;
    }
}
