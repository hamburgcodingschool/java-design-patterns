package com.hamburgcodingschool.design.patterns.e4.bridge.solution;

public abstract class Social {

    protected final long createdAt;
    protected final String user;

    protected final Content content;

    Social(long createdAt, String user, Content content) {
        this.createdAt = createdAt;
        this.user = user;
        this.content = content;
    }

    public abstract String displayMetaInfo();

    public abstract String displayContent();
}
