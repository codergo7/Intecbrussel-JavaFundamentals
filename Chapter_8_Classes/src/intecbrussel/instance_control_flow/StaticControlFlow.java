package intecbrussel.instance_control_flow;

public class StaticControlFlow {

    static int  i =10;
    {
        System.out.println("First Instance Block");

    }

    static {
        m1();

        System.out.println("First Static Block");
    }

    static void m2() {
        System.out.println("static i= " + i);
    }

    public StaticControlFlow() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        StaticControlFlow icf = new StaticControlFlow();
        System.out.println("main");
        StaticControlFlow icf1 = new StaticControlFlow();

    }

    public static void m1(){
        System.out.println("static j: " + j);
    }

    static {
        m2();
        System.out.println("Second Static Block");
    }

    static int j=20;
}
