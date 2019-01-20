package com.hamburgcodingschool.design.patterns.e2.decorator;

public class Main {
    public static void main(String[] args) {
        Product blouse = new Product(3999);
        DiscountDecorator discount = new DiscountDecorator(blouse, 1000);

        int price = discount.getPrice();
        System.out.println(String.format("Checkout price: %d", price));
    }
}
