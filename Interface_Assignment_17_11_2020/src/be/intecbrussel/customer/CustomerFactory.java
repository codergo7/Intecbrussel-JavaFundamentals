package be.intecbrussel.customer;

public class CustomerFactory {

    public static final String[] NAMES = {"Bob", "Manuel", "Mert", "Elline", "Manon", "Shelbatra", "Matteo",
            "Mustafa", "Anthony", "Ali", "Audric", "Axel", "Dieter", "Kevin", "Salai", "Gokhan"};


    // if the name is in de list,
    // creates an instance of RealCustomer using name as parameter then returns it
    //otherwise creates an instance of NullCustomer and returns it
    public static AbstractCustomer getCustomer(String name) {
        if (isInsideTheNAMES(name)) {
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }

    //if the parameter name is inside the NAMES list, it returns true, otherwise false.
    private static boolean isInsideTheNAMES(String name) {
        for (String n : NAMES) {
            if (n.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
