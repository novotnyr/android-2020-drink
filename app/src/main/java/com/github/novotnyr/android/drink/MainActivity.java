package com.github.novotnyr.android.drink;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView drinkRecyclerView;

    DrinkListAdapter drinkListAdapter;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinkRecyclerView = findViewById(R.id.drinkRecyclerView);
        drinkRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        drinkListAdapter = new DrinkListAdapter();
        drinkRecyclerView.setAdapter(drinkListAdapter);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Na zdravie!", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
