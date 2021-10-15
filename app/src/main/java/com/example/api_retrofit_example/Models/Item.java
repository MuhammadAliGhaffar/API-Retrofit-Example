package com.example.api_retrofit_example.Models;

import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("product_ID")
    private int product_ID;
    @SerializedName("product_image")
    private int product_image;
    @SerializedName("product_name")
    private String product_name;
    @SerializedName("product_price")
    private double product_price;
    @SerializedName("product_desc")
    private String product_desc;

    public Item(int product_ID, int product_image, String product_name, double product_price, String product_desc) {
        this.product_ID = product_ID;
        this.product_image = product_image;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_desc = product_desc;
    }

    public int getProduct_ID() {
        return product_ID;
    }


    public int getProduct_image() {
        return product_image;
    }


    public String getProduct_name() {
        return product_name;
    }


    public double getProduct_price() {
        return product_price;
    }


    public String getProduct_desc() {
        return product_desc;
    }


    @Override
    public String toString() {
        return "Item{" +
                "product_ID=" + product_ID +
                ", product_image=" + product_image +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", product_desc='" + product_desc + '\'' +
                '}';
    }
}
