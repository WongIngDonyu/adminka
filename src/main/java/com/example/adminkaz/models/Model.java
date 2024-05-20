package com.example.adminkaz.models;


import java.util.UUID;

public class Model  {
    protected UUID id;
    private String name;
    private Category category;
    private Brand brand;

    public Model() {
    }

    public Model(UUID id, String name, Category category, Brand brand) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public enum Category {
        Car(0), Buss(1), Truck(2), Motorcycle(3);

        int number;
        Category(int number) {
            this.number=number;
        }
        public int getNumber(){
            return number;
        }
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
