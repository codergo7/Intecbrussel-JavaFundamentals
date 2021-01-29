package intecbrussel.instance_control_flow;

/*
1) Identification of instance member from Parent to Child

2) Execution of instance variable assignment and instance block only in Parent class

3) Execution of Parent Constructor

4) Execution of instance variable assignment and instance block in Child class

5)Execution of Child Constructor
 */


public class Child extends Parent{
    int x =100;

    {
        m3();

        System.out.println("Child First Instance Block");
    }

    public void m4() {
        System.out.println("Child x= " + x);
    }

    public Child() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {

        Child icf = new Child();
        System.out.println("Child main");
        //Child icf1 = new Child();

    }

    public void m3(){
        System.out.println("Child y: " + y);
    }

    {
        m4();
        System.out.println("Child Second Instance Block");
    }

    int y=200;
}
