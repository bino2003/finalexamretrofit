package com.example.finalexamretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.finalexamretrofit.databinding.ActivityProductsCategoresBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class productsCategores extends AppCompatActivity {
ActivityProductsCategoresBinding binding;
    ApiServices retrofitInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityProductsCategoresBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getprodects();
    }
    private void getprodects() {
        retrofitInstance=  ApiServices.RetrofitClass.getRetrofitInstance();
       String smartphone= getIntent().getStringExtra("smartphone");
        retrofitInstance.products(smartphone).enqueue(new Callback<productsResponse>() {
            @Override
            public void onResponse(Call<productsResponse> call, Response<productsResponse> response) {
                productsResponse productsResponse=response.body();
               ArrayList<products> productsArrayList= productsResponse.getProductsArrayList();
               prodectsadapter prodectsadapter=new prodectsadapter(productsArrayList, productsCategores.this, new onclicitem() {
                   @Override
                   public void onclicitem(String smartphone) {

                   }

                   @Override
                   public void onclicitem2(String id, int position) {
                       Intent intent=new Intent(productsCategores.this,GetProductsById.class);
                       intent.putExtra("id",id);
                       intent.putExtra("position",position);

                       startActivity(intent);
                   }

                   });
               binding.rv2.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false));
               binding.rv2.setAdapter(prodectsadapter);
               }
            @Override
            public void onFailure(Call<productsResponse> call, Throwable t) {

            }



            });



    }
}