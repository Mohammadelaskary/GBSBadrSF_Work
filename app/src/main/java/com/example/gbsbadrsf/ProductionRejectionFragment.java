package com.example.gbsbadrsf;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.gbsbadrsf.Model.Department;
import com.example.gbsbadrsf.Model.LastMoveManufacturingBasketInfo;
import com.example.gbsbadrsf.Production.Data.ProductionRejectionViewModel;
import com.example.gbsbadrsf.Util.ViewModelProviderFactory;
import com.example.gbsbadrsf.data.response.ResponseStatus;
import com.example.gbsbadrsf.data.response.Status;
import com.example.gbsbadrsf.databinding.FragmentProductionRejectionBinding;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


public class ProductionRejectionFragment extends DaggerFragment implements View.OnClickListener {
    private static final String GETTING_DATA_SUCCESSFULLY = "Getting data successfully";
    ProductionRejectionViewModel viewModel;
    @Inject
    ViewModelProviderFactory provider;
    public ProductionRejectionFragment() {
        // Required empty public constructor
    }


    public static ProductionRejectionFragment newInstance() {
        return new ProductionRejectionFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    FragmentProductionRejectionBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProductionRejectionBinding.inflate(inflater,container,false);
        initViewModel();
        setUpProgressDialog();
        getDepartmentsList();
        setUpDepartmentsSpinner();
        observeGettingDepartments();
        getBasketData();
        attachButtonsToListener();
        addTextWatchers();
        observeSavingRejectionRequest();
        return binding.getRoot();
    }

    private void observeSavingRejectionRequest() {
        viewModel.getApiResponseSaveRejectionRequestStatus().observe(getViewLifecycleOwner(),status -> {
            if (status == Status.LOADING)
                progressDialog.show();
            else
                progressDialog.dismiss();
        });
    }

    private void addTextWatchers() {
        binding.rejectedQtyEdt.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                binding.rejectedQtyEdt.setError(null);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.rejectedQtyEdt.setError(null);
            }

            @Override
            public void afterTextChanged(Editable s) {
                binding.rejectedQtyEdt.setError(null);
            }
        });
    }

    private void attachButtonsToListener() {
        binding.saveBtn.setOnClickListener(this);
        binding.existingdefBtn.setOnClickListener(this);
        binding.newdefBtn.setOnClickListener(this);
    }

    String basketCode = "Bskt1",childCode,childDesc,jobOrderName,deviceSerial="dev1";
    int basketQty;
    LastMoveManufacturingBasketInfo basketData;

    private void getBasketData() {
        viewModel.getBasketDataViewModel(userId,deviceSerial,basketCode);
        viewModel.getApiResponseBasketDataLiveData().observe(getViewLifecycleOwner(),apiResponseLastMoveManufacturingBasket -> {
            basketData = apiResponseLastMoveManufacturingBasket.getLastMoveManufacturingBasketInfo();
            String statusMessage = apiResponseLastMoveManufacturingBasket.getResponseStatus().getStatusMessage();
            childCode = basketData.getChildCode();
            childDesc = basketData.getChildDescription();
            jobOrderName = basketData.getJobOrderName();
            basketQty    = basketData.getQty();
            fillViewsData();
        });
    }

    private void fillViewsData() {
        binding.childcode.setText(childCode);
        binding.childdesc.setText(childDesc);
        binding.jobordername.setText(jobOrderName);
        binding.basketqtn.setText(String.valueOf(basketQty));
    }

    private void observeGettingDepartments() {
        viewModel.getApiResponseDepartmentsListStatus().observe(getViewLifecycleOwner(),status -> {
            if (status == Status.LOADING){
                progressDialog.show();
            } else {
                progressDialog.dismiss();
            }
        });
    }
    int departmentId = -1 ;
    ArrayAdapter<Department> spinnerAdapter;
    private void setUpDepartmentsSpinner() {
        spinnerAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item,departments);
        Log.d("selected","departmentsNum "+departments.size());
        binding.responsibledepSpin.setAdapter(spinnerAdapter);
    }

    ProgressDialog progressDialog;
    private void setUpProgressDialog() {
        progressDialog = new ProgressDialog(getContext());
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading...");
    }

    List<Department> departments = new ArrayList<>();
    int userId = 1;
    private void getDepartmentsList() {
        viewModel.getDepartmentsList(userId);
        viewModel.getApiResponseDepartmentsListLiveData().observe(getViewLifecycleOwner(),apiResponseDepartmentsList -> {
            ResponseStatus responseStatus = apiResponseDepartmentsList.getResponseStatus();
            List<Department> departmentList = apiResponseDepartmentsList.getDepartments();
            if (responseStatus.getStatusMessage().equals(GETTING_DATA_SUCCESSFULLY)){
                departments.clear();
                departments.addAll(departmentList);
                spinnerAdapter.notifyDataSetChanged();
            } else {
                Toast.makeText(getContext(), "Failed to get Departments", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initViewModel() {
        viewModel = ViewModelProviders.of(this,provider).get(ProductionRejectionViewModel.class);
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.save_btn:{
                String rejectedQtyString = binding.rejectedQtyEdt.getEditText().getText().toString().trim();
                boolean emptyRejectedQty = rejectedQtyString.isEmpty()||Integer.parseInt(rejectedQtyString)==0;
                boolean validRejectedQty = false;
                if (emptyRejectedQty)
                    binding.rejectedQtyEdt.setError("Please enter the rejected quantity!");
                else {
                    validRejectedQty = Integer.parseInt(rejectedQtyString) <= basketQty;
                    if (!validRejectedQty)
                        binding.rejectedQtyEdt.setError("Rejected quantity must be fewer than or equal basket quantity!");
                }
                //                String newBasketCode = binding.basketEdt.getText().toString().trim();
                String newBasketCode = "Bskt10";
                if (newBasketCode.isEmpty())
                    showDialog("Please scan or enter basket code!");
                boolean validResponsibility = binding.responsibledepSpin.getSelectedItemPosition()>=0&&binding.responsibledepSpin.getSelectedItemPosition()<departments.size();
                if (validResponsibility){
                    Department department = departments.get(binding.responsibledepSpin.getSelectedItemPosition());
                    departmentId = department.getDepartmentId();
                } else {
                    Toast.makeText(getContext(), "Please Select A Responsibility!", Toast.LENGTH_SHORT).show();
                }
                if (!emptyRejectedQty&&validRejectedQty&&validRejectedQty&&!newBasketCode.isEmpty()){
                    saveRejectedRequest(userId,deviceSerial,newBasketCode,Integer.parseInt(rejectedQtyString),departmentId);
                }
            } break;
            case R.id.existingdef_btn:{

            } break;
            case R.id.newdef_btn:{

            } break;
        }
    }

    private void saveRejectedRequest(int userId, String deviceSerial, String newBasketCode, int rejectedQty, int departmentId) {
        viewModel.saveRejectionRequest(userId,deviceSerial,newBasketCode,rejectedQty,departmentId);
        viewModel.getApiResponseSaveRejectionRequestLiveData().observe(getViewLifecycleOwner(),apiResponseSaveRejectionRequest -> {
            String statusMessage = apiResponseSaveRejectionRequest.getResponseStatus().getStatusMessage();
            Toast.makeText(getContext(), statusMessage, Toast.LENGTH_SHORT).show();
        });
    }

    private void showDialog(String s) {
       new AlertDialog.Builder(getContext())
               .setMessage(s)
               .setIcon(R.drawable.ic_round_warning)
               .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       dialog.dismiss();
                       binding.basketcodeEdt.requestFocus();
                   }
               })
               .show();
    }
}