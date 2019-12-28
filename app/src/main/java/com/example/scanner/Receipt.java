package com.example.scanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Receipt extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

//    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_scan);
        String code = getIntent().getStringExtra("code");


        // data to populate the RecyclerView with
        ArrayList<String> items = new ArrayList<>();
        items.add(code);
//        items.add("434r3");
//        items.add("r43r");
//        items.add("343r");
//        items.add("ffrf3");

        // set up the RecyclerView

        RecyclerView recyclerView = findViewById(R.id.items_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
        MyRecyclerViewAdapter adapter=
         new MyRecyclerViewAdapter(this, items);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

     Button startScan;
        startScan= findViewById(R.id.scan);

        startScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //add item
                Intent intent = new Intent(getBaseContext(), Scan.class);
                startActivity(intent);
            }

        });
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked row number " + position, Toast.LENGTH_SHORT).show();
    }
}