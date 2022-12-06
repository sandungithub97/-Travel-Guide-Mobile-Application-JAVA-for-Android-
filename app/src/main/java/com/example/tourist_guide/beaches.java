package com.example.tourist_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class beaches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches);

    }
    public void una(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "una";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void ben(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "ben";
        intent.putExtra("spot", details);
        startActivity(intent);

    }
    public void mirissa(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "mirissa";
        intent.putExtra("spot", details);
        startActivity(intent);

    }
    public void dick(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "dick";
        intent.putExtra("spot", details);
        startActivity(intent);

    }
    public void weli(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "weli";
        intent.putExtra("spot", details);
        startActivity(intent);

    }
    public void galle(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "galle";
        intent.putExtra("spot", details);
        startActivity(intent);

    }
    public void hik(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "hik";
        intent.putExtra("spot", details);
        startActivity(intent);

    }
    public void kog(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "kog";
        intent.putExtra("spot", details);
        startActivity(intent);

    }

}