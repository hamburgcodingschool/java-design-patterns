package com.hamburgcodingschool.design.patterns.e4.bridge.solution;

public class Video extends Content {

    private final String videoUrl;

    public Video(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String display() {
        return String.format("Video: %s", videoUrl);
    }
}
