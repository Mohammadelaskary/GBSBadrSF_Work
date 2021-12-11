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

public final class FragmentBaskettransferBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView basketbarcodeImg;

  @NonNull
  public final EditText basketfromEdt;

  @NonNull
  public final TextView basketfromTxt;

  @NonNull
  public final EditText baskettoEdt;

  @NonNull
  public final ImageView baskettoImg;

  @NonNull
  public final TextView baskettoTxt;

  @NonNull
  public final TextView baskettransferTxt;

  @NonNull
  public final TextView childTxt;

  @NonNull
  public final TextView childcode;

  @NonNull
  public final TextView childesc;

  @NonNull
  public final EditText quantityEdt;

  @NonNull
  public final ImageView quantityImg;

  @NonNull
  public final TextView quantityTxt;

  @NonNull
  public final MaterialButton saveBtn;

  private FragmentBaskettransferBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView basketbarcodeImg, @NonNull EditText basketfromEdt,
      @NonNull TextView basketfromTxt, @NonNull EditText baskettoEdt,
      @NonNull ImageView baskettoImg, @NonNull TextView baskettoTxt,
      @NonNull TextView baskettransferTxt, @NonNull TextView childTxt, @NonNull TextView childcode,
      @NonNull TextView childesc, @NonNull EditText quantityEdt, @NonNull ImageView quantityImg,
      @NonNull TextView quantityTxt, @NonNull MaterialButton saveBtn) {
    this.rootView = rootView;
    this.basketbarcodeImg = basketbarcodeImg;
    this.basketfromEdt = basketfromEdt;
    this.basketfromTxt = basketfromTxt;
    this.baskettoEdt = baskettoEdt;
    this.baskettoImg = baskettoImg;
    this.baskettoTxt = baskettoTxt;
    this.baskettransferTxt = baskettransferTxt;
    this.childTxt = childTxt;
    this.childcode = childcode;
    this.childesc = childesc;
    this.quantityEdt = quantityEdt;
    this.quantityImg = quantityImg;
    this.quantityTxt = quantityTxt;
    this.saveBtn = saveBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBaskettransferBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBaskettransferBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_baskettransfer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBaskettransferBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.basketbarcode_img;
      ImageView basketbarcodeImg = ViewBindings.findChildViewById(rootView, id);
      if (basketbarcodeImg == null) {
        break missingId;
      }

      id = R.id.basketfrom_edt;
      EditText basketfromEdt = ViewBindings.findChildViewById(rootView, id);
      if (basketfromEdt == null) {
        break missingId;
      }

      id = R.id.basketfrom_txt;
      TextView basketfromTxt = ViewBindings.findChildViewById(rootView, id);
      if (basketfromTxt == null) {
        break missingId;
      }

      id = R.id.basketto_edt;
      EditText baskettoEdt = ViewBindings.findChildViewById(rootView, id);
      if (baskettoEdt == null) {
        break missingId;
      }

      id = R.id.basketto_img;
      ImageView baskettoImg = ViewBindings.findChildViewById(rootView, id);
      if (baskettoImg == null) {
        break missingId;
      }

      id = R.id.basketto_txt;
      TextView baskettoTxt = ViewBindings.findChildViewById(rootView, id);
      if (baskettoTxt == null) {
        break missingId;
      }

      id = R.id.baskettransfer_txt;
      TextView baskettransferTxt = ViewBindings.findChildViewById(rootView, id);
      if (baskettransferTxt == null) {
        break missingId;
      }

      id = R.id.child_txt;
      TextView childTxt = ViewBindings.findChildViewById(rootView, id);
      if (childTxt == null) {
        break missingId;
      }

      id = R.id.childcode;
      TextView childcode = ViewBindings.findChildViewById(rootView, id);
      if (childcode == null) {
        break missingId;
      }

      id = R.id.childesc;
      TextView childesc = ViewBindings.findChildViewById(rootView, id);
      if (childesc == null) {
        break missingId;
      }

      id = R.id.quantity_edt;
      EditText quantityEdt = ViewBindings.findChildViewById(rootView, id);
      if (quantityEdt == null) {
        break missingId;
      }

      id = R.id.quantity_img;
      ImageView quantityImg = ViewBindings.findChildViewById(rootView, id);
      if (quantityImg == null) {
        break missingId;
      }

      id = R.id.quantity_txt;
      TextView quantityTxt = ViewBindings.findChildViewById(rootView, id);
      if (quantityTxt == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = ViewBindings.findChildViewById(rootView, id);
      if (saveBtn == null) {
        break missingId;
      }

      return new FragmentBaskettransferBinding((ConstraintLayout) rootView, basketbarcodeImg,
          basketfromEdt, basketfromTxt, baskettoEdt, baskettoImg, baskettoTxt, baskettransferTxt,
          childTxt, childcode, childesc, quantityEdt, quantityImg, quantityTxt, saveBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
