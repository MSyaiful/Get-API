package com.msyaiful.webservice.api;

import android.os.Build;

import com.msyaiful.webservice.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BuildConfig.LINK_API)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public ApiService apiService = retrofit.create(ApiService.class);
}
