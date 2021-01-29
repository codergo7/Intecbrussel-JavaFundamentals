package be.intecbrussel.forloop;

public class ForCodes {
    public static void main(String[] args) {

        for(int number =0; number<1000; number++ ){
            boolean isMultiple7 = number % 7 == 0;      //isVeelvoudVan7
            boolean isMultipleOf13 = number % 19 == 0;  //isVeelvoudVan13
            boolean isNoMiltiple4 = number % 4 != 0;    //isGeenVeelvoudVan4
            boolean isNoMiltiple9 = number % 9 != 0;    //isGeenVeelvoudVan9

            if(isMultiple7 && isMultipleOf13 && isNoMiltiple4 && isNoMiltiple9){
                System.out.println(number);

            }

            }
    }
}
