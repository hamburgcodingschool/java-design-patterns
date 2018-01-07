package com.hamburgcodingschool.design.patterns.e4.bridge.problem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Content> contentList = new ArrayList<>();
        Text text = new Text(System.currentTimeMillis(), "Mark", "My first social media post!");
        contentList.add(text);
        TextComment textComment = new TextComment(System.currentTimeMillis(), "Teresa", text, "Yay!");
        contentList.add(textComment);
        Picture picture = new Picture(System.currentTimeMillis(), "Teresa", "picture.jpg");
        contentList.add(picture);
        TextComment textComment1 = new TextComment(System.currentTimeMillis(), "Mark", picture, "Looks cool!");
        contentList.add(textComment1);
        Video video = new Video(System.currentTimeMillis(), "Mark", "video.mov");
        contentList.add(video);
        TextComment textComment2 = new TextComment(System.currentTimeMillis(), "Teresa", video, "Hihihihi");
        contentList.add(textComment2);
        PictureComment pictureComment = new PictureComment(System.currentTimeMillis(), "Mark", video, "still.jpg");
        contentList.add(pictureComment);
        VideoComment videoComment = new VideoComment(System.currentTimeMillis(), "Teresa", video, "metoo.mov");
        contentList.add(videoComment);

        for (Content content : contentList) {
            System.out.println(content);
        }
    }
}
