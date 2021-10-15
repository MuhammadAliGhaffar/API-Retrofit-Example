package com.example.api_retrofit_example.Models;

import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("id")
    private int product_ID;
    @SerializedName("image")
    private String product_image;
    @SerializedName("name")
    private String product_name;
    @SerializedName("price")
    private double product_price;
    @SerializedName("desc")
    private String product_desc;
    @SerializedName("color")
    private String product_color;

    public Item(int product_ID, String product_image, String product_name, double product_price, String product_desc,String product_color) {
        this.product_ID = product_ID;
        this.product_image = product_image;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_desc = product_desc;
        this.product_color =  product_color;
    }

    public int getProduct_ID() {
        return product_ID;
    }


    public String getProduct_image() {
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

    public String getProduct_color() {
        return product_color;
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
