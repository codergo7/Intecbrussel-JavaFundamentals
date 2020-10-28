package be.intecbrussel.forloop;

public class ForTest {
    public static void main(String[] args) {

        for (int i =1; i<=10000; i*=5 ){
           // System.out.println(i);
        }

        int j =0;

        for ( ;  ; ){
            //System.out.println(j);
            if (j > 10) {
                break;
            } else {
                j++;
            }
        }

        for(int i=0, k=100; i<100 || k>0; i+=2, k-=2){
            System.out.print(i + " ");
            System.out.println(k);
        }



    }
}
