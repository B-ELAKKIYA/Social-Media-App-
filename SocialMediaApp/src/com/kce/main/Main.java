package com.kce.main;

import com.kce.bean.*;
import com.kce.service.*;

public class Main {

    public static void main(String[] args){

        UserService userService = new UserService();
        FriendService friendService = new FriendService();
        PostService postService = new PostService();

        User u1 = userService.signup(1,"Alice","10-02-1999",25,"New York","Engineer");
        User u2 = userService.signup(2,"Bob","15-03-1999",25,"San Francisco","Designer");

        friendService.sendRequest(u1,u2);
        friendService.viewRequests(u2);

        friendService.acceptRequest(u2,u1);

        friendService.showFriends(u1);

        Post post = postService.createPost(u1,1,"Enjoying the sunny day!");

        postService.showFeed(u2);

        postService.likePost(post);

        postService.comment(post,u2,"Looks amazing!");

        postService.showFeed(u1);
    }
}