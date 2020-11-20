package be.intecbrussel.ex_1;

public enum Coin {

    ONE_CENT(1, "cent"), TWO_CENT(2, "cent"), FIVE_CENT(5, "cent"),
    TEN_CENT(10, "cent"), TWENTY_CENT(20, "cent"),FIFTY_CENT(50, "cent"),
    ONE_EURO(1, "euro"), TWO_EURO(2, "euro"), FIVE_EURO(5, "euro");

    private int value;
    private String unit;


    private Coin(int value, String unit){
        this.value = value;
        this.unit =unit;
    }

    public void sumCoins(Coin[] coins){
        int sum=0;

        for(Coin coin : coins){
            if(coin.unit.equals("euro")){
                sum+= coin.value*100;
            }
            else {
                sum+= coin.value;
            }
        }
        printSumOfCoins(sum);
    }

    private void printSumOfCoins(int sum) {

        int cent = sum%100;
        int euro = sum/100;

        System.out.println("Sum of coins is " + euro + "," + cent + " euros");
    }


    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString() + " " + value + " " +  unit;
    }
}
