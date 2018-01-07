package com.hamburgcodingschool.design.patterns.e4.bridge.solution;

public class Text extends Content {

    private final String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String display() {
        return String.format("Text: %s", text);
    }
}
