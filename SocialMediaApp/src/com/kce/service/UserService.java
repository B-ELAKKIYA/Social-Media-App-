package com.kce.service;

import com.kce.bean.User;
import com.kce.util.DataStore;

public class UserService {

    public User signup(int id,String name,String dob,int age,String location,String occupation){

        User user = new User(id,name,dob,age,location,occupation);
        DataStore.users.add(user);

        System.out.println("User created successfully");

        return user;
    }
}