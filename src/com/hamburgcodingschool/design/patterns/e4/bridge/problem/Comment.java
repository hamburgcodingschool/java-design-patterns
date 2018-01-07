package com.hamburgcodingschool.design.patterns.e4.bridge.problem;

public abstract class Comment extends Content {

    private final Content parentContent;

    Comment(long createdAt, String user, Content parentContent) {
        super(createdAt, user);
        this.parentContent = parentContent;
    }
}
