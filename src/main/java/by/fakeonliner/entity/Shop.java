package by.fakeonliner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Shop {
    private long id;
    private String login;
    private String password;
    private String name;
    private String phoneNumber;
    private String contactAddress;
    private String email;
    private String operatingMode;
    private String deliveryPrice;
    private String description;
    private String rating;
    private String deliveryType;

    private List<Comment> comments;
}
