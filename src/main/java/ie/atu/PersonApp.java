package ie.atu;

public class PersonApp {

    public static void main(String[] args) {
        Customer Part1 = new Customer("Dave", "Mervue", "123", "888", true);
        System.out.println(Part1.toString());

        Customer Part2 = new Customer();
        Part2.setName("Andrew");
        System.out.println("\nName : " + Part2.getName());
        Part2.setAddress("Galway");
        System.out.println("Address : " + Part2.getAddress());
        Part2.setPhone("333");
        System.out.println("Phone : " + Part2.getPhone());
        Part2.setCustomerNumber("111");
        System.out.println("Customer Number : " + Part2.getCustomerNumber());
        Part2.setMailingList(false);
        System.out.println("Mailing List : " + Part2.getMailingList());
    }
}
