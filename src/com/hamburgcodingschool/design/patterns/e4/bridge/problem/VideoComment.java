package com.hamburgcodingschool.design.patterns.e4.bridge.problem;

public class VideoComment extends Comment {

    private final String videoUrl;

    VideoComment(long createdAt, String user, Content parentContent, String videoUrl) {
        super(createdAt, user, parentContent);
        this.videoUrl = videoUrl;
    }

    @Override
    public String display() {
        return String.format("Video Comment: %s", videoUrl);
    }

    public String getVideoUrl() {
        return videoUrl;
    }
}
