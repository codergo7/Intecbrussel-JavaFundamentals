package be.intecbrussel.customer;

public class RealCustomer extends AbstractCustomer {

    RealCustomer(String name){
        this.name = name;
    }

    @Override
    boolean isNil() {
        return false;
    }

    @Override
    String getName() {
        return this.name;
    }
}
