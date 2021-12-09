package com.example.gbsbadrsf.Quality.manfacturing.productionscraprequest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.gbsbadrsf.R;
import com.example.gbsbadrsf.Util.OnClick;
import com.example.gbsbadrsf.databinding.FragmentProductionscraplistinqualityBinding;


public class productionscraplistinqualityFragment extends Fragment implements OnClick {

    FragmentProductionscraplistinqualityBinding binding;
    ProductionRejectionListAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProductionscraplistinqualityBinding.inflate(inflater, container, false);
        initViews();

        return binding.getRoot();

    }

    private void initViews() {
        adapter = new ProductionRejectionListAdapter(this);
        binding.productionscrapscrapRv.setAdapter(adapter);
        binding.productionscrapscrapRv.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    @Override
    public void OnItemClickedListener(int position) {
        Navigation.findNavController(getView()).navigate(R.id.action_productionscraplistinqualityFragment_to_productionscraprequestqcFragment);

    }
}