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
public
 abstract class Product {
    private long id;
    private String brand;
    private double price;
    private String model;
    private int marketLaunchDate;
    private double averageRating;

    private List<Comment> comments;
    private List<Shop> shops;
}