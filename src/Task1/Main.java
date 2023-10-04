package src.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Liya", "Petersen", "Liyaap"));
        customers.add(new Customer("Søren","Hansen","Hansen123"));
        customers.add(new Customer("Alberte","Jørgensen","Alberte_J"));

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c: customers) {
            System.out.println(c);
        }
    }
}
