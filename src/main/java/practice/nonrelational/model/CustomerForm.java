package practice.nonrelational.model;

import lombok.Value;

/**
 * This is the Customer form which is used as input from API.
 *
 * @author Ahmet Cetin
 * @since 2020-05-26
 */
@Value
public class CustomerForm {
    String firstName;
    String lastName;
}
