package practice.nonrelational.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This is the model of a Customer on database.
 *
 * @author Ahmet Cetin
 * @since 2020-05-25
 */
@Data
@NoArgsConstructor
@Document
public class Customer {
    @Id
    String id;
    String firstName;
    String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
