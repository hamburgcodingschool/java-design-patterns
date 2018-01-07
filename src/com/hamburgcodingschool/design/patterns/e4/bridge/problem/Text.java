package com.hamburgcodingschool.design.patterns.e4.bridge.problem;

public class Text extends Content {

    private final String text;

    Text(long createdAt, String user, String text) {
        super(createdAt, user);
        this.text = text;
    }

    @Override
    public String display() {
        return String.format("Text: %s", text);
    }

    public String getText() {
        return text;
    }
}
