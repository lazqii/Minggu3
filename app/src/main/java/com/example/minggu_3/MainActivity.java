package com.example.minggu_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Gilang Rizqi Ramadhan");

        CardView tombol = findViewById(R.id.cardView);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konek = new Intent(MainActivity.this, LinearLayout.class);

                startActivity(konek);
            }
        });

        CardView tombol2 = findViewById(R.id.card2);
        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konek = new Intent(MainActivity.this, RelativeLayout.class);

                startActivity(konek);
            }
        });

        CardView tombol3 = findViewById(R.id.card3);
        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konek = new Intent(MainActivity.this, ConstraintLayout.class);

                startActivity(konek);
            }
        });

        CardView tombol4 = findViewById(R.id.card4);
        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konek = new Intent(MainActivity.this, FrameLayout.class);

                startActivity(konek);
            }
        });

        CardView tombol5 = findViewById(R.id.card5);
        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konek = new Intent(MainActivity.this, TabelLayout.class);

                startActivity(konek);
            }
        });

        CardView tombol6 = findViewById(R.id.card6);
        tombol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konek = new Intent(MainActivity.this, TextButton.class);

                startActivity(konek);
            }
        });

        CardView tombol7 = findViewById(R.id.card7);
        tombol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konek = new Intent(MainActivity.this, ScrollViewHorizontal.class);

                startActivity(konek);
            }
        });

        CardView tombol8 = findViewById(R.id.card8);
        tombol8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konek = new Intent(MainActivity.this, ScrollViewVertikal.class);

                startActivity(konek);
            }
        });

    }

}