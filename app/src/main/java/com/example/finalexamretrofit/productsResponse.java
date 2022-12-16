package com.example.finalexamretrofit;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class productsResponse {
    //"products": [
    //        {
    //            "id": 1,
    //            "title": "iPhone 9",
    //            "description": "An apple mobile which is nothing like apple",
    //            "price": 549,
    //            "discountPercentage": 12.96,
    //            "rating": 4.69,
    //            "stock": 94,
    //            "brand": "Apple",
    //            "category": "smartphones",
    //            "thumbnail": "https://i.dummyjson.com/data/products/1/thumbnail.jpg",
    //            "images": [
    //                "https://i.dummyjson.com/data/products/1/1.jpg",
    //                "https://i.dummyjson.com/data/products/1/2.jpg",
    //                "https://i.dummyjson.com/data/products/1/3.jpg",
    //                "https://i.dummyjson.com/data/products/1/4.jpg",
    //                "https://i.dummyjson.com/data/products/1/thumbnail.jpg"
    //            ]
    //        },
    @SerializedName("products")

    ArrayList<products> productsArrayList;

    public ArrayList<products> getProductsArrayList() {
        return productsArrayList;
    }

    public void setProductsArrayList(ArrayList<products> productsArrayList) {
        this.productsArrayList = productsArrayList;
    }

    public productsResponse(ArrayList<products> productsArrayList) {
        this.productsArrayList = productsArrayList;
    }

    public productsResponse() {

    }
}
class products{
    @SerializedName("discountPercentage")
    double discountPercentage;
    @SerializedName("description")
    String description;
    @SerializedName("rating")
    double rating;
    @SerializedName("id")
    int id;
    @SerializedName("title")

    String title;
    @SerializedName("stock")
    int stock;
    @SerializedName("brand")
    String brand;
    @SerializedName("category")
    String category;
    @SerializedName("price")

    int price;
    @SerializedName("images")
    ArrayList<String> images;
    @SerializedName("thumbnail")

    String thumbnail;
    @SerializedName("smartphones")
    String smartphones;
    @SerializedName("Host")
    String Host;

    @SerializedName("User-Agent")
    String User_Agent;
    @SerializedName("Accept")
    String Accept;
    @SerializedName("Accept-Encoding")
    String Accept_Encoding;
    @SerializedName("Connection")
    String Connection;

    @Override
    public String toString() {
        return "products{" +
                "discountPercentage=" + discountPercentage +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", stock=" + stock +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", images=" + images +
                ", thumbnail='" + thumbnail + '\'' +
                ", smartphones='" + smartphones + '\'' +
                ", Host='" + Host + '\'' +
                ", User_Agent='" + User_Agent + '\'' +
                ", Accept='" + Accept + '\'' +
                ", Accept_Encoding='" + Accept_Encoding + '\'' +
                ", Connection='" + Connection + '\'' +
                '}';
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(String smartphones) {
        this.smartphones = smartphones;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public String getUser_Agent() {
        return User_Agent;
    }

    public void setUser_Agent(String user_Agent) {
        User_Agent = user_Agent;
    }

    public String getAccept() {
        return Accept;
    }

    public void setAccept(String accept) {
        Accept = accept;
    }

    public String getAccept_Encoding() {
        return Accept_Encoding;
    }

    public void setAccept_Encoding(String accept_Encoding) {
        Accept_Encoding = accept_Encoding;
    }

    public String getConnection() {
        return Connection;
    }

    public void setConnection(String connection) {
        Connection = connection;
    }

    public products() {

    }

    public products(double discountPercentage, String description, double rating, int id, String title, int stock, String brand, String category, int price, ArrayList<String> images, String thumbnail, String smartphones, String host, String user_Agent, String accept, String accept_Encoding, String connection) {
        this.discountPercentage = discountPercentage;
        this.description = description;
        this.rating = rating;
        this.id = id;
        this.title = title;
        this.stock = stock;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.images = images;
        this.thumbnail = thumbnail;
        this.smartphones = smartphones;
        Host = host;
        User_Agent = user_Agent;
        Accept = accept;
        Accept_Encoding = accept_Encoding;
        Connection = connection;
    }
}
