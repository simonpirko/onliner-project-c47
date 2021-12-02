package by.fakeonliner.entity;

import java.util.List;

abstract class Product {

    private long id;
    private String brand;
    private String price;
    private String model;
    private String marketLaunchDate;
    private double averageRating;

    private List<Comment> commentList;
    private List<Shop> shopList;
}