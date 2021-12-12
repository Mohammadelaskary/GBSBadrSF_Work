package com.example.gbsbadrsf.weldingsequence;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gbsbadrsf.data.response.PprWelding;
import com.example.gbsbadrsf.databinding.ProductionsequenceRvBinding;

import java.util.List;

public class WeldingsequenceAdapter extends RecyclerView.Adapter<WeldingsequenceAdapter.WeldingsequenceViewHolder> {
    private List<PprWelding> weldingsequenceresponse;
    WeldingsequenceAdapter.onCheckedChangedListener onClick;
    private CheckBox lastCheckedRB = null;


    public WeldingsequenceAdapter(List<PprWelding> weldingsequenceresponse, WeldingsequenceAdapter.onCheckedChangedListener onClick) {
        this.weldingsequenceresponse = weldingsequenceresponse;
        this.onClick = onClick;

    }
    public void getweldingsequencelist(List<PprWelding> weldingsequencelst){
        weldingsequenceresponse.clear();
        weldingsequenceresponse.addAll(weldingsequencelst);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public WeldingsequenceAdapter.WeldingsequenceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ProductionsequenceRvBinding productionsequenceRvBinding = ProductionsequenceRvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new WeldingsequenceAdapter.WeldingsequenceViewHolder(productionsequenceRvBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull WeldingsequenceAdapter.WeldingsequenceViewHolder holder, int position) {

        holder.sequencenumbercheckbox.setText(weldingsequenceresponse.get(position).getLoadingSequenceNumber().toString());
        holder.childdesc.setText(weldingsequenceresponse.get(position).getParentDescription());
        holder.loadingqty.setText(weldingsequenceresponse.get(position).getLoadingQty().toString());
        holder.jobordername.setText(weldingsequenceresponse.get(position).getJobOrderName());
        holder.joborderquantity.setText(weldingsequenceresponse.get(position).getJobOrderQty().toString());
        holder.status.setText(weldingsequenceresponse.get(position).getLoadingSequenceStatus().toString());


        holder.sequencenumbercheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                CheckBox checked_rb = (CheckBox) buttonView;
                if (lastCheckedRB != null) {
                    lastCheckedRB.setChecked(false);
                }
                lastCheckedRB = checked_rb;
                onClick.onCheckedChanged(holder.getAdapterPosition(),isChecked, weldingsequenceresponse.get(position));
            }
        });



    }

    @Override
    public int getItemCount() {
        return weldingsequenceresponse.size();
    }
    class WeldingsequenceViewHolder extends RecyclerView.ViewHolder{
        CheckBox sequencenumbercheckbox;

        TextView childdesc,loadingqty,jobordername,joborderquantity,status;

        public WeldingsequenceViewHolder(@NonNull ProductionsequenceRvBinding itemView) {
            super(itemView.getRoot());
            sequencenumbercheckbox=itemView.sequencenumCheckBox;
            childdesc=itemView.childdesc;
            loadingqty=itemView.loadingqty;
            status=itemView.status;
            jobordername=itemView.jobordername;
            joborderquantity=itemView.joborderquantity;
        }

    }
    public interface onCheckedChangedListener{
        void onCheckedChanged(int position, boolean isChecked, PprWelding item);
    }


}

