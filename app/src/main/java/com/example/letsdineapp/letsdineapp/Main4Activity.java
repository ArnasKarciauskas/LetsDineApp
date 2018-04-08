package com.example.letsdineapp.letsdineapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);






    }

    public void button2(View view) {
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
    public void button3(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void button4(View view) {
        Intent intent = new Intent(this,Main5Activity.class);
        startActivity(intent);
    }


}
