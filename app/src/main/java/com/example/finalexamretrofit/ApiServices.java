package com.example.finalexamretrofit;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiServices {
    @GET("categories")
    Call<List<String>> categories();
    @GET("category/{smartphone}")
    Call<productsResponse> products(@Path("smartphone") String smartphone);
    @GET("{id}")
    Call<productsResponse> productsById(@Path("id") String id);


    class RetrofitClass {
        public static String BASE_URL = "https://dummyjson.com/products/";

        public static ApiServices getRetrofitInstance(){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit.create(ApiServices.class);
        }
    }
}
