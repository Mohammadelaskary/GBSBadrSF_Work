package com.example.gbsbadrsf.Quality.manfacturing.Adddefects;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gbsbadrsf.databinding.DefectnameandcodeLstBinding;

public class AdddefectsAdapter extends RecyclerView.Adapter<AdddefectsAdapter.AdddefectsViewHolder> {
    DefectnameandcodeLstBinding defectnameandcodeLstBinding;


    @NonNull
    @Override
    public AdddefectsAdapter.AdddefectsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        defectnameandcodeLstBinding = DefectnameandcodeLstBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new AdddefectsViewHolder(defectnameandcodeLstBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdddefectsAdapter.AdddefectsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;

    }

    class AdddefectsViewHolder extends RecyclerView.ViewHolder {
        CheckBox defectnamecheckbox;
        TextView child,sampleqty,defectqty;


        public AdddefectsViewHolder(@NonNull DefectnameandcodeLstBinding itemView) {
            super(itemView.getRoot());
            defectnamecheckbox = itemView.defectnameCheckBox;
            child = itemView.child;
            sampleqty = itemView.sampleqty;
            defectqty = itemView.defectqty;

        }
    }
}
