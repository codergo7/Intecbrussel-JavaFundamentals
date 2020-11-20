package be.intecbrussel.ex_1;

public class DayApp {

    public static void main(String[] args) {

        //Day day = Day.FRIDAY;

        for(Day day1 : Day.values()){
            System.out.println(day1.name());
        }
    }
}
