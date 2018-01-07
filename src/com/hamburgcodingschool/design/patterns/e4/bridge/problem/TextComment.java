package com.hamburgcodingschool.design.patterns.e4.bridge.problem;

public class TextComment extends Comment {

    private final String text;

    TextComment(long createdAt, String user, Content parentContent, String text) {
        super(createdAt, user, parentContent);
        this.text = text;
    }

    @Override
    public String display() {
        return String.format("Text Comment: %s", text);
    }

    public String getText() {
        return text;
    }
}
