package com.example.dragoon.egyuttmegjelenites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class elsoprogram extends AppCompatActivity {
    Button novel,csokkent,vissza;
    TextView szam;

    int ertek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elsoprogram);

        novel=(Button)findViewById(R.id.button3);
        csokkent=(Button)findViewById(R.id.button4);
        vissza=(Button)findViewById(R.id.button5);
        szam=(TextView)findViewById(R.id.textView);
        ertek=10;
        szam.setText("A szám értéke: " + ertek);
        novel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ertek+=1;
                szam.setText("A szám értéke: " + ertek);
            }
        });
        csokkent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ertek-=1;
                szam.setText("A szám értéke: " + ertek);
            }
        });
        vissza=(Button)findViewById(R.id.button5);
        vissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(elsoprogram.this,elso.class));
            }
        });


    }
}
