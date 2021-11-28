// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.gbsbadrsf.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWeldingSequenceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraint;

  @NonNull
  public final TextView defectnameTxt;

  @NonNull
  public final RecyclerView defectqtnRv;

  @NonNull
  public final HorizontalScrollView hsv;

  @NonNull
  public final TextView productionnotesTxt;

  @NonNull
  public final TextView productionrepairTxt;

  @NonNull
  public final TextView qcnotesTxt;

  @NonNull
  public final MaterialButton qtnokBtn;

  @NonNull
  public final View view;

  @NonNull
  public final TextView weldingseqTxt;

  private FragmentWeldingSequenceBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraint, @NonNull TextView defectnameTxt,
      @NonNull RecyclerView defectqtnRv, @NonNull HorizontalScrollView hsv,
      @NonNull TextView productionnotesTxt, @NonNull TextView productionrepairTxt,
      @NonNull TextView qcnotesTxt, @NonNull MaterialButton qtnokBtn, @NonNull View view,
      @NonNull TextView weldingseqTxt) {
    this.rootView = rootView;
    this.constraint = constraint;
    this.defectnameTxt = defectnameTxt;
    this.defectqtnRv = defectqtnRv;
    this.hsv = hsv;
    this.productionnotesTxt = productionnotesTxt;
    this.productionrepairTxt = productionrepairTxt;
    this.qcnotesTxt = qcnotesTxt;
    this.qtnokBtn = qtnokBtn;
    this.view = view;
    this.weldingseqTxt = weldingseqTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWeldingSequenceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWeldingSequenceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_welding_sequence, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWeldingSequenceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraint;
      ConstraintLayout constraint = rootView.findViewById(id);
      if (constraint == null) {
        break missingId;
      }

      id = R.id.defectname_txt;
      TextView defectnameTxt = rootView.findViewById(id);
      if (defectnameTxt == null) {
        break missingId;
      }

      id = R.id.defectqtn_rv;
      RecyclerView defectqtnRv = rootView.findViewById(id);
      if (defectqtnRv == null) {
        break missingId;
      }

      id = R.id.hsv;
      HorizontalScrollView hsv = rootView.findViewById(id);
      if (hsv == null) {
        break missingId;
      }

      id = R.id.productionnotes_txt;
      TextView productionnotesTxt = rootView.findViewById(id);
      if (productionnotesTxt == null) {
        break missingId;
      }

      id = R.id.productionrepair_txt;
      TextView productionrepairTxt = rootView.findViewById(id);
      if (productionrepairTxt == null) {
        break missingId;
      }

      id = R.id.qcnotes_txt;
      TextView qcnotesTxt = rootView.findViewById(id);
      if (qcnotesTxt == null) {
        break missingId;
      }

      id = R.id.qtnok_btn;
      MaterialButton qtnokBtn = rootView.findViewById(id);
      if (qtnokBtn == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      id = R.id.weldingseq_txt;
      TextView weldingseqTxt = rootView.findViewById(id);
      if (weldingseqTxt == null) {
        break missingId;
      }

      return new FragmentWeldingSequenceBinding((ConstraintLayout) rootView, constraint,
          defectnameTxt, defectqtnRv, hsv, productionnotesTxt, productionrepairTxt, qcnotesTxt,
          qtnokBtn, view, weldingseqTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}