// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.gbsbadrsf.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductionSequenceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText barcodeEdt;

  @NonNull
  public final ImageView barcodeImg;

  @NonNull
  public final TextView childTxt;

  @NonNull
  public final ConstraintLayout constraint;

  @NonNull
  public final RecyclerView defectqtnRv;

  @NonNull
  public final MaterialButton firstloadingBtn;

  @NonNull
  public final HorizontalScrollView hsv;

  @NonNull
  public final TextView jobordernameTxt;

  @NonNull
  public final TextView joborderqtnTxt;

  @NonNull
  public final TextView loadingqtyTxt;

  @NonNull
  public final TextView productionseqTxt;

  @NonNull
  public final TextView sequencenumTxt;

  @NonNull
  public final TextView statusTxt;

  @NonNull
  public final View view;

  private FragmentProductionSequenceBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText barcodeEdt, @NonNull ImageView barcodeImg, @NonNull TextView childTxt,
      @NonNull ConstraintLayout constraint, @NonNull RecyclerView defectqtnRv,
      @NonNull MaterialButton firstloadingBtn, @NonNull HorizontalScrollView hsv,
      @NonNull TextView jobordernameTxt, @NonNull TextView joborderqtnTxt,
      @NonNull TextView loadingqtyTxt, @NonNull TextView productionseqTxt,
      @NonNull TextView sequencenumTxt, @NonNull TextView statusTxt, @NonNull View view) {
    this.rootView = rootView;
    this.barcodeEdt = barcodeEdt;
    this.barcodeImg = barcodeImg;
    this.childTxt = childTxt;
    this.constraint = constraint;
    this.defectqtnRv = defectqtnRv;
    this.firstloadingBtn = firstloadingBtn;
    this.hsv = hsv;
    this.jobordernameTxt = jobordernameTxt;
    this.joborderqtnTxt = joborderqtnTxt;
    this.loadingqtyTxt = loadingqtyTxt;
    this.productionseqTxt = productionseqTxt;
    this.sequencenumTxt = sequencenumTxt;
    this.statusTxt = statusTxt;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductionSequenceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductionSequenceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_production_sequence, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductionSequenceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barcode_edt;
      EditText barcodeEdt = ViewBindings.findChildViewById(rootView, id);
      if (barcodeEdt == null) {
        break missingId;
      }

      id = R.id.barcode_img;
      ImageView barcodeImg = ViewBindings.findChildViewById(rootView, id);
      if (barcodeImg == null) {
        break missingId;
      }

      id = R.id.child_txt;
      TextView childTxt = ViewBindings.findChildViewById(rootView, id);
      if (childTxt == null) {
        break missingId;
      }

      id = R.id.constraint;
      ConstraintLayout constraint = ViewBindings.findChildViewById(rootView, id);
      if (constraint == null) {
        break missingId;
      }

      id = R.id.defectqtn_rv;
      RecyclerView defectqtnRv = ViewBindings.findChildViewById(rootView, id);
      if (defectqtnRv == null) {
        break missingId;
      }

      id = R.id.firstloading_btn;
      MaterialButton firstloadingBtn = ViewBindings.findChildViewById(rootView, id);
      if (firstloadingBtn == null) {
        break missingId;
      }

      id = R.id.hsv;
      HorizontalScrollView hsv = ViewBindings.findChildViewById(rootView, id);
      if (hsv == null) {
        break missingId;
      }

      id = R.id.jobordername_txt;
      TextView jobordernameTxt = ViewBindings.findChildViewById(rootView, id);
      if (jobordernameTxt == null) {
        break missingId;
      }

      id = R.id.joborderqtn_txt;
      TextView joborderqtnTxt = ViewBindings.findChildViewById(rootView, id);
      if (joborderqtnTxt == null) {
        break missingId;
      }

      id = R.id.loadingqty_txt;
      TextView loadingqtyTxt = ViewBindings.findChildViewById(rootView, id);
      if (loadingqtyTxt == null) {
        break missingId;
      }

      id = R.id.productionseq_txt;
      TextView productionseqTxt = ViewBindings.findChildViewById(rootView, id);
      if (productionseqTxt == null) {
        break missingId;
      }

      id = R.id.sequencenum_txt;
      TextView sequencenumTxt = ViewBindings.findChildViewById(rootView, id);
      if (sequencenumTxt == null) {
        break missingId;
      }

      id = R.id.status_txt;
      TextView statusTxt = ViewBindings.findChildViewById(rootView, id);
      if (statusTxt == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new FragmentProductionSequenceBinding((ConstraintLayout) rootView, barcodeEdt,
          barcodeImg, childTxt, constraint, defectqtnRv, firstloadingBtn, hsv, jobordernameTxt,
          joborderqtnTxt, loadingqtyTxt, productionseqTxt, sequencenumTxt, statusTxt, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
