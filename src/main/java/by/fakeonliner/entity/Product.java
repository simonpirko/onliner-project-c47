package by.fakeonliner.entity;


import java.util.List;

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