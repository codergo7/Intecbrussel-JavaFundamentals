package be.intecbrussel.customer;

public class NullCustomer extends AbstractCustomer {

    @Override
    boolean isNil() {
        return true;
    }

    @Override
    String getName() {
        return "Not Available in Customer Database";
    }
}
