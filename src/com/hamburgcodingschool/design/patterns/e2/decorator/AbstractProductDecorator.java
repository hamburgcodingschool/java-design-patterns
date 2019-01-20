package com.hamburgcodingschool.design.patterns.e2.decorator;

public abstract class AbstractProductDecorator extends AbstractProduct {

    protected final AbstractProduct product;

    protected AbstractProductDecorator(AbstractProduct product) {
        this.product = product;
    }

    public abstract int getPrice();
}
