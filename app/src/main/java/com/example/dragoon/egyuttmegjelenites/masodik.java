package com.example.dragoon.egyuttmegjelenites;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class masodik extends AppCompatActivity {
    Button vissza,kov,elozo;
    int i=1,szam=1,utolsoe=0,megelozo=0,seged;
    TextView mezo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masodik);
        kov=(Button)findViewById(R.id.button7);
        elozo=(Button)findViewById(R.id.button8);
        mezo=(TextView)findViewById(R.id.textView2);
        vissza=(Button)findViewById(R.id.button6);
        vissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(masodik.this,elso.class));
            }
        });

        mezo.setText("Az" + i + ". szám a(z)" + szam);
        megelozo=szam;

        kov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                mezo.setText("Az" + i + ". szám a(z)" + szam);
                seged=szam;
                szam+=megelozo;
                megelozo=seged;


            }
        });
        elozo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               --i;
                if(i>1) {

                    seged = szam - megelozo;
                    szam = megelozo;
                    mezo.setText("Az" + i + ". szám a(z)" + megelozo);
                    megelozo = seged;

                }
                else{
                    mezo.setText("Az 1. szám a(z) 1");
                    i=1;
                    megelozo=0;
                    szam=1;
                }
            }
        });


    }
}
