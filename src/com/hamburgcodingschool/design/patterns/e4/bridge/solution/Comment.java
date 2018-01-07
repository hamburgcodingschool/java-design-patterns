package com.hamburgcodingschool.design.patterns.e4.bridge.solution;

public class Comment extends Social {
    Comment(long createdAt, String user, Content content) {
        super(createdAt, user, content);
    }

    @Override
    public String displayMetaInfo() {
        return String.format("Comment by %s", user);
    }

    @Override
    public String displayContent() {
        return String.format("%s%n%s", displayMetaInfo(), content.display());
    }
}
