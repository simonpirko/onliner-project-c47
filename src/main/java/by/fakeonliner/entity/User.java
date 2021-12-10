package by.fakeonliner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phoneNumber;
    private String email;
    private String status;
}
