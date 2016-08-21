package com.example.gagandeepbansal.myapplication.model;

import android.content.Context;

import com.example.gagandeepbansal.myapplication.R;

import java.util.List;
import java.util.ArrayList;


/**
 * Created by gagandeepbansal on 13-08-2016.
 */
public class EventModel {
    private String title;
    private int image;
    private String address;
    private String date;
    private String time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public static List<EventModel> getEvents(int[] image) {

        List events = new ArrayList<EventModel>();
        for (int i=0;i<5;i++) {
            EventModel event = new EventModel();
            event.setTitle("event " + i);
            event.setAddress("address " + i);
            event.setDate("date " + i);
            event.setTitle("title " + i);
            event.setTime("time " + i);
            event.setImage(image[i]);
            events.add(event);
        }
        return events;
    }
}

