package intecbrussel.instance_control_flow;
/*
1) Identification of instance members from top to bottom

2) Execution of instance variable assignment and code block from top to bottom.$

3) Execution of Constructor
 */

public class InstanceControlFlow {
    int i =10;

    {
        m1();

        System.out.println("First Instance Block");
    }

    private void m2() {
        System.out.println("i= " + i);
    }

    public InstanceControlFlow() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        InstanceControlFlow icf = new InstanceControlFlow();
        System.out.println("main");
    }

    public void m1(){
        System.out.println(j);
    }

    {
        m2();
        System.out.println("Second Instance Block");
    }

    int j=20;
}
