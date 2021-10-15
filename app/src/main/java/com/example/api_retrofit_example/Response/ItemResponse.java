package com.example.api_retrofit_example.Response;

import androidx.annotation.NonNull;

import com.example.api_retrofit_example.Models.Item;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ItemResponse {

    @SerializedName("results")
    @Expose
    private ArrayList<Item> results;

    public ArrayList<Item> getResults() {
        return results;
    }

    @NonNull
    @Override
    public String toString() {
        return results.toString();
    }
}
