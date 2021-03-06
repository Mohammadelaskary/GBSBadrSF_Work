package com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects;

import static android.content.ContentValues.TAG;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.lifecycle.ViewModelProviders;

import com.example.gbsbadrsf.Model.LastMoveManufacturingBasket;
import com.example.gbsbadrsf.Quality.Data.AddManufacturingDefectData;
import com.example.gbsbadrsf.Quality.Data.Defect;
import com.example.gbsbadrsf.Quality.Data.ManufacturingAddDefectsDetailsViewModel;
import com.example.gbsbadrsf.Quality.DefectsListAdapter;
import com.example.gbsbadrsf.R;
import com.example.gbsbadrsf.Util.ViewModelProviderFactory;
import com.example.gbsbadrsf.data.response.ResponseStatus;
import com.example.gbsbadrsf.data.response.Status;
import com.example.gbsbadrsf.databinding.FragmentManufacturingAddDefectDetailsBinding;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


public class ManufacturingAddDefectDetailsFragment extends DaggerFragment implements View.OnClickListener,SetOnManufacturingAddDefectDetailsButtonClicked {



    public ManufacturingAddDefectDetailsFragment() {
        // Required empty public constructor
    }


    public static ManufacturingAddDefectDetailsFragment newInstance() {
        ManufacturingAddDefectDetailsFragment fragment = new ManufacturingAddDefectDetailsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    FragmentManufacturingAddDefectDetailsBinding binding;
    LastMoveManufacturingBasket basketData;
    ManufacturingAddDefectsDetailsViewModel viewModel;
    @Inject
    ViewModelProviderFactory provider;

    List<Defect> allDefectsList = new ArrayList<>();
    DefectsListAdapter adapter;

    ProgressDialog progressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentManufacturingAddDefectDetailsBinding.inflate(
                inflater,
                container,
                false
        );
        progressDialog = new ProgressDialog(getContext());
        attachListeners();
        getReceivedData();
        fillData();
        initViewModel();
        getAllDefectsList();
        observeGettingDefectsListStatus();
        setUpDefectsRecyclerView();
        return binding.getRoot();
    }

    private void observeGettingDefectsListStatus() {
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading...");
        viewModel.getDefectsListStatus().observe(getViewLifecycleOwner(),status -> {
            if (status == Status.LOADING){
                progressDialog.show();
            } else {
                progressDialog.dismiss();
            }
        });
    }


    private void setUpDefectsRecyclerView() {
        adapter = new DefectsListAdapter(false,this);
        binding.defectsSelectList.setAdapter(adapter);
    }

    private void initViewModel() {
        viewModel = ViewModelProviders.of(this,provider).get(ManufacturingAddDefectsDetailsViewModel.class);
    }

    private void fillData() {
        binding.sampleQtnEdt.setText(String.valueOf(sampleQty));
        binding.childcode.setText(childCode);
        binding.childesc.setText(childDescription);
        binding.operation.setText(String.valueOf(operationId));
    }

    private void getReceivedData() {
        if (getArguments()!=null) {
            basketData = getArguments().getParcelable("basketData");
            childCode        = basketData.getChildCode();
            childDescription = basketData.getChildDescription();
            childId          = basketData.getChildId();
            jobOrderId       = basketData.getJobOrderId();
            operationId      = basketData.getOperationId();
            sampleQty        = getArguments().getInt("sampleQty");
        }
    }

    private void attachListeners() {
        binding.addDefectButton.setOnClickListener(this);
        binding.defectsListLayout.setOnClickListener(this);
    }
    String childCode,childDescription,notes = "ghi",deviceSerialNumber="fsd" ;
    int     childId,
            defectedQty,
            jobOrderId,
            operationId,
            parentId=3,
            sampleQty;
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.add_defect_button:{
                if (defectsIds.isEmpty()){
                    Toast.makeText(getContext(), "Please Select the found defects!", Toast.LENGTH_SHORT).show();
                } else {
                    AddManufacturingDefectData data = new AddManufacturingDefectData();
                    defectedQty=Integer.parseInt(binding.defectedQtnEdt.getText().toString().trim());
                    data.setUserId(1);
                    data.setDeviceSerialNo(deviceSerialNumber);
                    data.setJobOrderId(jobOrderId);
                    data.setParentID(parentId);
                    data.setChildId(childId);
                    data.setOperationID(operationId);
                    data.setQtyDefected(defectedQty);
                    data.setNotes(notes);
                    data.setSampleQty(sampleQty);
                    data.setDefectList(defectsIds);
                    viewModel.addManufacturingDefectResponseViewModel(data);
                    viewModel.getAddManufacturingDefectsResponse().observe(getViewLifecycleOwner(), response -> {
                        String responseMessage = response.getResponseStatus().getStatusMessage();
                        Toast.makeText(getContext(), responseMessage, Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "===AddDefect " + responseMessage);
                    });
                    observeAddingManufacturingDefects();
                }
            } break;
            case R.id.defects_list_layout:{
                if(binding.defectsSelectList.getVisibility()==View.VISIBLE){
                    binding.listDownArrow.setRotation(0);
                    binding.defectsSelectList.setVisibility(View.GONE);
                } else {
                    binding.listDownArrow.setRotation(180);
                    binding.defectsSelectList.setVisibility(View.VISIBLE);
                }
            } break;
        }
    }

    private void observeAddingManufacturingDefects() {
        viewModel.getAddManufacturingDefectsStatus().observe(getViewLifecycleOwner(),status -> {
            if ((status == Status.LOADING)) {
                progressDialog.show();
            } else {
                progressDialog.dismiss();
            }
        });
    }

    private void getAllDefectsList() {
        viewModel.getDefectsListViewModel();
        viewModel.getDefectsListLiveData().observe(getViewLifecycleOwner(), apiResponseDefectsList -> {
            ResponseStatus responseStatus = apiResponseDefectsList.getResponseStatus();
            String statusMessage = responseStatus.getStatusMessage();
            if (statusMessage.equals("Data sent successfully")){
                allDefectsList.clear();
                allDefectsList.addAll(apiResponseDefectsList.getDefectsList());
                adapter.setDefectList(allDefectsList);
                adapter.notifyDataSetChanged();
            }
        });
    }

    List<Integer> defectsIds = new ArrayList<>();
    @Override
    public void onManufacturingAddDefectDetailsButtonClicked(List<Integer> defectsIds) {
        this.defectsIds = defectsIds;
    }
}