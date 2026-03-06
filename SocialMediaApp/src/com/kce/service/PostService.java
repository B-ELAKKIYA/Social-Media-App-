package com.kce.service;

import com.kce.bean.*;
import com.kce.util.DataStore;

public class PostService {

    public Post createPost(User user,int id,String content){

        Post post = new Post(id,content,user);

        user.getPosts().add(post);
        DataStore.posts.add(post);

        System.out.println("Post created");

        return post;
    }

    public void showFeed(User user){

        System.out.println("----- NEWS FEED -----");

        for(User friend : user.getFriends()){

            for(Post p : friend.getPosts()){

                System.out.println("Author: "+p.getAuthor().getName());
                System.out.println("Post: "+p.getContent());
                System.out.println("Likes: "+p.getLikes());

                for(Comment c : p.getComments()){
                    System.out.println(c.getUser().getName()+" : "+c.getText());
                }

                System.out.println("-------------------");
            }
        }
    }

    public void likePost(Post post){
        post.likePost();
    }

    public void comment(Post post,User user,String text){

        Comment c = new Comment(user,text);
        post.getComments().add(c);
    }
}