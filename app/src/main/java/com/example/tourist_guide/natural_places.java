package com.example.tourist_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class natural_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural_places);

    }


    public void sinha(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "sinharaja";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void sinhara(View view) {
        ImageView image1 = findViewById(R.id.image1);
        Intent intent = new Intent(natural_places.this, sinharaja.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, image1, "trans1");
        startActivity(intent, options.toBundle());
    }


    public void ella(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "ella";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void ella1(View view) {
        ImageView image1 = findViewById(R.id.image2);
        Intent intent = new Intent(natural_places.this, ella.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, image1, "trans_ella");
        startActivity(intent, options.toBundle());
    }

    public void nuwaraeli(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "nuwaraeli";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void nuwaraeli1(View view) {
        ImageView image1 = findViewById(R.id.image3);
        Intent intent = new Intent(natural_places.this, NuwaraEliya.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, image1, "trans_nuwaraeli");
        startActivity(intent, options.toBundle());
    }

    public void yaala(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "yaala";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void yaala1(View view) {
        ImageView image1 = findViewById(R.id.image4);
        Intent intent = new Intent(natural_places.this, YaalaPark.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, image1, "trans_yaala");
        startActivity(intent, options.toBundle());
    }

    public void horton(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "horton";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void horton1(View view) {
        ImageView image1 = findViewById(R.id.image5);
        Intent intent = new Intent(natural_places.this, HortonPlains.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, image1, "trans_horton");
        startActivity(intent, options.toBundle());
    }


    public void sembu(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        String details = "sembu";
        intent.putExtra("spot", details);
        startActivity(intent);
    }
    public void sembu1(View view) {
        ImageView image1 = findViewById(R.id.image6);
        Intent intent = new Intent(natural_places.this, Sembuwatta.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, image1, "trans_sembu");
        startActivity(intent, options.toBundle());
    }
}