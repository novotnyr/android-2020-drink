package com.github.novotnyr.android.drink;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DrinkViewHolder extends RecyclerView.ViewHolder {
    ImageView drinkImageView;

    public DrinkViewHolder(@NonNull View layout) {
        super(layout);
        //TODO locate via: findViewById
        drinkImageView.setImageResource(R.drawable.drink);
    }
}
