package intecbrussel.instance_control_flow;

public class Parent {
    int i =10;

    {
        m1();

        System.out.println("Parent First Instance Block");
    }

    public void m2() {
        System.out.println("Parent i= " + i);
    }

    public Parent() {
        System.out.println("Parent Constructor");
    }

    public static void main(String[] args) {
        //Child child = new Child();
        System.out.println("Parent main");
    }



    public void m1(){
        System.out.println("Parent j: " + j);
    }

    {
        m2();
        System.out.println("Parent Second Instance Block");
    }

    int j=20;
}
