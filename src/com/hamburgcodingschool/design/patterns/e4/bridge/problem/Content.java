package com.hamburgcodingschool.design.patterns.e4.bridge.problem;

public abstract class Content {

    private final long createdAt;

    private final String user;

    Content(long createdAt, String user) {
        this.createdAt = createdAt;
        this.user = user;
    }

    public abstract String display();

    public long getCreatedAt() {
        return createdAt;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return display();
    }
}
