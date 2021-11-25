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
import com.example.gbsbadrsf.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductionrepairpaintBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView basketbarcodeImg;

  @NonNull
  public final EditText basketcodeEdt;

  @NonNull
  public final TextView basketcodeTxt;

  @NonNull
  public final TextView child;

  @NonNull
  public final ConstraintLayout constraint;

  @NonNull
  public final TextView defectnameTxt;

  @NonNull
  public final TextView defectqtn;

  @NonNull
  public final TextView defectqtnTxt;

  @NonNull
  public final TextView defectqtyTxt;

  @NonNull
  public final HorizontalScrollView hsv;

  @NonNull
  public final TextView notesTxt;

  @NonNull
  public final TextView operation;

  @NonNull
  public final TextView operationTxt;

  @NonNull
  public final TextView parentTxt;

  @NonNull
  public final TextView parentcode;

  @NonNull
  public final TextView parentdesc;

  @NonNull
  public final TextView productionrepairTxt;

  @NonNull
  public final RecyclerView qcnotesRv;

  @NonNull
  public final TextView repairedqtyTxt;

  @NonNull
  public final MaterialButton saveBtn;

  @NonNull
  public final TextView statusTxt;

  @NonNull
  public final View view;

  private FragmentProductionrepairpaintBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView basketbarcodeImg, @NonNull EditText basketcodeEdt,
      @NonNull TextView basketcodeTxt, @NonNull TextView child,
      @NonNull ConstraintLayout constraint, @NonNull TextView defectnameTxt,
      @NonNull TextView defectqtn, @NonNull TextView defectqtnTxt, @NonNull TextView defectqtyTxt,
      @NonNull HorizontalScrollView hsv, @NonNull TextView notesTxt, @NonNull TextView operation,
      @NonNull TextView operationTxt, @NonNull TextView parentTxt, @NonNull TextView parentcode,
      @NonNull TextView parentdesc, @NonNull TextView productionrepairTxt,
      @NonNull RecyclerView qcnotesRv, @NonNull TextView repairedqtyTxt,
      @NonNull MaterialButton saveBtn, @NonNull TextView statusTxt, @NonNull View view) {
    this.rootView = rootView;
    this.basketbarcodeImg = basketbarcodeImg;
    this.basketcodeEdt = basketcodeEdt;
    this.basketcodeTxt = basketcodeTxt;
    this.child = child;
    this.constraint = constraint;
    this.defectnameTxt = defectnameTxt;
    this.defectqtn = defectqtn;
    this.defectqtnTxt = defectqtnTxt;
    this.defectqtyTxt = defectqtyTxt;
    this.hsv = hsv;
    this.notesTxt = notesTxt;
    this.operation = operation;
    this.operationTxt = operationTxt;
    this.parentTxt = parentTxt;
    this.parentcode = parentcode;
    this.parentdesc = parentdesc;
    this.productionrepairTxt = productionrepairTxt;
    this.qcnotesRv = qcnotesRv;
    this.repairedqtyTxt = repairedqtyTxt;
    this.saveBtn = saveBtn;
    this.statusTxt = statusTxt;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductionrepairpaintBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductionrepairpaintBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_productionrepairpaint, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductionrepairpaintBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.basketbarcode_img;
      ImageView basketbarcodeImg = rootView.findViewById(id);
      if (basketbarcodeImg == null) {
        break missingId;
      }

      id = R.id.basketcode_edt;
      EditText basketcodeEdt = rootView.findViewById(id);
      if (basketcodeEdt == null) {
        break missingId;
      }

      id = R.id.basketcode_txt;
      TextView basketcodeTxt = rootView.findViewById(id);
      if (basketcodeTxt == null) {
        break missingId;
      }

      id = R.id.child;
      TextView child = rootView.findViewById(id);
      if (child == null) {
        break missingId;
      }

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

      id = R.id.defectqtn;
      TextView defectqtn = rootView.findViewById(id);
      if (defectqtn == null) {
        break missingId;
      }

      id = R.id.defectqtn_txt;
      TextView defectqtnTxt = rootView.findViewById(id);
      if (defectqtnTxt == null) {
        break missingId;
      }

      id = R.id.defectqty_txt;
      TextView defectqtyTxt = rootView.findViewById(id);
      if (defectqtyTxt == null) {
        break missingId;
      }

      id = R.id.hsv;
      HorizontalScrollView hsv = rootView.findViewById(id);
      if (hsv == null) {
        break missingId;
      }

      id = R.id.notes_txt;
      TextView notesTxt = rootView.findViewById(id);
      if (notesTxt == null) {
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

      id = R.id.productionrepair_txt;
      TextView productionrepairTxt = rootView.findViewById(id);
      if (productionrepairTxt == null) {
        break missingId;
      }

      id = R.id.qcnotes_rv;
      RecyclerView qcnotesRv = rootView.findViewById(id);
      if (qcnotesRv == null) {
        break missingId;
      }

      id = R.id.repairedqty_txt;
      TextView repairedqtyTxt = rootView.findViewById(id);
      if (repairedqtyTxt == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = rootView.findViewById(id);
      if (saveBtn == null) {
        break missingId;
      }

      id = R.id.status_txt;
      TextView statusTxt = rootView.findViewById(id);
      if (statusTxt == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      return new FragmentProductionrepairpaintBinding((ConstraintLayout) rootView, basketbarcodeImg,
          basketcodeEdt, basketcodeTxt, child, constraint, defectnameTxt, defectqtn, defectqtnTxt,
          defectqtyTxt, hsv, notesTxt, operation, operationTxt, parentTxt, parentcode, parentdesc,
          productionrepairTxt, qcnotesRv, repairedqtyTxt, saveBtn, statusTxt, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
