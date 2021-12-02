package com.example.gbsbadrsf.Quality.manfacturing.qualitydesicion;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gbsbadrsf.Model.LastMoveManufacturingBasket;
import com.example.gbsbadrsf.Model.QtyDefectsQtyDefected;
import com.example.gbsbadrsf.Quality.Data.DefectsManufacturing;
import com.example.gbsbadrsf.Quality.Data.FinalQualityDecision;
import com.example.gbsbadrsf.Quality.Data.QualityDecisionViewModel;
import com.example.gbsbadrsf.Quality.Data.RandomQualityInceptionViewModel;
import com.example.gbsbadrsf.Quality.QualityAddDefectChildsQtyDefectsQtyAdapter;
import com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects.SetOnQtyDefectedQtyDefectsItemClicked;
import com.example.gbsbadrsf.R;
import com.example.gbsbadrsf.Util.ViewModelProviderFactory;
import com.example.gbsbadrsf.data.response.Status;
import com.example.gbsbadrsf.databinding.FragmentQualityDesicionBinding;
import com.example.gbsbadrsf.productionsequence.SimpleDividerItemDecoration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


public class QualityDecisionFragment extends DaggerFragment implements SetOnQtyDefectedQtyDefectsItemClicked, View.OnClickListener {

    FragmentQualityDesicionBinding binding;
    QualityDecisionViewModel viewModel;
    @Inject
    ViewModelProviderFactory provider;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQualityDesicionBinding.inflate(inflater, container, false);
        initViewModel();
        initProgressDialog();
        initRecyclerView();
        getFinalQualityDecisionsList(userId);
        setUpFinalQualityDecisionSpinner();
        getBasketData("Bskt1");
        observeGettingDefectsManufacturing();

        initViews();


