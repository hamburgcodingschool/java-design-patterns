package com.hamburgcodingschool.design.patterns.e4.bridge.solution;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Social> socialList = new ArrayList<>();
        Post post = new Post(System.currentTimeMillis(), "Mark", new Text("My first social media post!"));
        socialList.add(post);
        Comment comment = new Comment(System.currentTimeMillis(), "Teresa", new Text("Yay!"));
        socialList.add(comment);
        Post picturePost = new Post(System.currentTimeMillis(), "Teresa", new Picture("picture.jpg"));
        socialList.add(picturePost);
        Comment comment1 = new Comment(System.currentTimeMillis(), "Mark", new Text("Looks cool!"));
        socialList.add(comment1);
        Post videoPost = new Post(System.currentTimeMillis(), "Mark", new Video("video.mov"));
        socialList.add(videoPost);
        Comment textComment = new Comment(System.currentTimeMillis(), "Teresa", new Text("Hihihihi"));
        socialList.add(textComment);
        Comment pictureComment = new Comment(System.currentTimeMillis(), "Mark", new Picture("still.jpg"));
        socialList.add(pictureComment);
        Comment videoComment = new Comment(System.currentTimeMillis(), "Teresa", new Video("metoo.mov"));
        socialList.add(videoComment);

        for (Social social : socialList) {
            System.out.println(social.displayContent());
        }
    }
}
