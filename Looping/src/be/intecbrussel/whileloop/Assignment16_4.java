package whileloop;

public class Assignment16_4 {
    public static void main(String[] args) {
        char letter = 'A';
        int counter =0;

        while(counter++<26){
            System.out.println((char)letter++);
        }
    }
}
