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
import androidx.viewbinding.ViewBindings;
import com.example.gbsbadrsf.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentColorverificationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView basketbarcodeImg;

  @NonNull
  public final EditText basketcodeEdt;

  @NonNull
  public final TextView basketcodeTxt;

  @NonNull
  public final AppCompatSpinner colorSpin;

  @NonNull
  public final TextView colorTxt;

  @NonNull
  public final TextView colorverTxt;

  @NonNull
  public final TextView jobordername;

  @NonNull
  public final TextView jobordernameTxt;

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
  public final MaterialButton saveBtn;

  private FragmentColorverificationBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView basketbarcodeImg, @NonNull EditText basketcodeEdt,
      @NonNull TextView basketcodeTxt, @NonNull AppCompatSpinner colorSpin,
      @NonNull TextView colorTxt, @NonNull TextView colorverTxt, @NonNull TextView jobordername,
      @NonNull TextView jobordernameTxt, @NonNull TextView operation,
      @NonNull TextView operationTxt, @NonNull TextView parentTxt, @NonNull TextView parentcode,
      @NonNull TextView parentdesc, @NonNull MaterialButton saveBtn) {
    this.rootView = rootView;
    this.basketbarcodeImg = basketbarcodeImg;
    this.basketcodeEdt = basketcodeEdt;
    this.basketcodeTxt = basketcodeTxt;
    this.colorSpin = colorSpin;
    this.colorTxt = colorTxt;
    this.colorverTxt = colorverTxt;
    this.jobordername = jobordername;
    this.jobordernameTxt = jobordernameTxt;
    this.operation = operation;
    this.operationTxt = operationTxt;
    this.parentTxt = parentTxt;
    this.parentcode = parentcode;
    this.parentdesc = parentdesc;
    this.saveBtn = saveBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentColorverificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentColorverificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_colorverification, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentColorverificationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.basketbarcode_img;
      ImageView basketbarcodeImg = ViewBindings.findChildViewById(rootView, id);
      if (basketbarcodeImg == null) {
        break missingId;
      }

      id = R.id.basketcode_edt;
      EditText basketcodeEdt = ViewBindings.findChildViewById(rootView, id);
      if (basketcodeEdt == null) {
        break missingId;
      }

      id = R.id.basketcode_txt;
      TextView basketcodeTxt = ViewBindings.findChildViewById(rootView, id);
      if (basketcodeTxt == null) {
        break missingId;
      }

      id = R.id.color_spin;
      AppCompatSpinner colorSpin = ViewBindings.findChildViewById(rootView, id);
      if (colorSpin == null) {
        break missingId;
      }

      id = R.id.color_txt;
      TextView colorTxt = ViewBindings.findChildViewById(rootView, id);
      if (colorTxt == null) {
        break missingId;
      }

      id = R.id.colorver_txt;
      TextView colorverTxt = ViewBindings.findChildViewById(rootView, id);
      if (colorverTxt == null) {
        break missingId;
      }

      id = R.id.jobordername;
      TextView jobordername = ViewBindings.findChildViewById(rootView, id);
      if (jobordername == null) {
        break missingId;
      }

      id = R.id.jobordername_txt;
      TextView jobordernameTxt = ViewBindings.findChildViewById(rootView, id);
      if (jobordernameTxt == null) {
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

      id = R.id.save_btn;
      MaterialButton saveBtn = ViewBindings.findChildViewById(rootView, id);
      if (saveBtn == null) {
        break missingId;
      }

      return new FragmentColorverificationBinding((ConstraintLayout) rootView, basketbarcodeImg,
          basketcodeEdt, basketcodeTxt, colorSpin, colorTxt, colorverTxt, jobordername,
          jobordernameTxt, operation, operationTxt, parentTxt, parentcode, parentdesc, saveBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
