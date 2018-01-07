package com.hamburgcodingschool.design.patterns.e4.bridge.solution;

public class Picture extends Content {

    private final String pictureUrl;

    public Picture(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String display() {
        return String.format("Picture: %s", pictureUrl);
    }
}
