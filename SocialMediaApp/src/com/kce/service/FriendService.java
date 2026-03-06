package com.kce.service;

import com.kce.bean.User;

public class FriendService {

    public void sendRequest(User from,User to){

        to.getFriendRequests().add(from);
        System.out.println("Friend request sent to " + to.getName());
    }

    public void viewRequests(User user){

        for(User u : user.getFriendRequests()){
            System.out.println(u.getName() + " sent request");
        }
    }

    public void acceptRequest(User user,User requester){

        user.getFriends().add(requester);
        requester.getFriends().add(user);

        user.getFriendRequests().remove(requester);

        System.out.println("Friend request accepted");
    }

    public void showFriends(User user){

        System.out.println("Friends List:");

        for(User u : user.getFriends()){
            System.out.println(u.getName()+" "+u.getLocation()+" "+u.getOccupation());
        }
    }
}