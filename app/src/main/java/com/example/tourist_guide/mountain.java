package com.example.tourist_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mountain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain);
    }
    public void sigiriya(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "sigiriya";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void piduru(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "piduru";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void knuck(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "knuck";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void sripada(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "sripada";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void hakgala(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "hakgala";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void rassa(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "rassa";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void adara(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "adara";
        intent.putExtra("spot", details);
        startActivity(intent);
    }

}