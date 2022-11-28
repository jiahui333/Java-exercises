import shop.Address;
import shop.Customer;

import java.util.Arrays;

public class JavaApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Address addressJoy = new Address("Amstel", "123a");

        customer.setAddress(addressJoy);
        customer.setName("Joy");
        customer.setInterests(Arrays.asList("coding", "reading"));


        System.out.println(customer.getName() + " loves " + customer.getInterests().get(0) + "\n" +
                "She lives in " + customer.getAddress().getStreet() + customer.getAddress().getNumber() + ".");

    }
}