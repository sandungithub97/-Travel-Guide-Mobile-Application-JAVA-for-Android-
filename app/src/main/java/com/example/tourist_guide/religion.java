package com.example.tourist_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class religion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion);
    }
    public void temple(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "temple";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void ganga(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "ganga";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void jeta(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "jeta";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void srimaha(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "srimaha";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void dutch(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "dutch";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void abaya(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "abaya";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void seeta(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "seeta";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void dambulla(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "dambulla";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
}