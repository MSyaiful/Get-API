package com.msyaiful.webservice.model;

import java.util.ArrayList;

import retrofit2.http.GET;

public class EventPastRespone {
    ArrayList<EventPast> events;

    public ArrayList<EventPast> getEvents() {
        return events;
    }
}
