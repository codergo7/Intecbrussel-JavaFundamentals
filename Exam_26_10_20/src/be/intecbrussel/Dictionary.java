package be.intecbrussel;

//Not completed
public class Dictionary {

    public static void main(String[] args) {
        printDict(generateDictionary(3));
    }

    public static char[][] generateDictionary(int amountOfLetter) {
        if (amountOfLetter > 6) {
            System.out.println("Because max length is 2_147_483_647 for an array in Java, it is possible until 6 as amount of letters");
            amountOfLetter = 6;
        }
        int limit = (int) Math.pow(26, amountOfLetter);
        int counter = 0;
        char[][] dictionary = new char[limit][];
        char[] letters = new char[amountOfLetter];



            for (int i = 0; i < amountOfLetter; i++) {
                letters[i] = 'a';
            }
            CharArrayTools.printCharArray(letters);

            dictionary[0] = letters;


        for (int i = 0; i <= 26; i++) {
            for (int j = 0; j < amountOfLetter; j++) {
                dictionary[i][j] = (char) ('a' + j);
            }
            for (int j = 0; j < amountOfLetter; j++) {
                System.out.print(dictionary[i][j]);
            }
        }
        return dictionary;
    }

    public static void printDict(char[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.println(list[i][j]);
            }

        }
    }
}
