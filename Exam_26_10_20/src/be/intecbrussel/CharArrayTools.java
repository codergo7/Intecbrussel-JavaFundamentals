package be.intecbrussel;

public class CharArrayTools {


    public static char[] filterAlphabet(char[] chars) {
        char[] filteredChars = new char[chars.length];
        int newLength = 0;
        for (int i = 0, j = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || ((chars[i] >= 'A' && chars[i] <= 'Z'))) {
                filteredChars[j++] = chars[i];
                newLength++;
            }
        }
        return removeSpacesCharArray(filteredChars, newLength);
    }

    public static char[] sortCharacters(char[] chars) {
        char[] filteredChars = new char[chars.length];
        int indis = 0;
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

    public static char[] removeSpacesCharArray(char[] filteredChars, int newLength) {
        char[] resultChars = new char[newLength];
        for (int i = 0, j = 0; i < filteredChars.length; i++) {
            if ((filteredChars[i] >= 'a' && filteredChars[i] <= 'z') || ((filteredChars[i] >= 'A' && filteredChars[i] <= 'Z'))) {
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

}
