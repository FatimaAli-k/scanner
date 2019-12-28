package com.example.scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseCustomer extends AppCompatActivity  {

    Button newCustomer,oldCustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_customer);
        //String code = getIntent().getStringExtra("code");

        //loadFragment(new ItemsListRecyclerView());
        newCustomer = findViewById(R.id.new_customer);

        newCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //crete new customer and new receipt in db
                //scan item and add it
                Intent intent = new Intent(getBaseContext(), Scan.class);

                startActivity(intent);
            }

        });
       oldCustomer = findViewById(R.id.old_customer);

        oldCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //scan for customer id, retrieve items
                //replace
                Intent intent = new Intent(getBaseContext(), Receipt.class);

                startActivity(intent);
            }

        });






    }
//    private boolean loadFragment(Fragment fragment) {
//        //switching fragment
//        if (fragment != null) {
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.fragment_container, fragment)
//                    .commit();
//            return true;
//        }
//
//        return false;
//    }
}
