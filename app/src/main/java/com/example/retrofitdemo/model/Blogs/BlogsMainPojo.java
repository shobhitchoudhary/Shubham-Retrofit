package com.example.retrofitdemo.model.Blogs;

import java.util.ArrayList;

public class BlogsMainPojo {
    private String createdAt;

    private String comments;

    private String id;

    private ArrayList<BlogsMedia> media;

    private ArrayList<User> user;

    private String content;

    private String likes;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<BlogsMedia> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<BlogsMedia> media) {
        this.media = media;
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "ClassPojo [createdAt = " + createdAt + ", comments = " + comments + ", id = " + id + ", media = " + media + ", user = " + user + ", content = " + content + ", likes = " + likes + "]";
    }
}
