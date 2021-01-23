package com.example.ukrasheniyaivanovkatri4ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BracerClick(View view) {
        Intent intent=new Intent(MainActivity.this, BracerActivity.class);
        startActivity(intent);
    }
    public void RingClick(View view) {
        Intent intent=new Intent(MainActivity.this,RingActivity.class);
        startActivity(intent);
    }
    public void CircletClick(View view) {
        Intent intent=new Intent(MainActivity.this,CircletActivity.class);
        startActivity(intent);
    }
    public void MapClick(View view) {
        Intent intent=new Intent(MainActivity.this,MapActivity.class);
        startActivity(intent);
    }
}