package com.example.gbsbadrsf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gbsbadrsf.databinding.ActivityMainBinding;
import com.honeywell.aidc.AidcManager;
import com.honeywell.aidc.BarcodeReader;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    private static BarcodeReader barcodeReader;
    private AidcManager manager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());





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