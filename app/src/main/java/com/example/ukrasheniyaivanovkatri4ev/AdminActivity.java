package com.example.ukrasheniyaivanovkatri4ev;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }
    public void Back(View view) {
     onBackPressed();
  }
    public void Save(View view) {
   }
}