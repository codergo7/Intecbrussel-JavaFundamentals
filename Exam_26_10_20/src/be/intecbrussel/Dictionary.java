package be.intecbrussel;

public class Dictionary {

    public static char[][] generateDictionary(int amountOfLetter) {
        if (amountOfLetter > 5) {
            System.out.println("Because max length is 2_147_483_647 for an array in Java, it is possible until 6 as amount of letters");
            amountOfLetter = 5;
        }
        int limit = (int) Math.pow(26, amountOfLetter);
        char[][] dictionary = new char[limit][amountOfLetter];
        char[] letters = new char[amountOfLetter];

        for (int i = 0; i < amountOfLetter; i++) {
            letters[i] = 'a';
        }

        dictionary[0] = letters;

        for (int i = 1; i < limit; i++) {

            for (int j = 0; j < amountOfLetter; j++) {
                dictionary[i][j] = dictionary[i - 1][j];
            }

            dictionary[i][amountOfLetter - 1] = (char) (dictionary[i - 1][amountOfLetter - 1] + 1);

            for (int j = amountOfLetter - 1; j > 0; j--) {

                if (dictionary[i][j] > 'z') {
                    dictionary[i][j] = 'a';
                    dictionary[i][j - 1]++;
                }
            }
        }
        return dictionary;
    }

    public static void printDict(char[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j]);
            }
            System.out.println();
        }
    }
}
