package practice.nonrelational.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.nonrelational.model.Customer;
import practice.nonrelational.repository.CustomerRepository;

import java.util.List;

/**
 * This is the customer service implementation where customer related logic resides.
 *
 * @author Ahmet Cetin
 * @since 2020-05-26
 */
@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerByFirstName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
