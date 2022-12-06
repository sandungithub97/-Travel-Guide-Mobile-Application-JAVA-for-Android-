package com.example.tourist_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class waterfall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);
    }
    public void babara(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "babara";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void baker(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "baker";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void ravana(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "ravana";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void dunhida(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "dunhida";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void devon(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "devon";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void diyaluma(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "diyaluma";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void bomburu(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "bomburu";
        intent.putExtra("spot", details);
        startActivity(intent);
    }


}