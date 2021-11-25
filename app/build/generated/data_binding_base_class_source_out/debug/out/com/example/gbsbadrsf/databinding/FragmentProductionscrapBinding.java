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
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.gbsbadrsf.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductionscrapBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText basketEdt;

  @NonNull
  public final TextView basketTxt;

  @NonNull
  public final ImageView basketbarcode;

  @NonNull
  public final ImageView basketbarcodeImg;

  @NonNull
  public final EditText basketcodeEdt;

  @NonNull
  public final TextView basketcodescanTxt;

  @NonNull
  public final TextView basketqtn;

  @NonNull
  public final TextView basketqtnTxt;

  @NonNull
  public final TextView childcode;

  @NonNull
  public final TextView childdesc;

  @NonNull
  public final MaterialButton existingdefBtn;

  @NonNull
  public final TextView jobordername;

  @NonNull
  public final TextView jobordernameTxt;

  @NonNull
  public final MaterialButton newdefBtn;

  @NonNull
  public final TextView parentTxt;

  @NonNull
  public final TextView productionscrapTxt;

  @NonNull
  public final TextView responsibleTxt;

  @NonNull
  public final AppCompatSpinner responsibledepSpin;

  @NonNull
  public final MaterialButton saveBtn;

  @NonNull
  public final EditText scrapqtnEdt;

  @NonNull
  public final TextView scrapqtnTxt;

  private FragmentProductionscrapBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText basketEdt, @NonNull TextView basketTxt, @NonNull ImageView basketbarcode,
      @NonNull ImageView basketbarcodeImg, @NonNull EditText basketcodeEdt,
      @NonNull TextView basketcodescanTxt, @NonNull TextView basketqtn,
      @NonNull TextView basketqtnTxt, @NonNull TextView childcode, @NonNull TextView childdesc,
      @NonNull MaterialButton existingdefBtn, @NonNull TextView jobordername,
      @NonNull TextView jobordernameTxt, @NonNull MaterialButton newdefBtn,
      @NonNull TextView parentTxt, @NonNull TextView productionscrapTxt,
      @NonNull TextView responsibleTxt, @NonNull AppCompatSpinner responsibledepSpin,
      @NonNull MaterialButton saveBtn, @NonNull EditText scrapqtnEdt,
      @NonNull TextView scrapqtnTxt) {
    this.rootView = rootView;
    this.basketEdt = basketEdt;
    this.basketTxt = basketTxt;
    this.basketbarcode = basketbarcode;
    this.basketbarcodeImg = basketbarcodeImg;
    this.basketcodeEdt = basketcodeEdt;
    this.basketcodescanTxt = basketcodescanTxt;
    this.basketqtn = basketqtn;
    this.basketqtnTxt = basketqtnTxt;
    this.childcode = childcode;
    this.childdesc = childdesc;
    this.existingdefBtn = existingdefBtn;
    this.jobordername = jobordername;
    this.jobordernameTxt = jobordernameTxt;
    this.newdefBtn = newdefBtn;
    this.parentTxt = parentTxt;
    this.productionscrapTxt = productionscrapTxt;
    this.responsibleTxt = responsibleTxt;
    this.responsibledepSpin = responsibledepSpin;
    this.saveBtn = saveBtn;
    this.scrapqtnEdt = scrapqtnEdt;
    this.scrapqtnTxt = scrapqtnTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductionscrapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductionscrapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_productionscrap, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductionscrapBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.basket_edt;
      EditText basketEdt = rootView.findViewById(id);
      if (basketEdt == null) {
        break missingId;
      }

      id = R.id.basket_txt;
      TextView basketTxt = rootView.findViewById(id);
      if (basketTxt == null) {
        break missingId;
      }

      id = R.id.basketbarcode;
      ImageView basketbarcode = rootView.findViewById(id);
      if (basketbarcode == null) {
        break missingId;
      }

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

      id = R.id.basketcodescan_txt;
      TextView basketcodescanTxt = rootView.findViewById(id);
      if (basketcodescanTxt == null) {
        break missingId;
      }

      id = R.id.basketqtn;
      TextView basketqtn = rootView.findViewById(id);
      if (basketqtn == null) {
        break missingId;
      }

      id = R.id.basketqtn_txt;
      TextView basketqtnTxt = rootView.findViewById(id);
      if (basketqtnTxt == null) {
        break missingId;
      }

      id = R.id.childcode;
      TextView childcode = rootView.findViewById(id);
      if (childcode == null) {
        break missingId;
      }

      id = R.id.childdesc;
      TextView childdesc = rootView.findViewById(id);
      if (childdesc == null) {
        break missingId;
      }

      id = R.id.existingdef_btn;
      MaterialButton existingdefBtn = rootView.findViewById(id);
      if (existingdefBtn == null) {
        break missingId;
      }

      id = R.id.jobordername;
      TextView jobordername = rootView.findViewById(id);
      if (jobordername == null) {
        break missingId;
      }

      id = R.id.jobordername_txt;
      TextView jobordernameTxt = rootView.findViewById(id);
      if (jobordernameTxt == null) {
        break missingId;
      }

      id = R.id.newdef_btn;
      MaterialButton newdefBtn = rootView.findViewById(id);
      if (newdefBtn == null) {
        break missingId;
      }

      id = R.id.parent_txt;
      TextView parentTxt = rootView.findViewById(id);
      if (parentTxt == null) {
        break missingId;
      }

      id = R.id.productionscrap_txt;
      TextView productionscrapTxt = rootView.findViewById(id);
      if (productionscrapTxt == null) {
        break missingId;
      }

      id = R.id.responsible_txt;
      TextView responsibleTxt = rootView.findViewById(id);
      if (responsibleTxt == null) {
        break missingId;
      }

      id = R.id.responsibledep_spin;
      AppCompatSpinner responsibledepSpin = rootView.findViewById(id);
      if (responsibledepSpin == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = rootView.findViewById(id);
      if (saveBtn == null) {
        break missingId;
      }

      id = R.id.scrapqtn_edt;
      EditText scrapqtnEdt = rootView.findViewById(id);
      if (scrapqtnEdt == null) {
        break missingId;
      }

      id = R.id.scrapqtn_txt;
      TextView scrapqtnTxt = rootView.findViewById(id);
      if (scrapqtnTxt == null) {
        break missingId;
      }

      return new FragmentProductionscrapBinding((ConstraintLayout) rootView, basketEdt, basketTxt,
          basketbarcode, basketbarcodeImg, basketcodeEdt, basketcodescanTxt, basketqtn,
          basketqtnTxt, childcode, childdesc, existingdefBtn, jobordername, jobordernameTxt,
          newdefBtn, parentTxt, productionscrapTxt, responsibleTxt, responsibledepSpin, saveBtn,
          scrapqtnEdt, scrapqtnTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
