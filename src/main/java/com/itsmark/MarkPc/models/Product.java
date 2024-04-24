package com.itsmark.MarkPc.models;

import jakarta.persistence.*;

import java.util.Date;

/**
 * @Entity because this class is a model that allows us to create a table in the database.
 * @Table allows us to name our table i.e."products".
 */
@Entity
@Table(name = "products")
public class Product {
    /**
     * Primary key identifier for the product.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Increments Id automatically with the strategy being IDENTITY.
    private int id;

    private String name;// Name of the product.
    private String brand;// Brand of the product.
    private String category; // Category of the product.
    private double price; // Price of the product.

    /**
     * Description of the product.
     */
    @Column(columnDefinition = "Text")
    private String description;
    private Date createdAt; // Date and time when the product was created.
    private String imageFileName; // Filename of the product's image.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
