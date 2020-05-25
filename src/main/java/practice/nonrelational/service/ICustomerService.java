package practice.nonrelational.service;

import practice.nonrelational.model.Customer;

import java.util.List;

/**
 * This is the customer service interface.
 *
 * @author Ahmet Cetin
 * @since 2020-05-26
 */
public interface ICustomerService {
    void saveCustomer(Customer customer);

    Customer getCustomerByFirstName(String firstName);

    List<Customer> getCustomers();
}
