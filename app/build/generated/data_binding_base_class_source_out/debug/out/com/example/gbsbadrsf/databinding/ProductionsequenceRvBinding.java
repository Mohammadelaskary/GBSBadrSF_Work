// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.gbsbadrsf.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProductionsequenceRvBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView childdesc;

  @NonNull
  public final TextView jobordername;

  @NonNull
  public final TextView joborderquantity;

  @NonNull
  public final TextView loadingqty;

  @NonNull
  public final CheckBox sequencenumCheckBox;

  @NonNull
  public final TextView status;

  private ProductionsequenceRvBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView childdesc, @NonNull TextView jobordername,
      @NonNull TextView joborderquantity, @NonNull TextView loadingqty,
      @NonNull CheckBox sequencenumCheckBox, @NonNull TextView status) {
    this.rootView = rootView;
    this.childdesc = childdesc;
    this.jobordername = jobordername;
    this.joborderquantity = joborderquantity;
    this.loadingqty = loadingqty;
    this.sequencenumCheckBox = sequencenumCheckBox;
    this.status = status;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProductionsequenceRvBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProductionsequenceRvBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.productionsequence_rv, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProductionsequenceRvBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.childdesc;
      TextView childdesc = rootView.findViewById(id);
      if (childdesc == null) {
        break missingId;
      }

      id = R.id.jobordername;
      TextView jobordername = rootView.findViewById(id);
      if (jobordername == null) {
        break missingId;
      }

      id = R.id.joborderquantity;
      TextView joborderquantity = rootView.findViewById(id);
      if (joborderquantity == null) {
        break missingId;
      }

      id = R.id.loadingqty;
      TextView loadingqty = rootView.findViewById(id);
      if (loadingqty == null) {
        break missingId;
      }

      id = R.id.sequencenum_checkBox;
      CheckBox sequencenumCheckBox = rootView.findViewById(id);
      if (sequencenumCheckBox == null) {
        break missingId;
      }

      id = R.id.status;
      TextView status = rootView.findViewById(id);
      if (status == null) {
        break missingId;
      }

      return new ProductionsequenceRvBinding((ConstraintLayout) rootView, childdesc, jobordername,
          joborderquantity, loadingqty, sequencenumCheckBox, status);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
