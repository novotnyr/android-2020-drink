package com.github.novotnyr.android.drink;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DrinkViewModel extends ViewModel {
    private MutableLiveData<List<Drink>> drinks = new MutableLiveData<List<Drink>>(new ArrayList<Drink>());

    public LiveData<List<Drink>> getDrinks() {
        return drinks;
    }

    public void addDrink() {
        ArrayList<Drink> newValue = new ArrayList<>(drinks.getValue());
        newValue.add(new Drink());
        drinks.postValue(newValue);
    }
}
