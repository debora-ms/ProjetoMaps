package br.usj.projetomaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private locationManager locationManager;
    private locationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationManager = (locationManager) getSystemService(Context.LOCATION_SERVICE);
        locationListener = new LocationListener() {
        }
        @Override
        public void onLocationChanged (@NonNu Location Location){
        }
        @Override
        public void onStatusChanged (String provider, int status, bundle extras){
        }
        @Override
        public void onProviderEnabled (String provider){

        }
        @Override
        public void onProviderDisabled (String provider){
        }
    }

    ;
}
@Override
protected void onStart (){
    super.onStart();
    if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)==
            PackageManager.PERMISSION_GRANTED){
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, locationListener);
    }else {
        ActivityCompat.requestPermissions(, new String[]{Manifest.permission.ACCESS_FINE_LOCATION});
    }