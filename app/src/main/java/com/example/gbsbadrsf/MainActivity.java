package com.example.gbsbadrsf;


import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.gbsbadrsf.databinding.ActivityMainBinding;
import com.honeywell.aidc.AidcManager;
import com.honeywell.aidc.BarcodeReader;

public class MainActivity extends AppCompatActivity {
    private static final String MY_PREFS_NAME = "database_url";
    ActivityMainBinding activityMainBinding;
    private static BarcodeReader barcodeReader;
    private AidcManager manager;
    public static String BASE_URL;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        AidcManager.create(this, aidcManager -> {
            manager = aidcManager;
            barcodeReader = manager.createBarcodeReader();
        });
        getBaseUrlFromSharedPreferences();
    }

    private void getBaseUrlFromSharedPreferences() {
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        if (prefs.contains("base_url"))
            BASE_URL = prefs.getString("base_url", "No name defined");
        else
            BASE_URL = "http://196.221.166.86:97/api/GBSShopFloor/";
    }

    public static BarcodeReader getBarcodeObject() {
        return barcodeReader;
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (barcodeReader != null) {
            // close BarcodeReader to clean up resources.
            barcodeReader.close();
            barcodeReader = null;
        }

        if (manager != null) {
            // close AidcManager to disconnect from the scanner service.
            // once closed, the object can no longer be used.
            manager.close();
        }
    }
}