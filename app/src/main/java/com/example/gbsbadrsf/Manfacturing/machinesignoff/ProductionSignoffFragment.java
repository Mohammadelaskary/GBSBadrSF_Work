package com.example.gbsbadrsf.Manfacturing.machinesignoff;

import android.net.Uri;
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
import com.example.gbsbadrsf.Util.ViewModelProviderFactory;
import com.example.gbsbadrsf.data.response.MachineSignoffBody;
import com.example.gbsbadrsf.databinding.FragmentProductionSignoffBinding;
import com.example.gbsbadrsf.productionsequence.Loadingstatus;

import java.io.File;
import java.util.Calendar;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


public class ProductionSignoffFragment extends DaggerFragment implements Signoffitemsdialog.OnInputSelected{
    @Inject
    ViewModelProviderFactory providerFactory;// to connect between injection in viewmodel
    FragmentProductionSignoffBinding fragmentProductionSignoffBinding;
    private MachinesignoffViewModel machinesignoffViewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentProductionSignoffBinding = FragmentProductionSignoffBinding.inflate(inflater, container, false);
        machinesignoffViewModel = ViewModelProviders.of(this,providerFactory).get(MachinesignoffViewModel.class);


        initViews();
        subscribeRequest();

        return fragmentProductionSignoffBinding.getRoot();
    }
    private void initViews() {
        fragmentProductionSignoffBinding.signoffitemsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Signoffitemsdialog dialog = new Signoffitemsdialog();
                dialog.setTargetFragment(ProductionSignoffFragment.this, 1);
                dialog.show(getFragmentManager(), "MyCustomDialog");
            }
        });
        fragmentProductionSignoffBinding.saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MachineSignoffBody machineSignoffBody = new MachineSignoffBody();

                machineSignoffBody.setMachineCode(fragmentProductionSignoffBinding.machinecodeEdt.getText().toString());
                machineSignoffBody.setSignOutQty(fragmentProductionSignoffBinding.totalqtn.getText().toString());
                //machineSignoffBody.setBasketLst(fragmentProductionSignoffBinding.basketcode.getText().toString());


                machinesignoffViewModel.getmachinesignoff(machineSignoffBody,getContext());



            }
        });

    }
    private void subscribeRequest() {
        machinesignoffViewModel.getMachinesignoffcases().observe(getViewLifecycleOwner(), new Observer<Machinsignoffcases>() {
            @Override
            public void onChanged(Machinsignoffcases machinsignoffcases) {
                switch (machinsignoffcases)
                {
                    case Donesuccessfully:
                        Toast.makeText(getContext(), "Done successfully", Toast.LENGTH_SHORT).show();//da bt3 elbusy ana hana 3akst


                        break;

                    case machinefree:

                        Toast.makeText(getContext(), "This machine has not been loaded with anything", Toast.LENGTH_SHORT).show();//da bt3 elbusy ana hana 3akst
                        // 3ashan btest

                        break;
                    case wrongmachine:

                        Toast.makeText(getContext(), "Wrong machine code", Toast.LENGTH_SHORT).show();//da bt3 elbusy ana hana 3akst
                        // 3ashan btest

                        break;
                    case servererror:

                        Toast.makeText(getContext(), "There was a server side failure while respond to this transaction", Toast.LENGTH_SHORT).show();//da bt3 elbusy ana hana 3akst
                        // 3ashan btest

                        break;




                }
            }
        });

    }


    @Override
    public void sendInput(String input) {
        fragmentProductionSignoffBinding.totalqtn.setText(input);
        fragmentProductionSignoffBinding.basketcode.setText(input);
    }

}