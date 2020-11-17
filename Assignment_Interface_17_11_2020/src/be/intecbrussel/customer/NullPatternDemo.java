package be.intecbrussel.customer;

public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 =
                CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 =
                CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 =
                CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 =
                CustomerFactory.getCustomer("Manuel");
        System.out.println("____________________________\n" + "Customers" + "\n____________________________");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
        System.out.println("____________________________");
    }
}