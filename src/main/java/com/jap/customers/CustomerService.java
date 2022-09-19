package com.jap.customers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.

    /**
     * This function takes a list of customers, sorts them by name, and returns a list of their names.
     *
     * @param customerList A list of Customer objects
     * @return A list of strings
     */
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {
        List<String> names = new ArrayList<>();
        Collections.sort(customerList);

        for (Customer customer : customerList) {
            names.add(customer.getCustomerName());
        }

        return names;
    }


}
