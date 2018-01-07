package com.hamburgcodingschool.design.patterns.e4.bridge.solution;

public class Post extends Social {

    Post(long createdAt, String user, Content content) {
        super(createdAt, user, content);
    }

    @Override
    public String displayMetaInfo() {
        return String.format("Post by %s at %s", user, createdAt);
    }

    @Override
    public String displayContent() {
        return String.format("%n%s%n%s", displayMetaInfo(), content.display());
    }
}
