package be.intecbrussel;

public class CharArrayTools {


    public static char[] filterAlphabet(char[] chars){
        char[] filteredChars = new char[chars.length];
        int newLength =0;
        for (int i = 0, j=0; i <chars.length ; i++) {
            if((chars[i] >= 'a' && chars[i] <= 'z')||((chars[i] >= 'A' && chars[i] <= 'Z'))){
                filteredChars[j++] = chars[i];
                newLength++;
            }
        }
        return removeSpacesCharArray(filteredChars,newLength);
    }

    public static char[] sortCharacters(char[] chars){
        char[] filteredChars = new char[chars.length];
         int indis =0;
        for (int j = 0; j < chars.length; j++) {
            char min = chars[j];
            for (int i = j; i < chars.length; i++) {
                if (chars[i] < min) {
                    min = chars[i];
                    indis = i;
                }
            }
            char a = chars[j];
            chars[j] = min;
            chars[indis] = a;
        }

        return chars;
    }

    public static char[] removeSpacesCharArray(char[] filteredChars, int newLength ){
        char[] resultChars = new char[newLength];
        for (int i = 0, j=0; i <filteredChars.length ; i++) {
            if((filteredChars[i] >= 'a' && filteredChars[i] <= 'z')||((filteredChars[i] >= 'A' && filteredChars[i] <= 'Z'))){
                resultChars[j++] = filteredChars[i];
            }
        }
        return resultChars;
    }

    public static void printCharArray(char[] chars) {
        for (char c : chars) {
            System.out.print(c + " ");
        }
    }

    // NOT COMPLETED
    public static char[][] generateDictionary(int amountOfLetter){
        if(amountOfLetter>6){
            System.out.println("Because max length is 2_147_483_647 for an array in Java, it is possible until 6 as amount of letters");
            amountOfLetter=6;
        }
        int limit =(int)Math.pow(26,amountOfLetter);
        int counter =0;
        char[][] dictionary = new char[limit][1];
        char[] letters = new char[amountOfLetter];

        while (counter<=limit){

            for (int i = 0; i <amountOfLetter; i++) {
                letters[i]='a';
            }

            dictionary[counter++]=letters;
        }

            for (int i = 0; i <26; i++) {
                for (int j = 0; j <amountOfLetter; j++) {
                    dictionary[i][j]= (char) ('a' + j);
                }
                for (int j = 0; j < amountOfLetter; j++) {
                    System.out.print(dictionary[i][j]);
                }
            }
        return dictionary;
    }

    public static void printDict(char[][] list){
        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j <list[i].length ; j++) {
                System.out.println(list[i][j]);
            }

        }
    }
}
