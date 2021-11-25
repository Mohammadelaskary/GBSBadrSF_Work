package com.example.gbsbadrsf.machineloading;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.gbsbadrsf.R;
import com.example.gbsbadrsf.Util.Constant;
import com.example.gbsbadrsf.Util.ViewModelProviderFactory;
import com.example.gbsbadrsf.data.response.Ppr;
import com.example.gbsbadrsf.data.response.ResponseStatus;
import com.example.gbsbadrsf.databinding.FragmentMachineLoadingBinding;
import com.example.gbsbadrsf.databinding.FragmentSigninBinding;
import com.example.gbsbadrsf.signin.SignInViewModel;
import com.example.gbsbadrsf.signin.Usertype;
import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


public class MachineLoadingFragment extends DaggerFragment {

    FragmentMachineLoadingBinding fragmentMachineLoadingBinding;
    @Inject
    ViewModelProviderFactory providerFactory;
    MachineloadingViewModel machineloadingViewModel;
    private ResponseStatus responseStatus;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        fragmentMachineLoadingBinding = FragmentMachineLoadingBinding.inflate(inflater, container, false);
        machineloadingViewModel = ViewModelProviders.of(this, providerFactory).get(MachineloadingViewModel.class);
        responseStatus = new ResponseStatus();

        initObjects();
        //attachListeners();
        subscribeRequest();

        fragmentMachineLoadingBinding.saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              machineloadingViewModel.savefirstloading("1","S123",getArguments().getString("loadingsequenceid"),fragmentMachineLoadingBinding.machinecodeEdt.getText().toString(),fragmentMachineLoadingBinding.diecodeEdt.getText().toString(),fragmentMachineLoadingBinding.loadingqtnEdt.getText().toString());

            }
        });


        return fragmentMachineLoadingBinding.getRoot();


    }

    private void initObjects() {
        if (getArguments().getString("enabledie").equals("1")){
            fragmentMachineLoadingBinding.diecodeEdt.setEnabled(true);
            fragmentMachineLoadingBinding.diecodeEdt.setClickable(true);
        }
        else {
            fragmentMachineLoadingBinding.diecodeEdt.setEnabled(false);
            fragmentMachineLoadingBinding.diecodeEdt.setClickable(false);
        }
        fragmentMachineLoadingBinding.jobordernum.setText(getArguments().getString("jobordername"));
        fragmentMachineLoadingBinding.Joborderqtn.setText(getArguments().getString("joborderqty"));
        fragmentMachineLoadingBinding.childesc.setText(getArguments().getString("childdesc"));
        fragmentMachineLoadingBinding.childcode.setText(getArguments().getString("childcode"));
        fragmentMachineLoadingBinding.loadingsequenceid.setText(getArguments().getString("loadingsequenceid"));



    }
    private void subscribeRequest() {
        machineloadingViewModel.gettypesofsavedloading().observe(getViewLifecycleOwner(), new Observer<typesosavedloading>() {
            @Override
            public void onChanged(typesosavedloading typesosavedloading) {
                switch (typesosavedloading)
                {
                    case Savedsuccessfully:
                        Toast.makeText(getContext(), "Saving data successfully", Toast.LENGTH_LONG).show();

                        break;
                    case machinealreadyused:
                        Toast.makeText(getContext(), "The machine has already been used", Toast.LENGTH_SHORT).show();
                        
                        break;

                    case wromgmachinecode:
                        Toast.makeText(getContext(), "Wrong machine code", Toast.LENGTH_SHORT).show();

                        break;
                    case wrongdiecode:
                        Toast.makeText(getContext(), "Wrong die code for this child", Toast.LENGTH_SHORT).show();

                        break;
                    case servererror:
                        Toast.makeText(getContext(), "There was a server side failure while respond to this transaction", Toast.LENGTH_SHORT).show();

                        break;


                }
            }
        });




    }


//    private void attachListeners() {
//        fragmentMachineLoadingBinding.addworkersBtn.setOnClickListener(__ -> {
//            Navigation.findNavController(getActivity(), R.id.myNavhostfragment).navigate(R.id.action_machineLoadingFragment_to_addworkersFragment);
//
//        });
//
//    }
}