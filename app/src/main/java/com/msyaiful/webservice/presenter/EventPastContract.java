package com.msyaiful.webservice.presenter;

import com.msyaiful.webservice.model.EventPast;

import java.util.ArrayList;
import java.util.List;

public interface EventPastContract {
    void listMatch(ArrayList<EventPast> eventPasts);
}
