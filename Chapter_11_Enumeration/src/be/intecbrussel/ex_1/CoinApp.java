package be.intecbrussel.ex_1;

public class CoinApp {
    public static void main(String[] args) {

        Coin[] coins = {Coin.FIVE_EURO, Coin.TWENTY_CENT,Coin.ONE_EURO,Coin.TWO_EURO,
                Coin.FIFTY_CENT, Coin.FIVE_CENT,Coin.TEN_CENT,Coin.FIFTY_CENT,
                Coin.ONE_EURO,Coin.FIFTY_CENT,Coin.FIVE_EURO,Coin.FIFTY_CENT,};

        Coin coin = Coin.FIFTY_CENT;

        coin.sumCoins(coins);


    }

}
