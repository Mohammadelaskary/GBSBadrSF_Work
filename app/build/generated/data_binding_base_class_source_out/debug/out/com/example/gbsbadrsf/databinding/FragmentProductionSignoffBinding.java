// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.gbsbadrsf.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductionSignoffBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView basketcode;

  @NonNull
  public final TextView childcode;

  @NonNull
  public final TextView childcodeTxt;

  @NonNull
  public final TextView childesc;

  @NonNull
  public final TextView jobordernum;

  @NonNull
  public final TextView jobordernumTxt;

  @NonNull
  public final TextView loadingqtn;

  @NonNull
  public final TextView loadingquantityTxt;

  @NonNull
  public final EditText machinecodeEdt;

  @NonNull
  public final TextView machinecodeTxt;

  @NonNull
  public final ImageView machinecodebarcodeImg;

  @NonNull
  public final TextView operation;

  @NonNull
  public final TextView operationTxt;

  @NonNull
  public final TextView productionsignoffTxt;

  @NonNull
  public final MaterialButton saveBtn;

  @NonNull
  public final MaterialButton signoffitemsBtn;

  @NonNull
  public final TextView totalqtn;

  private FragmentProductionSignoffBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView basketcode, @NonNull TextView childcode, @NonNull TextView childcodeTxt,
      @NonNull TextView childesc, @NonNull TextView jobordernum, @NonNull TextView jobordernumTxt,
      @NonNull TextView loadingqtn, @NonNull TextView loadingquantityTxt,
      @NonNull EditText machinecodeEdt, @NonNull TextView machinecodeTxt,
      @NonNull ImageView machinecodebarcodeImg, @NonNull TextView operation,
      @NonNull TextView operationTxt, @NonNull TextView productionsignoffTxt,
      @NonNull MaterialButton saveBtn, @NonNull MaterialButton signoffitemsBtn,
      @NonNull TextView totalqtn) {
    this.rootView = rootView;
    this.basketcode = basketcode;
    this.childcode = childcode;
    this.childcodeTxt = childcodeTxt;
    this.childesc = childesc;
    this.jobordernum = jobordernum;
    this.jobordernumTxt = jobordernumTxt;
    this.loadingqtn = loadingqtn;
    this.loadingquantityTxt = loadingquantityTxt;
    this.machinecodeEdt = machinecodeEdt;
    this.machinecodeTxt = machinecodeTxt;
    this.machinecodebarcodeImg = machinecodebarcodeImg;
    this.operation = operation;
    this.operationTxt = operationTxt;
    this.productionsignoffTxt = productionsignoffTxt;
    this.saveBtn = saveBtn;
    this.signoffitemsBtn = signoffitemsBtn;
    this.totalqtn = totalqtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductionSignoffBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductionSignoffBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_production_signoff, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductionSignoffBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.basketcode;
      TextView basketcode = rootView.findViewById(id);
      if (basketcode == null) {
        break missingId;
      }

      id = R.id.childcode;
      TextView childcode = rootView.findViewById(id);
      if (childcode == null) {
        break missingId;
      }

      id = R.id.childcode_txt;
      TextView childcodeTxt = rootView.findViewById(id);
      if (childcodeTxt == null) {
        break missingId;
      }

      id = R.id.childesc;
      TextView childesc = rootView.findViewById(id);
      if (childesc == null) {
        break missingId;
      }

      id = R.id.jobordernum;
      TextView jobordernum = rootView.findViewById(id);
      if (jobordernum == null) {
        break missingId;
      }

      id = R.id.jobordernum_txt;
      TextView jobordernumTxt = rootView.findViewById(id);
      if (jobordernumTxt == null) {
        break missingId;
      }

      id = R.id.loadingqtn;
      TextView loadingqtn = rootView.findViewById(id);
      if (loadingqtn == null) {
        break missingId;
      }

      id = R.id.loadingquantity_txt;
      TextView loadingquantityTxt = rootView.findViewById(id);
      if (loadingquantityTxt == null) {
        break missingId;
      }

      id = R.id.machinecode_edt;
      EditText machinecodeEdt = rootView.findViewById(id);
      if (machinecodeEdt == null) {
        break missingId;
      }

      id = R.id.machinecode_txt;
      TextView machinecodeTxt = rootView.findViewById(id);
      if (machinecodeTxt == null) {
        break missingId;
      }

      id = R.id.machinecodebarcode_img;
      ImageView machinecodebarcodeImg = rootView.findViewById(id);
      if (machinecodebarcodeImg == null) {
        break missingId;
      }

      id = R.id.operation;
      TextView operation = rootView.findViewById(id);
      if (operation == null) {
        break missingId;
      }

      id = R.id.operation_txt;
      TextView operationTxt = rootView.findViewById(id);
      if (operationTxt == null) {
        break missingId;
      }

      id = R.id.productionsignoff_txt;
      TextView productionsignoffTxt = rootView.findViewById(id);
      if (productionsignoffTxt == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = rootView.findViewById(id);
      if (saveBtn == null) {
        break missingId;
      }

      id = R.id.signoffitems_btn;
      MaterialButton signoffitemsBtn = rootView.findViewById(id);
      if (signoffitemsBtn == null) {
        break missingId;
      }

      id = R.id.totalqtn;
      TextView totalqtn = rootView.findViewById(id);
      if (totalqtn == null) {
        break missingId;
      }

      return new FragmentProductionSignoffBinding((ConstraintLayout) rootView, basketcode,
          childcode, childcodeTxt, childesc, jobordernum, jobordernumTxt, loadingqtn,
          loadingquantityTxt, machinecodeEdt, machinecodeTxt, machinecodebarcodeImg, operation,
          operationTxt, productionsignoffTxt, saveBtn, signoffitemsBtn, totalqtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
