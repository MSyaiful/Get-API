package com.msyaiful.webservice.presenter;

import android.util.Log;

import com.msyaiful.webservice.api.ApiClient;
import com.msyaiful.webservice.model.EventPast;
import com.msyaiful.webservice.model.EventPastRespone;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventPastPresenter{
    private EventPastContract eventPastContract;
    public EventPastPresenter(EventPastContract eventPastContract){
        this.eventPastContract = eventPastContract;
    }
    public void index() {
        Call<EventPastRespone> eventPastCall = new ApiClient().apiService.events();
        eventPastCall.enqueue(new Callback<EventPastRespone>() {

            @Override
            public void onResponse(Call<EventPastRespone> call, Response<EventPastRespone> response) {
                eventPastContract.listMatch(response.body().getEvents());
            }

            @Override
            public void onFailure(Call<EventPastRespone> call, Throwable t) {

            }
        });
    }
}