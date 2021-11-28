package com.example.gbsbadrsf.Quality.manfacturing.qualitydesicion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gbsbadrsf.databinding.FragmentQualitydesicionBinding;
import com.example.gbsbadrsf.productionsequence.SimpleDividerItemDecoration;


public class qualitydesicionFragment extends Fragment {
FragmentQualitydesicionBinding binding;
qualitydesicionAdapter qualitydesicionAdapter;
RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQualitydesicionBinding.inflate(inflater, container, false);
        initViews();
        recyclerView = binding.defectqtnRv;
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getActivity()));

        return binding.getRoot();

    }

    private void initViews() {
        qualitydesicionAdapter = new qualitydesicionAdapter();
        binding.defectqtnRv.setAdapter(qualitydesicionAdapter);
        binding.defectqtnRv.setLayoutManager(new LinearLayoutManager(getContext()));
       // fragmentQualitydesicionBinding.saveBtn.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {
             //   if (fragmentQualitydesicionBinding.scrapCheckBox.isChecked()){
               //     Navigation.findNavController(getView()).navigate(R.id.action_qualitydesicionFragment_to_scrapFragment);


                //}

        //}
        //});
        }
}