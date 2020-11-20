package be.intecbrussel.ex_1;

public enum Day {

    MONDAY(true), TUESDAY(true), WEDNESDAY(true),
    THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false);

    private boolean isWeekDay;

    private Day(boolean isWeekDay){
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay() {
        return isWeekDay;
    }

    @Override
    public String toString() {
        return super.toString() +
                " is a weekday= " + isWeekDay;
    }
}
