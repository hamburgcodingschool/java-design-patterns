package com.hamburgcodingschool.design.patterns.e4.bridge.problem;

public class Video extends Content {

    private final String videoUrl;

    Video(long createdAt, String user, String videoUrl) {
        super(createdAt, user);
        this.videoUrl = videoUrl;
    }

    @Override
    public String display() {
        return String.format("Video: %s", videoUrl);
    }

    public String getVideoUrl() {
        return videoUrl;
    }
}
