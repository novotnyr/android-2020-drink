package com.github.novotnyr.android.drink;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class DrinkDiff extends DiffUtil.ItemCallback<Drink> {
    @Override
    public boolean areItemsTheSame(@NonNull Drink oldItem, @NonNull Drink newItem) {
        return oldItem.getId().equals(newItem.getId());
    }

    @Override
    public boolean areContentsTheSame(@NonNull Drink oldItem, @NonNull Drink newItem) {
        return oldItem.equals(newItem);
    }
}
