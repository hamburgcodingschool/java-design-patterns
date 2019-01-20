package com.hamburgcodingschool.design.patterns.e2.decorator;

public class Product extends AbstractProduct {

    private final int basicPrice;

    public Product(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    @Override
    public int getPrice() {
        return basicPrice;
    }
}
