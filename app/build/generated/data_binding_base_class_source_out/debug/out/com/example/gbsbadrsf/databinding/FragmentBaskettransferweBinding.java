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

public final class FragmentBaskettransferweBinding implements ViewBinding {
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
  public final TextView parentTxt;

  @NonNull
  public final TextView parentcode;

  @NonNull
  public final TextView parentdesc;

  @NonNull
  public final EditText quantityEdt;

  @NonNull
  public final ImageView quantityImg;

  @NonNull
  public final TextView quantityTxt;

  @NonNull
  public final MaterialButton saveBtn;

  private FragmentBaskettransferweBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView basketbarcodeImg, @NonNull EditText basketfromEdt,
      @NonNull TextView basketfromTxt, @NonNull EditText baskettoEdt,
      @NonNull ImageView baskettoImg, @NonNull TextView baskettoTxt,
      @NonNull TextView baskettransferTxt, @NonNull TextView parentTxt,
      @NonNull TextView parentcode, @NonNull TextView parentdesc, @NonNull EditText quantityEdt,
      @NonNull ImageView quantityImg, @NonNull TextView quantityTxt,
      @NonNull MaterialButton saveBtn) {
    this.rootView = rootView;
    this.basketbarcodeImg = basketbarcodeImg;
    this.basketfromEdt = basketfromEdt;
    this.basketfromTxt = basketfromTxt;
    this.baskettoEdt = baskettoEdt;
    this.baskettoImg = baskettoImg;
    this.baskettoTxt = baskettoTxt;
    this.baskettransferTxt = baskettransferTxt;
    this.parentTxt = parentTxt;
    this.parentcode = parentcode;
    this.parentdesc = parentdesc;
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
  public static FragmentBaskettransferweBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBaskettransferweBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_baskettransferwe, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBaskettransferweBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.basketbarcode_img;
      ImageView basketbarcodeImg = rootView.findViewById(id);
      if (basketbarcodeImg == null) {
        break missingId;
      }

      id = R.id.basketfrom_edt;
      EditText basketfromEdt = rootView.findViewById(id);
      if (basketfromEdt == null) {
        break missingId;
      }

      id = R.id.basketfrom_txt;
      TextView basketfromTxt = rootView.findViewById(id);
      if (basketfromTxt == null) {
        break missingId;
      }

      id = R.id.basketto_edt;
      EditText baskettoEdt = rootView.findViewById(id);
      if (baskettoEdt == null) {
        break missingId;
      }

      id = R.id.basketto_img;
      ImageView baskettoImg = rootView.findViewById(id);
      if (baskettoImg == null) {
        break missingId;
      }

      id = R.id.basketto_txt;
      TextView baskettoTxt = rootView.findViewById(id);
      if (baskettoTxt == null) {
        break missingId;
      }

      id = R.id.baskettransfer_txt;
      TextView baskettransferTxt = rootView.findViewById(id);
      if (baskettransferTxt == null) {
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

      id = R.id.quantity_edt;
      EditText quantityEdt = rootView.findViewById(id);
      if (quantityEdt == null) {
        break missingId;
      }

      id = R.id.quantity_img;
      ImageView quantityImg = rootView.findViewById(id);
      if (quantityImg == null) {
        break missingId;
      }

      id = R.id.quantity_txt;
      TextView quantityTxt = rootView.findViewById(id);
      if (quantityTxt == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = rootView.findViewById(id);
      if (saveBtn == null) {
        break missingId;
      }

      return new FragmentBaskettransferweBinding((ConstraintLayout) rootView, basketbarcodeImg,
          basketfromEdt, basketfromTxt, baskettoEdt, baskettoImg, baskettoTxt, baskettransferTxt,
          parentTxt, parentcode, parentdesc, quantityEdt, quantityImg, quantityTxt, saveBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
