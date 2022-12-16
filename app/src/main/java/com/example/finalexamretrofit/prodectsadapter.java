package com.example.finalexamretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.finalexamretrofit.databinding.ItemproductsBinding;

import java.util.ArrayList;

public class prodectsadapter extends RecyclerView.Adapter<productsViewHolder> {
    ArrayList<products> productsArrayList;
    Context context;
    onclicitem onclicitem;

    public prodectsadapter(ArrayList<products> productsArrayList, Context context, com.example.finalexamretrofit.onclicitem onclicitem) {
        this.productsArrayList = productsArrayList;
        this.context = context;
        this.onclicitem = onclicitem;
    }

    @NonNull
    @Override
    public productsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        productsViewHolder productsViewHolder = new productsViewHolder(ItemproductsBinding.inflate(LayoutInflater.from(parent.getContext())));
        return productsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull productsViewHolder holder, int position) {
        int pos = position;
        holder.price.setText(String.valueOf(productsArrayList.get(position).price));
        holder.title.setText(productsArrayList.get(position).title);
        Glide.with(context).load(productsArrayList.get(position).thumbnail).into(holder.imge);
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onclicitem.onclicitem2(String.valueOf(productsArrayList.get(pos).getId()), pos);

            }
        });
    }

    @Override
    public int getItemCount() {
        return productsArrayList.size();
    }
}

class productsViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    TextView price;
    ImageView imge;

    public productsViewHolder(@NonNull ItemproductsBinding binding) {
        super(binding.getRoot());
        title = binding.tvtitle;
        price = binding.tvPrice;
        imge = binding.imageView;

    }
}