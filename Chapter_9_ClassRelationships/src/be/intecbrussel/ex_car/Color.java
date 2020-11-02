package be.intecbrussel.ex_car;

public class Color {

    private String name;
    private int[] rgb;

    public Color(String name) {
        this.name= name;
        this.rgb = ColorRgb.getRgbByName(name);
    }

    public int costRePaint(int[] rgb) {
        int sum =0;
        for (int col : rgb){
            sum+=col;
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getRgb() {
        return rgb;
    }

    public void setRgb(int[] rgb) {
        this.rgb = rgb;
    }
}
