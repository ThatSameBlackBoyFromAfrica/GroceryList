package com.chukwuebuka.grocerylist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GroceryViewholder extends RecyclerView.ViewHolder{
    public final TextView nameView;
    public final ImageView imageView;
    public final TextView priceTagView;


    public GroceryViewholder(@NonNull View itemView) {
        super(itemView);
        nameView = (TextView) itemView.findViewById(R.id.item_name);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        priceTagView = (TextView) itemView.findViewById(R.id.pricetag);
    }
}
