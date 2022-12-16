package com.example.finalexamretrofit;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CategoriesResponse {
ArrayList<category> categories;

    public ArrayList<category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<category> categories) {
        this.categories = categories;
    }

    public CategoriesResponse(ArrayList<category> categories) {
        this.categories = categories;
    }
}
class category {
    @SerializedName("smartphones")
    String smartphones;
    @SerializedName("laptops")
    String laptops;
    @SerializedName("fragrances")
    String fragrances;
    @SerializedName("skincare")
    String skincare;
    @SerializedName("groceries")
    String groceries;
    @SerializedName("home-decoration")
    String home_decoration;
    @SerializedName("furniture")
    String furniture;
    @SerializedName("tops")
    String tops;
    @SerializedName("womens-dresses")
    String womens_dresses;
    @SerializedName("womens-shoes")
    String womens_shoes;
    @SerializedName("mens-shirts")
    String mens_shirts;
    @SerializedName("mens-shoes")
    String mens_shoes;
    @SerializedName("mens-watches")
    String mens_watches;
    @SerializedName("womens-watches")
    String womens_watches;
    @SerializedName("womens-bags")
    String womens_bags;
    @SerializedName("womens-jewellery")
    String womens_jewellery;
    @SerializedName("sunglasses")
    String sunglasses;
    @SerializedName("automotive")
    String automotive;
    @SerializedName("motorcycle")
    String motorcycle;
    @SerializedName("lighting")
    String lighting;

    public String getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(String smartphones) {
        this.smartphones = smartphones;
    }

    public String getLaptops() {
        return laptops;
    }

    public void setLaptops(String laptops) {
        this.laptops = laptops;
    }

    public String getFragrances() {
        return fragrances;
    }

    public void setFragrances(String fragrances) {
        this.fragrances = fragrances;
    }

    public String getSkincare() {
        return skincare;
    }

    public void setSkincare(String skincare) {
        this.skincare = skincare;
    }

    public String getGroceries() {
        return groceries;
    }

    public void setGroceries(String groceries) {
        this.groceries = groceries;
    }

    public String getHome_decoration() {
        return home_decoration;
    }

    public void setHome_decoration(String home_decoration) {
        this.home_decoration = home_decoration;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public String getTops() {
        return tops;
    }

    public void setTops(String tops) {
        this.tops = tops;
    }

    public String getWomens_dresses() {
        return womens_dresses;
    }

    public void setWomens_dresses(String womens_dresses) {
        this.womens_dresses = womens_dresses;
    }

    public String getWomens_shoes() {
        return womens_shoes;
    }

    public void setWomens_shoes(String womens_shoes) {
        this.womens_shoes = womens_shoes;
    }

    public String getMens_shirts() {
        return mens_shirts;
    }

    public void setMens_shirts(String mens_shirts) {
        this.mens_shirts = mens_shirts;
    }

    public String getMens_shoes() {
        return mens_shoes;
    }

    public void setMens_shoes(String mens_shoes) {
        this.mens_shoes = mens_shoes;
    }

    public String getMens_watches() {
        return mens_watches;
    }

    public void setMens_watches(String mens_watches) {
        this.mens_watches = mens_watches;
    }

    public String getWomens_watches() {
        return womens_watches;
    }

    public void setWomens_watches(String womens_watches) {
        this.womens_watches = womens_watches;
    }

    public String getWomens_bags() {
        return womens_bags;
    }

    public void setWomens_bags(String womens_bags) {
        this.womens_bags = womens_bags;
    }

    public String getWomens_jewellery() {
        return womens_jewellery;
    }

    public void setWomens_jewellery(String womens_jewellery) {
        this.womens_jewellery = womens_jewellery;
    }

    public String getSunglasses() {
        return sunglasses;
    }

    public void setSunglasses(String sunglasses) {
        this.sunglasses = sunglasses;
    }

    public String getAutomotive() {
        return automotive;
    }

    public void setAutomotive(String automotive) {
        this.automotive = automotive;
    }

    public String getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(String motorcycle) {
        this.motorcycle = motorcycle;
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public category(String smartphones, String laptops, String fragrances, String skincare, String groceries, String home_decoration, String furniture, String tops, String womens_dresses, String womens_shoes, String mens_shirts, String mens_shoes, String mens_watches, String womens_watches, String womens_bags, String womens_jewellery, String sunglasses, String automotive, String motorcycle, String lighting) {
        this.smartphones = smartphones;
        this.laptops = laptops;
        this.fragrances = fragrances;
        this.skincare = skincare;
        this.groceries = groceries;
        this.home_decoration = home_decoration;
        this.furniture = furniture;
        this.tops = tops;
        this.womens_dresses = womens_dresses;
        this.womens_shoes = womens_shoes;
        this.mens_shirts = mens_shirts;
        this.mens_shoes = mens_shoes;
        this.mens_watches = mens_watches;
        this.womens_watches = womens_watches;
        this.womens_bags = womens_bags;
        this.womens_jewellery = womens_jewellery;
        this.sunglasses = sunglasses;
        this.automotive = automotive;
        this.motorcycle = motorcycle;
        this.lighting = lighting;
    }
}


