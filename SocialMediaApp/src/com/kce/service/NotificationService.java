package com.kce.service;

import com.kce.bean.Notification;
import java.util.*;

public class NotificationService {

    Map<Integer,List<Notification>> notifications = new HashMap<>();

    public void addNotification(int userId,String message){

        notifications.putIfAbsent(userId,new ArrayList<>());

        notifications.get(userId).add(new Notification(message));
    }

    public void showNotifications(int userId){

        List<Notification> list = notifications.get(userId);

        if(list==null){
            System.out.println("No notifications");
            return;
        }

        for(Notification n : list){
            System.out.println(n.getMessage());
        }

        list.clear();
    }
}