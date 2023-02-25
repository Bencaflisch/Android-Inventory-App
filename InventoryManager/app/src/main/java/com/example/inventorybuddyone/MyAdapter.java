package com.example.inventorybuddyone;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Adapter to bind data to RecyclerView widget
 * https://developer.android.com/develop/ui/views/layout/recyclerview
 *
 *
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
//RV Calls this method whenever it needs to create a new ViewHolder
    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
//RV calls this method to associate a ViewHolder with data
    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

    }
//Return dataset size - RV Calls this to determine when there are no more items to be displayed
    @Override
    public int getItemCount() {
        return 0;
    }


}