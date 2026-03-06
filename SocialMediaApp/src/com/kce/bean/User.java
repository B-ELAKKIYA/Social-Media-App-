package com.kce.bean;

import java.util.*;

public class User {

    private int id;
    private String name;
    private String dob;
    private int age;
    private String location;
    private String occupation;

    private List<User> friends = new ArrayList<>();
    private List<User> friendRequests = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    public User(int id,String name,String dob,int age,String location,String occupation){
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.age=age;
        this.location=location;
        this.occupation=occupation;
    }

    public int getId(){ return id; }
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public String getDob(){ return dob; }
    public String getLocation(){ return location; }
    public String getOccupation(){ return occupation; }

    public List<User> getFriends(){ return friends; }
    public List<User> getFriendRequests(){ return friendRequests; }
    public List<Post> getPosts(){ return posts; }
}
