package com.hamburgcodingschool.design.patterns.e4.bridge.problem;

public class Picture extends Content {

    private final String pictureUrl;

    Picture(long createdAt, String user, String pictureUrl) {
        super(createdAt, user);
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String display() {
        return String.format("Picture: %s", pictureUrl);
    }

    public String getPictureUrl() {
        return pictureUrl;
    }
}
