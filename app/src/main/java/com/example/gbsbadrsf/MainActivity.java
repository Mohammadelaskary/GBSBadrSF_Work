package com.example.gbsbadrsf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gbsbadrsf.databinding.ActivityMainBinding;
import com.honeywell.aidc.AidcManager;
import com.honeywell.aidc.BarcodeReader;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    private static BarcodeReader barcodeReader;
    private static BarcodeReader barcodeReaderSequence;
   private AidcManager manager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        AidcManager.create(this, new AidcManager.CreatedCallback() {
//
            @Override
            public void onCreated(AidcManager aidcManager) {
                manager = aidcManager;
                barcodeReader = manager.createBarcodeReader();
                barcodeReaderSequence = manager.createBarcodeReader();
            }
        });




    }
    public static BarcodeReader getBarcodeObject() {
        return barcodeReader;
    }
    public static BarcodeReader getBarcodeObjectsequence() {
        return barcodeReaderSequence;
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (barcodeReader != null) {
            // close BarcodeReader to clean up resources.
            barcodeReader.close();
            barcodeReader = null;
        }
        if (barcodeReaderSequence != null) {
            // close BarcodeReader to clean up resources.
            barcodeReaderSequence.close();
            barcodeReaderSequence = null;
        }


        if (manager != null) {
//            // close AidcManager to disconnect from the scanner service.
            // once closed, the object can no longer be used.
            manager.close();
        }
  }
}