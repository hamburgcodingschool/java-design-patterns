package com.hamburgcodingschool.design.patterns.e2.decorator;

public class DiscountDecorator extends AbstractProductDecorator {

    private final int discount;

    protected DiscountDecorator(AbstractProduct product, int discount) {
        super(product);
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return product.getPrice() - discount;
    }
}
