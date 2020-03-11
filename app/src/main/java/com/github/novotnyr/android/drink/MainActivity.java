package com.github.novotnyr.android.drink;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView drinkRecyclerView;

    DrinkListAdapter drinkListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinkRecyclerView = findViewById(R.id.drinkRecyclerView);
        drinkRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        drinkListAdapter = new DrinkListAdapter();
        drinkRecyclerView.setAdapter(drinkListAdapter);
    }
}