        return binding.getRoot();

    }

    private void getFinalQualityDecisionsList(int userId) {
        viewModel.getFinalQualityDecision(userId);
        viewModel.getApiResponseGettingFinalQualityDecisionMutableLiveData().observe(getViewLifecycleOwner(),apiResponseGettingFinalQualityDecision -> {
            String statusMessage = apiResponseGettingFinalQualityDecision.getResponseStatus().getStatusMessage();
            if (statusMessage.equals("Getting data successfully")){
                finalQualityDecisions.clear();
                finalQualityDecisions.addAll(apiResponseGettingFinalQualityDecision.getFinalQualityDecision());
                spinnerAdapter.notifyDataSetChanged();
            }
        });
    }

    List<FinalQualityDecision> finalQualityDecisions = new ArrayList<>();
    ArrayAdapter<FinalQualityDecision> spinnerAdapter;
    private void setUpFinalQualityDecisionSpinner() {

        spinnerAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item,finalQualityDecisions);
        binding.qfinaldesicionSpin.setAdapter(spinnerAdapter);
    }

    private void initProgressDialog() {
        progressDialog = new ProgressDialog(getContext());
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading...");
    }

    ProgressDialog progressDialog;
    private void observeGettingDefectsManufacturing() {
        viewModel.getDefectsManufacturingListStatus().observe(getViewLifecycleOwner(),status -> {
            if (status == Status.LOADING)
                progressDialog.show();
            else
                progressDialog.dismiss();
        });
    }

    private void initRecyclerView() {
        adapter = new QualityAddDefectChildsQtyDefectsQtyAdapter(this);
        binding.defectedQtnDefectsQtyRecycler.setAdapter(adapter);
    }

    private void initViewModel() {
        viewModel = ViewModelProviders.of(this,provider).get(QualityDecisionViewModel.class);
    }
    int userId = 1;
    String deviceSerialNumber = "Dev1",defectedQty;
    List<QtyDefectsQtyDefected> qtyDefectsQtyDefectedList = new ArrayList<>();
    List<DefectsManufacturing> defectsManufacturingList = new ArrayList<>();
    QualityAddDefectChildsQtyDefectsQtyAdapter adapter;
    String childCode = "",childDesc = "",jobOrderName = "", operation = "";
    private void getBasketData(String basketCode) {
        viewModel.getQualityOperationByBasketCode(userId,deviceSerialNumber,basketCode);
        viewModel.getDefectsManufacturingListLiveData().observe(getViewLifecycleOwner(),apiResponseDefectsManufacturing -> {
            String statusMessage = apiResponseDefectsManufacturing.getResponseStatus().getStatusMessage();
            if (statusMessage.equals("Data sent successfully")){
                defectsManufacturingList.clear();
                List<DefectsManufacturing> defectsManufacturings = apiResponseDefectsManufacturing.getData();
                defectsManufacturingList.addAll(defectsManufacturings);
                qtyDefectsQtyDefectedList = groupDefectsById(defectsManufacturings);
                adapter.setDefectsManufacturingList(qtyDefectsQtyDefectedList);
                adapter.notifyDataSetChanged();

                setBasketData(defectsManufacturings.get(0));
                fillViews();
            }
        });
    }

    private void setBasketData(DefectsManufacturing defectsManufacturing) {
        childCode = defectsManufacturing.getChildCode();
        childDesc = defectsManufacturing.getChildDescription();
        operation = defectsManufacturing.getOperationEnName();
        defectedQty = calculateDefectedQty(qtyDefectsQtyDefectedList);
    }

    private void fillViews() {
        binding.childcode.setText(childCode);
        binding.childesc.setText(childDesc);
        binding.operation.setText(operation);
        binding.defectqtn.setText(defectedQty);
    }



    public List<QtyDefectsQtyDefected> groupDefectsById(List<DefectsManufacturing> defectsManufacturingListLocal) {
        List<QtyDefectsQtyDefected> qtyDefectsQtyDefectedListLocal = new ArrayList<>();
        int id = -1 ;
        for (DefectsManufacturing defectsManufacturing:defectsManufacturingListLocal){
            if (defectsManufacturing.getManufacturingDefectsId()!=id){
                int currentId = defectsManufacturing.getManufacturingDefectsId();
                int defectedQty = defectsManufacturing.getDeffectedQty();
                QtyDefectsQtyDefected qtyDefectsQtyDefected = new QtyDefectsQtyDefected(currentId,defectedQty,getDefectsQty(currentId));
                qtyDefectsQtyDefectedListLocal.add(qtyDefectsQtyDefected);
                id = currentId;
            }
        }
        return qtyDefectsQtyDefectedListLocal;
    }
    private int getDefectsQty(int currentId) {
        int defectNo = 0;
        for (DefectsManufacturing defectsManufacturing:defectsManufacturingList){
            if (defectsManufacturing.getManufacturingDefectsId()==currentId)
                defectNo++;
        }
        return  defectNo;
    }
    private void initViews() {
        binding.saveBtn.setOnClickListener(this);
    }
    LastMoveManufacturingBasket basketData = null;
    @Override
    public void OnQtyDefectedQtyDefectsItemClicked(int id,View view) {
        ArrayList<DefectsManufacturing> customDefectsManufacturingList = new ArrayList<>();
        for (DefectsManufacturing defectsManufacturing : defectsManufacturingList) {
            if (defectsManufacturing.getManufacturingDefectsId() == id)
                customDefectsManufacturingList.add(defectsManufacturing);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("defectsManufacturingList", customDefectsManufacturingList);
        bundle.putParcelable("basketData", basketData);
        Navigation.findNavController(view).navigate(R.id.action_fragment_quality_decision_to_fragment_display_defect_details, bundle);

    }
    private String calculateDefectedQty(List<QtyDefectsQtyDefected> qtyDefectsQtyDefectedList) {
        int sum = 0;
        for (QtyDefectsQtyDefected qtyDefectsQtyDefected : qtyDefectsQtyDefectedList){
            sum +=qtyDefectsQtyDefected.getDefectedQty();
        }
        return String.valueOf(sum);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.save_btn:{
                Date date = Calendar.getInstance().getTime();
                FinalQualityDecision finalQualityDecision = (FinalQualityDecision) binding.qfinaldesicionSpin.getSelectedItem();
                int decisionId = finalQualityDecision.getFinalQualityDecisionId();

            } break;
        }
    }
}