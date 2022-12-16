package com.example.finalexamretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalexamretrofit.databinding.ItemcategoriesBinding;

import java.util.List;

public class categoresAdapter extends RecyclerView.Adapter<categoresViewHolder> {
    List<String> stringList;
    Context context;
onclicitem onclicitem;

    public categoresAdapter(List<String> stringList, Context context, com.example.finalexamretrofit.onclicitem onclicitem) {
        this.stringList = stringList;
        this.context = context;
        this.onclicitem = onclicitem;
    }

    @NonNull
    @Override
    public categoresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        categoresViewHolder categoresViewHolder=new categoresViewHolder(ItemcategoriesBinding.inflate(LayoutInflater.from(parent.getContext())));
        return categoresViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull categoresViewHolder holder, int position) {
holder.data.setText(stringList.get(position));
holder.data.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        onclicitem.onclicitem(holder.data.getText().toString());
    }
});
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }
}
class  categoresViewHolder extends RecyclerView.ViewHolder{
TextView data;
    public categoresViewHolder(@NonNull ItemcategoriesBinding binding) {
        super(binding.getRoot());
        data=binding.data;

    }
}
