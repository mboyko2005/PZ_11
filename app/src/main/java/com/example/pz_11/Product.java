package com.example.pz_11;

public class Product {
    private String name;
    private int quantity;
    private String unit;

    // Конструктор
    public Product(String name, int quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    // Геттер для name
    public String getName() {
        return name;
    }

    // Сеттер для name
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для quantity
    public int getQuantity() {
        return quantity;
    }

    // Сеттер для quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Геттер для unit
    public String getUnit() {
        return unit;
    }

    // Сеттер для unit
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
