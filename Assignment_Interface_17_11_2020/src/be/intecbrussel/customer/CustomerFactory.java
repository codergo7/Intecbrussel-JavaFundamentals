package be.intecbrussel.customer;

public class CustomerFactory {

    public static final String[] NAMES = {"Bob", "Manuel", "Mert", "Elline", "Manon", "Shelbatra", "Matteo",
            "Mustafa", "Anthony", "Ali", "Audric", "Axel", "Dieter", "Kevin", "Salai", "Gokhan"};


    public static AbstractCustomer getCustomer(String name) {
        if (isInsideNAMES(name)) {
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }

    private static boolean isInsideNAMES(String name) {
        for (String n : NAMES) {
            if (n.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
