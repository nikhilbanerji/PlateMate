package com.nbsa.plateMate.model;

public class Ingredient {
    private String name; // Name of the ingredient
    private String unit; // Unit of measurement
    private double amount; // Amount of the ingredient
    private String aisle; // Aisle where the ingredient can be found
    private String image; // URL of the ingredient image

    // Constructors, Getters, and Setters
    public Ingredient() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}