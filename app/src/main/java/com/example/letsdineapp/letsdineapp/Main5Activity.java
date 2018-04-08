package com.example.letsdineapp.letsdineapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);






    }

    public void homeBtn(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void locationBtn(View view) {
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
    public void searchB(View view) {
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }



}
