package com.codeclan.example.vending_machine.models;

import java.util.ArrayList;
import java.util.List;

public class Drawer {
    private Code code;
    private double price;
    private List<Product> products;

    public Drawer(Code code, double price ){
        this.code = code;
        this.price = price;
        this.products = new ArrayList<Product>();
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void addProduct(Product product){
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public Product extractProduct() {
        Product product = this.products.get(0);
        this.products.remove(0);

        return product;
    }
}
