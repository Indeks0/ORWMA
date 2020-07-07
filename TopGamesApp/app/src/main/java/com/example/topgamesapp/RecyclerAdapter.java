package com.example.topgamesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<NameViewHolder> {
    List<String> dataList = new ArrayList<>();
    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_name, parent, false);
        return new NameViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.setText(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public  void setData(List<String> data){
        dataList.clear();
        dataList.addAll(data);
        notifyDataSetChanged();
    }
}

