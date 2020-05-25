package practice.nonrelational.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import practice.nonrelational.model.Customer;

/**
 * This is the repository for {@link Customer}.
 *
 * @author Ahmet Cetin
 * @since 2020-05-26
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByFirstName(String firstName);
}
