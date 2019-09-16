package com.msyaiful.webservice.api;

import com.msyaiful.webservice.model.EventPastRespone;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api/v1/json/1/eventspastleague.php?id=4328")
    Call <EventPastRespone>events();
}
