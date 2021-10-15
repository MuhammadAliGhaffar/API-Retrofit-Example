package com.example.api_retrofit_example.Repository;

import com.example.api_retrofit_example.Models.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/v1/63a087f0-b6cc-41f4-810b-e600ca41afda")
    Call<List<Item>> getAllItems();
}
