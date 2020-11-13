package be.intecbrussel.color_ex;

public class ColorApp {

    public static void main(String[] args) {

        Color color1 = Color.GREEN;
        Color color2 = Color.BLUE;

        System.out.println(color1);
        System.out.println(color1.name());
        System.out.println(color1.ordinal());
        System.out.println(color2);

        for (Color color:Color.values()){
            System.out.println(color);
        }
    }
}
