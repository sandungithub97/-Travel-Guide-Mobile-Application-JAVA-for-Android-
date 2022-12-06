package com.example.tourist_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nature (View view){
        startActivity(new Intent(this,natural_places.class));
    }

    public void emergency(View view) {
        startActivity(new Intent(this,emergency.class));
    }

    public void mountains(View view) {
        startActivity(new Intent(this,mountain.class));
    }

    public void hotels(View view) {
        startActivity(new Intent(this,hotel.class));
    }

    public void beaches(View view) {
        startActivity(new Intent(this,beaches.class));
    }

    public void temple(View view) {
        startActivity(new Intent(this,religion.class));
    }
    public void instructions(View view) {
        startActivity(new Intent(this,instructions.class));
    }
    public void waterfall(View view) {
        startActivity(new Intent(this,waterfall.class));
    }
    public void logout (View view){
        startActivity(new Intent(this,login.class));
    }
}