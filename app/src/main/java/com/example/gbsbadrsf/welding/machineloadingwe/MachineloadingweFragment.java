package com.example.gbsbadrsf.welding.machineloadingwe;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gbsbadrsf.R;
import com.example.gbsbadrsf.databinding.FragmentMachineLoadingBinding;
import com.example.gbsbadrsf.databinding.FragmentMachineloadingweBinding;

import dagger.android.support.DaggerFragment;


public class MachineloadingweFragment extends DaggerFragment {
    FragmentMachineloadingweBinding fragmentMachineloadingweBinding;








    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentMachineloadingweBinding = FragmentMachineloadingweBinding.inflate(inflater, container, false);
        fragmentMachineloadingweBinding.parentcode.setText(getArguments().getString("parentcode"));
        fragmentMachineloadingweBinding.parentdesc.setText(getArguments().getString("parentdesc"));
        fragmentMachineloadingweBinding.operation.setText(getArguments().getString("operationrname"));
        fragmentMachineloadingweBinding.loadingqtns.setText(getArguments().getString("loadingqty"));


        return fragmentMachineloadingweBinding.getRoot();

    }
}