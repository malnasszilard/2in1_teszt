package com.example.dragoon.egyuttmegjelenites;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class elso extends AppCompatActivity {
    Button elso,masodik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elso);
        elso = (Button) findViewById(R.id.button);
        masodik=(Button) findViewById(R.id.button2);
        elso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.dragoon.egyuttmegjelenites.elso.this,elsoprogram.class));
            }
        });
        masodik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.dragoon.egyuttmegjelenites.elso.this,masodik.class));
            }
        });


    }
}
