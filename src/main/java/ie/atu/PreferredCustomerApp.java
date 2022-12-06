package ie.atu;

public class PreferredCustomerApp {
    public static void main(String[] args) {
        PreferredCustomer Customer_1 = new PreferredCustomer("Dave", "Mervue", "123", "888", true, "€500", "5%");
        System.out.println(Customer_1.toString());

        PreferredCustomer Customer_2 = new PreferredCustomer("Tom", "Dublin", "777", "000", false, "€1000", "6%");
        System.out.println(Customer_2.toString());
    }
}
