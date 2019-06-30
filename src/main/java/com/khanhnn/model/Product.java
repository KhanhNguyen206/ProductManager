package com.khanhnn.model;

public class Product {
    private int id;
    private String productName;
    private String productLine;
    private double buyPrice;

    public Product() {
    }

    public Product(int id, String productName, String productLine, double buyPrice) {
        this.id = id;
        this.productName = productName;
        this.productLine = productLine;
        this.buyPrice = buyPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }
}
