package be.intecbrussel.car_association;

import java.util.Arrays;

public class Color {

    private String name;
    private int[] rgb;

    public Color(String name) {
        this.name= name;
        /*
        according to name of the color gets rgb array and assign it this.rgb data field
        using  getRgbByName method of ColorRgb class
         */
        this.rgb = ColorRgb.getRgbByName(name);
    }

    // returns sum of parameter array
    public int costRePaint(int[] rgb) {
        return Arrays.stream(rgb).sum();
    }


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.rgb = ColorRgb.getRgbByName(name);
    }

    public int[] getRgb() {
        return rgb;
    }
}
