package by.fakeonliner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public abstract class Product {
    private long id;
    private String brand;
    private BigDecimal price;
    private String model;
    private int marketLaunchDate;
    private double averageRating;
    private String description;

    private List<Comment> comments;
    private List<Shop> shops;
}