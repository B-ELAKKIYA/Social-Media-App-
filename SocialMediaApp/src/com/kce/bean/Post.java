package com.kce.bean;

import java.util.*;

public class Post {

    private int id;
    private String content;
    private User author;

    private int likes;
    private List<Comment> comments = new ArrayList<>();

    public Post(int id,String content,User author){
        this.id=id;
        this.content=content;
        this.author=author;
    }

    public int getId(){ return id; }
    public String getContent(){ return content; }
    public User getAuthor(){ return author; }

    public int getLikes(){ return likes; }
    public void likePost(){ likes++; }

    public List<Comment> getComments(){ return comments; }
}
