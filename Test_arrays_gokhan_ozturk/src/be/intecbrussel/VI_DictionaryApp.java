package be.intecbrussel;

public class VI_DictionaryApp {

    static String generateDictionary(int i) {
        return i < 0 ? "" : generateDictionary((i / 26) - 1) + (char) (65 + i % 26);
    }

    //1 Letter -> tot 25+1        ~ 26.5
//2 Letters -> tot 701+1      ~ 26.5^2
//3 Letter -> tot 18277+1     ~ 26.34^3
    //...
    public static void main(String[] args) {
        for (int i = 0; i < 18278; ++i) { // hier in te vullen hoeveel letters via limiet
            System.out.println("Word " + i + " -> " + generateDictionary(i));
        }
    }
}
