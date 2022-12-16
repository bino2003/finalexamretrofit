package com.example.finalexamretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.finalexamretrofit.databinding.ActivityGetProductsByIdBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetProductsById extends AppCompatActivity {
    ActivityGetProductsByIdBinding binding;
    ApiServices retrofitInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGetProductsByIdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getProductsById();
    }

    private void getProductsById() {
        retrofitInstance = ApiServices.RetrofitClass.getRetrofitInstance();
        String id = getIntent().getStringExtra("id");
        retrofitInstance.productsById(id).enqueue(new Callback<productsResponse>() {
            @Override
            public void onResponse(Call<productsResponse> call, Response<productsResponse> response) {
                productsResponse productsResponse = response.body();
                ArrayList<products> productsArrayList = productsResponse.getProductsArrayList();
                int pos = getIntent().getIntExtra("position", 0);

                binding.description.setText(productsArrayList.get(pos).getDescription());
                binding.id.setText(String.valueOf(productsArrayList.get(pos).getId()));
                binding.discountPercentage.setText(String.valueOf(productsArrayList.get(pos).getDiscountPercentage()));
                binding.price.setText(String.valueOf(productsArrayList.get(pos).getPrice()));
                binding.rating.setText(String.valueOf(productsArrayList.get(pos).getRating()));
                binding.tvtitle.setText(productsArrayList.get(pos).getTitle());


            }

            @Override
            public void onFailure(Call<productsResponse> call, Throwable t) {

            }
        });
    }
}