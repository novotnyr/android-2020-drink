package com.github.novotnyr.android.drink;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;

public class DrinkListAdapter extends ListAdapter<Drink, DrinkViewHolder> {
    protected DrinkListAdapter() {
        super(new DrinkDiff());
        submitList(Collections.singletonList(new Drink()));
    }

    @NonNull
    @Override
    public DrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @LayoutRes int layoutRes = R.layout.drink;
        View layout = LayoutInflater.from(parent.getContext()).inflate(layoutRes, parent, false);
        return new DrinkViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkViewHolder holder, int position) {

    }
}
