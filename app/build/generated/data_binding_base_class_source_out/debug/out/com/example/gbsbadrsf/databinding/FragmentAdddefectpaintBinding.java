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
import androidx.viewbinding.ViewBindings;
import com.example.gbsbadrsf.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAdddefectpaintBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView adddefectTxt;

  @NonNull
  public final EditText basketEdt;

  @NonNull
  public final ImageView basketImg;

  @NonNull
  public final TextView basketTxt;

  @NonNull
  public final TextView defectqtn;

  @NonNull
  public final TextView defectqtnTxt;

  @NonNull
  public final ImageView itemcardbarcodeImg;

  @NonNull
  public final EditText itemcodeEdt;

  @NonNull
  public final TextView itemcodeTxt;

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
  public final ImageView plusIcon;

  @NonNull
  public final EditText sampleqtnEdt;

  @NonNull
  public final TextView sampleqtnTxt;

  @NonNull
  public final MaterialButton saveBtn;

  private FragmentAdddefectpaintBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView adddefectTxt, @NonNull EditText basketEdt, @NonNull ImageView basketImg,
      @NonNull TextView basketTxt, @NonNull TextView defectqtn, @NonNull TextView defectqtnTxt,
      @NonNull ImageView itemcardbarcodeImg, @NonNull EditText itemcodeEdt,
      @NonNull TextView itemcodeTxt, @NonNull TextView operation, @NonNull TextView operationTxt,
      @NonNull TextView parentTxt, @NonNull TextView parentcode, @NonNull TextView parentdesc,
      @NonNull ImageView plusIcon, @NonNull EditText sampleqtnEdt, @NonNull TextView sampleqtnTxt,
      @NonNull MaterialButton saveBtn) {
    this.rootView = rootView;
    this.adddefectTxt = adddefectTxt;
    this.basketEdt = basketEdt;
    this.basketImg = basketImg;
    this.basketTxt = basketTxt;
    this.defectqtn = defectqtn;
    this.defectqtnTxt = defectqtnTxt;
    this.itemcardbarcodeImg = itemcardbarcodeImg;
    this.itemcodeEdt = itemcodeEdt;
    this.itemcodeTxt = itemcodeTxt;
    this.operation = operation;
    this.operationTxt = operationTxt;
    this.parentTxt = parentTxt;
    this.parentcode = parentcode;
    this.parentdesc = parentdesc;
    this.plusIcon = plusIcon;
    this.sampleqtnEdt = sampleqtnEdt;
    this.sampleqtnTxt = sampleqtnTxt;
    this.saveBtn = saveBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAdddefectpaintBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAdddefectpaintBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_adddefectpaint, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAdddefectpaintBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adddefect_txt;
      TextView adddefectTxt = ViewBindings.findChildViewById(rootView, id);
      if (adddefectTxt == null) {
        break missingId;
      }

      id = R.id.basket_edt;
      EditText basketEdt = ViewBindings.findChildViewById(rootView, id);
      if (basketEdt == null) {
        break missingId;
      }

      id = R.id.basket_img;
      ImageView basketImg = ViewBindings.findChildViewById(rootView, id);
      if (basketImg == null) {
        break missingId;
      }

      id = R.id.basket_txt;
      TextView basketTxt = ViewBindings.findChildViewById(rootView, id);
      if (basketTxt == null) {
        break missingId;
      }

      id = R.id.defectqtn;
      TextView defectqtn = ViewBindings.findChildViewById(rootView, id);
      if (defectqtn == null) {
        break missingId;
      }

      id = R.id.defectqtn_txt;
      TextView defectqtnTxt = ViewBindings.findChildViewById(rootView, id);
      if (defectqtnTxt == null) {
        break missingId;
      }

      id = R.id.itemcardbarcode_img;
      ImageView itemcardbarcodeImg = ViewBindings.findChildViewById(rootView, id);
      if (itemcardbarcodeImg == null) {
        break missingId;
      }

      id = R.id.itemcode_edt;
      EditText itemcodeEdt = ViewBindings.findChildViewById(rootView, id);
      if (itemcodeEdt == null) {
        break missingId;
      }

      id = R.id.itemcode_txt;
      TextView itemcodeTxt = ViewBindings.findChildViewById(rootView, id);
      if (itemcodeTxt == null) {
        break missingId;
      }

      id = R.id.operation;
      TextView operation = ViewBindings.findChildViewById(rootView, id);
      if (operation == null) {
        break missingId;
      }

      id = R.id.operation_txt;
      TextView operationTxt = ViewBindings.findChildViewById(rootView, id);
      if (operationTxt == null) {
        break missingId;
      }

      id = R.id.parent_txt;
      TextView parentTxt = ViewBindings.findChildViewById(rootView, id);
      if (parentTxt == null) {
        break missingId;
      }

      id = R.id.parentcode;
      TextView parentcode = ViewBindings.findChildViewById(rootView, id);
      if (parentcode == null) {
        break missingId;
      }

      id = R.id.parentdesc;
      TextView parentdesc = ViewBindings.findChildViewById(rootView, id);
      if (parentdesc == null) {
        break missingId;
      }

      id = R.id.plus_icon;
      ImageView plusIcon = ViewBindings.findChildViewById(rootView, id);
      if (plusIcon == null) {
        break missingId;
      }

      id = R.id.sampleqtn_edt;
      EditText sampleqtnEdt = ViewBindings.findChildViewById(rootView, id);
      if (sampleqtnEdt == null) {
        break missingId;
      }

      id = R.id.sampleqtn_txt;
      TextView sampleqtnTxt = ViewBindings.findChildViewById(rootView, id);
      if (sampleqtnTxt == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = ViewBindings.findChildViewById(rootView, id);
      if (saveBtn == null) {
        break missingId;
      }

      return new FragmentAdddefectpaintBinding((ConstraintLayout) rootView, adddefectTxt, basketEdt,
          basketImg, basketTxt, defectqtn, defectqtnTxt, itemcardbarcodeImg, itemcodeEdt,
          itemcodeTxt, operation, operationTxt, parentTxt, parentcode, parentdesc, plusIcon,
          sampleqtnEdt, sampleqtnTxt, saveBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
