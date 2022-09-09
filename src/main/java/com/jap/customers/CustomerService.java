package com.jap.customers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {
        List<String> names = new ArrayList<>();
        Collections.sort(customerList);

        for (Customer customer : customerList) {
            names.add(customer.getCustomerName());
        }

        return names;
    }


}
