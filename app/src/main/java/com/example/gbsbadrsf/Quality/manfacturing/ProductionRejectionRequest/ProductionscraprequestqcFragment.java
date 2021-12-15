package com.example.gbsbadrsf.Quality.manfacturing.ProductionRejectionRequest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.gbsbadrsf.databinding.FragmentProductionscraprequestqcBinding;


public class ProductionscraprequestqcFragment extends Fragment {
    FragmentProductionscraprequestqcBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProductionscraprequestqcBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }


}