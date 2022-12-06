package com.example.tourist_guide;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.tourist_guide.databinding.ActivityMapBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        map();
    }

    public void map(){
        LatLng location = null;
       String details = getIntent().getStringExtra("spot");

        if(details.equals("sinharaja")){
           location = new LatLng(6.4043, 80.5485);
        }
        else if(details.equals("nuwaraeli")){
            location = new LatLng(6.9497, 80.7891);
        }
        else if(details.equals("yaala")){
            location = new LatLng(6.5411, 101.2804);
        }
        else if(details.equals("horton")){
            location = new LatLng(6.8028, 80.8091);
        }
        else if(details.equals("ella")){
            location = new LatLng(6.8667, 81.0466);
        }
        else if(details.equals("sembu")){
            location = new LatLng(7.4370, 80.7000);
        }
        else if(details.equals("una")){
            location = new LatLng(6.0174, 80.2489);
        }
        else if(details.equals("ben")){
            location = new LatLng(6.4189, 80.0060);
        }
        else if(details.equals("mirissa")){
            location = new LatLng(5.9483, 80.4716);
        }
        else if(details.equals("dick")){
            location = new LatLng(5.9717, 80.6951);
        }
        else if(details.equals("weli")){
            location = new LatLng(5.9774, 80.4288);
        }
        else if(details.equals("galle")){
            location = new LatLng(6.028624, 80.216797);
        }
        else if(details.equals("hik")){
            location = new LatLng(6.1395, 80.1063);
        }
        else if(details.equals("kog")){
            location = new LatLng(6.0007, 80.3352);
        }
        else if(details.equals("babara")){
            location = new LatLng(6.7734, 80.8312);
        }
        else if(details.equals("baker")){
            location = new LatLng(6.7927, 80.7895);
        }
        else if(details.equals("ravana")){
            location = new LatLng(6.9023, 80.7829);
        }
        else if(details.equals("dunhida")){
            location = new LatLng(7.0167, 81.0667);
        }
        else if(details.equals("devon")){
            location = new LatLng(6.9514, 80.6300);
        }
        else if(details.equals("diyaluma")){
            location = new LatLng(6.7331, 81.0314);
        }
        else if(details.equals("bomburu")){
            location = new LatLng(6.9473, 80.8312);
        }
        else if(details.equals("temple")){
            location = new LatLng(7.2936, 80.6413);
        }
        else if(details.equals("ganga")){
            location = new LatLng(6.9167, 79.8566);
        }
        else if(details.equals("jeta")){
            location = new LatLng(6.9441, 79.8652);
        }
        else if(details.equals("srimaha")){
            location = new LatLng(8.3402, 80.3913);
        }
        else if(details.equals("dutch")){
            location = new LatLng(6.9421, 79.8591);
        }
        else if(details.equals("abaya")){
            location = new LatLng(8.3709, 80.3953);
        }
        else if(details.equals("seeta")){
            location = new LatLng(6.9332, 80.8105);
        }
        else if(details.equals("dambulla")){
            location = new LatLng(7.8742, 80.6511);
        }
        else if(details.equals("ash")){
            location = new LatLng(7.4294307, 80.6841549);
        }
        else if(details.equals("ahas")){
            location = new LatLng(6.6512188, 80.8145072);
        }
        else if(details.equals("abode")){
            location = new LatLng(7.4075159, 80.7864096);
        }
        else if(details.equals("back")){
            location = new LatLng(7.9699272, 80.7591141);
        }
        else if(details.equals("bar")){
            location = new LatLng(8.0489575, 79.7077448);
        }
        else if(details.equals("border")){
            location = new LatLng(6.9930146, 80.4142463);
        }
        else if(details.equals("kalus")){
            location = new LatLng(6.4160187, 80.8441024);
        }
        else if(details.equals("boul")){
            location = new LatLng(6.5148178, 80.3843738);
        }
        else if(details.equals("sigiriya")){
            location = new LatLng(7.9570, 80.7603);
        }
        else if(details.equals("piduru")){
            location = new LatLng(7.0008, 80.7733);
        }
        else if(details.equals("knuck")){
            location = new LatLng(7.4424, 80.7810);
        }
        else if(details.equals("sripada")){
            location = new LatLng(6.8096, 80.4994);
        }
        else if(details.equals("hakgala")){
            location = new LatLng(6.9169, 80.8139);
        }
        else if(details.equals("rassa")){
            location = new LatLng(6.6923, 80.6379);
        }
        else if(details.equals("adara")){
            location = new LatLng(6.7370, 80.7973);
        }

        mMap.addMarker(new MarkerOptions().position(location).title("Marker in "+details));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(location));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 15));
    }

    /*public void mapLocation(){
        details = getIntent().getParcelableExtra("maps");
        string = details.getTitle();

        LatLng sriLanka = null;
        if (string.equals("Whatever")){
            sriLanka = new LatLng(7.9570, 80.7603);
        }
        else if (string.equals("Menu")){
            sriLanka = new LatLng(10.9570, 80.7603);
        }
        else {
            sriLanka = new LatLng(7.8731, 80.7718);
        }
        mMap.addMarker(new MarkerOptions().position(sriLanka).title("Marker in Sigiriya"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sriLanka, 15));*/

}

