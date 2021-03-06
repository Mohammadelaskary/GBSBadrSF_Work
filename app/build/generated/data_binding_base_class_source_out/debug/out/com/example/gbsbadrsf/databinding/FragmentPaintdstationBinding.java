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

public final class FragmentPaintdstationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView Joborderqtn;

  @NonNull
  public final TextView JoborderqtnTxt;

  @NonNull
  public final MaterialButton addworkersBtn;

  @NonNull
  public final ImageView barcodeImg;

  @NonNull
  public final EditText childcardEdt;

  @NonNull
  public final TextView childcardTxt;

  @NonNull
  public final TextView color;

  @NonNull
  public final TextView colorTxt;

  @NonNull
  public final TextView loadingqtn;

  @NonNull
  public final TextView loadingqtnTxt;

  @NonNull
  public final TextView operation;

  @NonNull
  public final TextView operationTxt;

  @NonNull
  public final TextView paintdstationtxt;

  @NonNull
  public final MaterialButton paintsequenceBtn;

  @NonNull
  public final TextView parentTxt;

  @NonNull
  public final TextView parentcode;

  @NonNull
  public final TextView parentdesc;

  @NonNull
  public final MaterialButton saveBtn;

  @NonNull
  public final EditText stationcodeEdt;

  @NonNull
  public final ImageView stationcodeImg;

  @NonNull
  public final TextView stationcodeTxt;

  private FragmentPaintdstationBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView Joborderqtn, @NonNull TextView JoborderqtnTxt,
      @NonNull MaterialButton addworkersBtn, @NonNull ImageView barcodeImg,
      @NonNull EditText childcardEdt, @NonNull TextView childcardTxt, @NonNull TextView color,
      @NonNull TextView colorTxt, @NonNull TextView loadingqtn, @NonNull TextView loadingqtnTxt,
      @NonNull TextView operation, @NonNull TextView operationTxt,
      @NonNull TextView paintdstationtxt, @NonNull MaterialButton paintsequenceBtn,
      @NonNull TextView parentTxt, @NonNull TextView parentcode, @NonNull TextView parentdesc,
      @NonNull MaterialButton saveBtn, @NonNull EditText stationcodeEdt,
      @NonNull ImageView stationcodeImg, @NonNull TextView stationcodeTxt) {
    this.rootView = rootView;
    this.Joborderqtn = Joborderqtn;
    this.JoborderqtnTxt = JoborderqtnTxt;
    this.addworkersBtn = addworkersBtn;
    this.barcodeImg = barcodeImg;
    this.childcardEdt = childcardEdt;
    this.childcardTxt = childcardTxt;
    this.color = color;
    this.colorTxt = colorTxt;
    this.loadingqtn = loadingqtn;
    this.loadingqtnTxt = loadingqtnTxt;
    this.operation = operation;
    this.operationTxt = operationTxt;
    this.paintdstationtxt = paintdstationtxt;
    this.paintsequenceBtn = paintsequenceBtn;
    this.parentTxt = parentTxt;
    this.parentcode = parentcode;
    this.parentdesc = parentdesc;
    this.saveBtn = saveBtn;
    this.stationcodeEdt = stationcodeEdt;
    this.stationcodeImg = stationcodeImg;
    this.stationcodeTxt = stationcodeTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPaintdstationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPaintdstationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_paintdstation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPaintdstationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Joborderqtn;
      TextView Joborderqtn = rootView.findViewById(id);
      if (Joborderqtn == null) {
        break missingId;
      }

      id = R.id.Joborderqtn_txt;
      TextView JoborderqtnTxt = rootView.findViewById(id);
      if (JoborderqtnTxt == null) {
        break missingId;
      }

      id = R.id.addworkers_btn;
      MaterialButton addworkersBtn = rootView.findViewById(id);
      if (addworkersBtn == null) {
        break missingId;
      }

      id = R.id.barcode_img;
      ImageView barcodeImg = rootView.findViewById(id);
      if (barcodeImg == null) {
        break missingId;
      }

      id = R.id.childcard_edt;
      EditText childcardEdt = rootView.findViewById(id);
      if (childcardEdt == null) {
        break missingId;
      }

      id = R.id.childcard_txt;
      TextView childcardTxt = rootView.findViewById(id);
      if (childcardTxt == null) {
        break missingId;
      }

      id = R.id.color;
      TextView color = rootView.findViewById(id);
      if (color == null) {
        break missingId;
      }

      id = R.id.color_txt;
      TextView colorTxt = rootView.findViewById(id);
      if (colorTxt == null) {
        break missingId;
      }

      id = R.id.loadingqtn;
      TextView loadingqtn = rootView.findViewById(id);
      if (loadingqtn == null) {
        break missingId;
      }

      id = R.id.loadingqtn_txt;
      TextView loadingqtnTxt = rootView.findViewById(id);
      if (loadingqtnTxt == null) {
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

      id = R.id.paintdstationtxt;
      TextView paintdstationtxt = rootView.findViewById(id);
      if (paintdstationtxt == null) {
        break missingId;
      }

      id = R.id.paintsequence_btn;
      MaterialButton paintsequenceBtn = rootView.findViewById(id);
      if (paintsequenceBtn == null) {
        break missingId;
      }

      id = R.id.parent_txt;
      TextView parentTxt = rootView.findViewById(id);
      if (parentTxt == null) {
        break missingId;
      }

      id = R.id.parentcode;
      TextView parentcode = rootView.findViewById(id);
      if (parentcode == null) {
        break missingId;
      }

      id = R.id.parentdesc;
      TextView parentdesc = rootView.findViewById(id);
      if (parentdesc == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = rootView.findViewById(id);
      if (saveBtn == null) {
        break missingId;
      }

      id = R.id.stationcode_edt;
      EditText stationcodeEdt = rootView.findViewById(id);
      if (stationcodeEdt == null) {
        break missingId;
      }

      id = R.id.stationcode_img;
      ImageView stationcodeImg = rootView.findViewById(id);
      if (stationcodeImg == null) {
        break missingId;
      }

      id = R.id.stationcode_txt;
      TextView stationcodeTxt = rootView.findViewById(id);
      if (stationcodeTxt == null) {
        break missingId;
      }

      return new FragmentPaintdstationBinding((ConstraintLayout) rootView, Joborderqtn,
          JoborderqtnTxt, addworkersBtn, barcodeImg, childcardEdt, childcardTxt, color, colorTxt,
          loadingqtn, loadingqtnTxt, operation, operationTxt, paintdstationtxt, paintsequenceBtn,
          parentTxt, parentcode, parentdesc, saveBtn, stationcodeEdt, stationcodeImg,
          stationcodeTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
