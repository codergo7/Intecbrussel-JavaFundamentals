package be.intecbrussel.ex_13_3;

public interface Pig {

    void grunt();

    default void fly(){
        System.out.println("The pig is flying");
    }
}
