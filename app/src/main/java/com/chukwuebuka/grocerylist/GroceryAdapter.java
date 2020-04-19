package com.chukwuebuka.grocerylist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryViewholder>{

//    private String[] names;
//    private int[] imageResources;
//    private String[] pricesTags;
    private DataSource[] dataSources;
    private GroceryViewholder groceryViewholder;

    public GroceryAdapter(DataSource[] dataSources) {
        this.dataSources = dataSources;
    }

    @NonNull
    @Override
    public GroceryViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grocery_list_item, parent, false);
        groceryViewholder = new GroceryViewholder(view);
        return groceryViewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewholder holder, int position) {

        holder.nameView.setText(dataSources[position].getName().toString());
        holder.imageView.setImageResource(dataSources[position].getImageResource());
        holder.priceTagView.setText(dataSources[position].getPrice());
    }


    @Override
    public int getItemCount() {
        return dataSources.length;
    }

}


