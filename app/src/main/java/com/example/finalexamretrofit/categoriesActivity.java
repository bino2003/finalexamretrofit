package com.example.finalexamretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.example.finalexamretrofit.databinding.ActivityCategoriesBinding;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class categoriesActivity extends AppCompatActivity {
ActivityCategoriesBinding binding;
    ApiServices retrofitInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCategoriesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
getOrder();
    }
    private void getOrder() {
        retrofitInstance=  ApiServices.RetrofitClass.getRetrofitInstance();

        retrofitInstance.categories().enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                List<String> stringList=response.body();
                stringList.add("smartphones");
                stringList.add("laptops");



                stringList.add("fragrances");
                stringList.add("skincare");

                stringList.add("groceries");

                stringList.add("home-decoration");


                stringList.add("furniture");


                stringList.add ("tops");
                stringList.add("womens-dresses");

                stringList.add("womens-shoes");

                stringList.add("mens-shirts");
               stringList.add ("mens-shoes");
                stringList.add("mens-watches");
                stringList.add("womens-watches");
                stringList.add("womens-bags");
                stringList.add("womens-jewellery");
                stringList.add("sunglasses");
                stringList.add("automotive");
                stringList.add("motorcycle");
                stringList.add("lighting");

categoresAdapter adapter=new categoresAdapter(stringList, categoriesActivity.this, new onclicitem() {
    @Override
    public void onclicitem(String smartphone) {
        Intent intent=new Intent(categoriesActivity.this,productsCategores.class);
        intent.putExtra("smartphone",smartphone);
        startActivity(intent);
    }

    @Override
    public void onclicitem2(String id, int position) {

    }
});
binding.rv.setAdapter(adapter);
binding.rv.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false));

            }


            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {

            }
        });
    }
}