package com.hamburgcodingschool.design.patterns.e4.bridge.problem;

public class PictureComment extends Comment {

    private final String pictureUrl;

    PictureComment(long createdAt, String user, Content parentContent, String pictureUrl) {
        super(createdAt, user, parentContent);
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String display() {
        return String.format("Picture Comment: %s", pictureUrl);
    }

    public String getPictureUrl() {
        return pictureUrl;
    }
}
