package practice.nonrelational.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import practice.nonrelational.model.Customer;
import practice.nonrelational.model.CustomerForm;
import practice.nonrelational.service.CustomerService;

import java.util.List;

/**
 * This is the customer controller where customer data is accessed.
 *
 * @author Ahmet Cetin
 * @since 2020-05-26
 */
@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    public void saveCustomer(@RequestBody CustomerForm customerModel) {
        customerService.saveCustomer(new Customer(customerModel.getFirstName(), customerModel.getLastName()));
    }

    @GetMapping("/firstName/{firstName}")
    public Customer getCustomerByFirstName(@PathVariable String firstName) {
        return customerService.getCustomerByFirstName(firstName);
    }
}
