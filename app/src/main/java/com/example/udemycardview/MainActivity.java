package com.example.udemycardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    CardView card1;
    CardView card2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = findViewById(R.id.cardview1_id);
        card2 = findViewById(R.id.cardview2_id);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view,"CardView 1 is selected",Snackbar.LENGTH_LONG).show();

            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view,"CardView 2 is selected",Snackbar.LENGTH_LONG).show();

            }
        });



    }//The last method onCreate
}//The last class MainActivity
