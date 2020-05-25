package practice.nonrelational.repository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import practice.nonrelational.model.Customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * This is the repository to test the basic functionality.
 *
 * @author Ahmet Cetin
 * @since 2020-05-26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void findByFirstName_whenCustomerFound_thenReturnCustomer() {
        Customer customer = new Customer("a", "b");
        customerRepository.save(customer);
        assertEquals(customer, customerRepository.findByFirstName("a"));
    }

    @Test
    public void findByFirstName_whenCustomerNotFound_thenReturnNull() {
        Customer customer = new Customer("a", "b");
        customerRepository.save(customer);
        assertNull(customerRepository.findByFirstName("c"));
    }
}