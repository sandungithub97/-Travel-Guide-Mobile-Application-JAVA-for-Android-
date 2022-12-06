package com.example.tourist_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
    }

    public void ash(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "ash";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void ahas(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "ahas";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void abode(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "abode";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void back(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "back";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void bar(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "bar";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void border(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "border";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void kalus(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "kalus";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void boul(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "boul";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
}