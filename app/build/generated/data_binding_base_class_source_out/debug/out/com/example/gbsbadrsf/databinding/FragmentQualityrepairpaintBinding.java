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

public final class FragmentQualityrepairpaintBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText approvedqtyEdt;

  @NonNull
  public final TextView approvedqtyTxt;

  @NonNull
  public final TextView approvedqtyintableTxt;

  @NonNull
  public final ImageView basketbarcodeImg;

  @NonNull
  public final EditText basketcodeEdt;

  @NonNull
  public final TextView basketcodeTxt;

  @NonNull
  public final TextView childintableTxt;

  @NonNull
  public final ConstraintLayout constraint;

  @NonNull
  public final MaterialButton createscrapBtn;

  @NonNull
  public final TextView defectnameTxt;

  @NonNull
  public final TextView defectqtn;

  @NonNull
  public final RecyclerView defectqtnRv;

  @NonNull
  public final TextView defectqtyTxt;

  @NonNull
  public final TextView defectquantityTxt;

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
  public final TextView qcrepairTxt;

  @NonNull
  public final MaterialButton qtnokBtn;

  @NonNull
  public final MaterialButton reopendefectBtn;

  @NonNull
  public final TextView repairedqtyTxt;

  @NonNull
  public final View view;

  private FragmentQualityrepairpaintBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText approvedqtyEdt, @NonNull TextView approvedqtyTxt,
      @NonNull TextView approvedqtyintableTxt, @NonNull ImageView basketbarcodeImg,
      @NonNull EditText basketcodeEdt, @NonNull TextView basketcodeTxt,
      @NonNull TextView childintableTxt, @NonNull ConstraintLayout constraint,
      @NonNull MaterialButton createscrapBtn, @NonNull TextView defectnameTxt,
      @NonNull TextView defectqtn, @NonNull RecyclerView defectqtnRv,
      @NonNull TextView defectqtyTxt, @NonNull TextView defectquantityTxt,
      @NonNull HorizontalScrollView hsv, @NonNull TextView notesTxt, @NonNull TextView operation,
      @NonNull TextView operationTxt, @NonNull TextView parentTxt, @NonNull TextView parentcode,
      @NonNull TextView parentdesc, @NonNull TextView qcrepairTxt, @NonNull MaterialButton qtnokBtn,
      @NonNull MaterialButton reopendefectBtn, @NonNull TextView repairedqtyTxt,
      @NonNull View view) {
    this.rootView = rootView;
    this.approvedqtyEdt = approvedqtyEdt;
    this.approvedqtyTxt = approvedqtyTxt;
    this.approvedqtyintableTxt = approvedqtyintableTxt;
    this.basketbarcodeImg = basketbarcodeImg;
    this.basketcodeEdt = basketcodeEdt;
    this.basketcodeTxt = basketcodeTxt;
    this.childintableTxt = childintableTxt;
    this.constraint = constraint;
    this.createscrapBtn = createscrapBtn;
    this.defectnameTxt = defectnameTxt;
    this.defectqtn = defectqtn;
    this.defectqtnRv = defectqtnRv;
    this.defectqtyTxt = defectqtyTxt;
    this.defectquantityTxt = defectquantityTxt;
    this.hsv = hsv;
    this.notesTxt = notesTxt;
    this.operation = operation;
    this.operationTxt = operationTxt;
    this.parentTxt = parentTxt;
    this.parentcode = parentcode;
    this.parentdesc = parentdesc;
    this.qcrepairTxt = qcrepairTxt;
    this.qtnokBtn = qtnokBtn;
    this.reopendefectBtn = reopendefectBtn;
    this.repairedqtyTxt = repairedqtyTxt;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQualityrepairpaintBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQualityrepairpaintBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_qualityrepairpaint, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQualityrepairpaintBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.approvedqty_edt;
      EditText approvedqtyEdt = rootView.findViewById(id);
      if (approvedqtyEdt == null) {
        break missingId;
      }

      id = R.id.approvedqty_txt;
      TextView approvedqtyTxt = rootView.findViewById(id);
      if (approvedqtyTxt == null) {
        break missingId;
      }

      id = R.id.approvedqtyintable_txt;
      TextView approvedqtyintableTxt = rootView.findViewById(id);
      if (approvedqtyintableTxt == null) {
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

      id = R.id.basketcode_txt;
      TextView basketcodeTxt = rootView.findViewById(id);
      if (basketcodeTxt == null) {
        break missingId;
      }

      id = R.id.childintable_txt;
      TextView childintableTxt = rootView.findViewById(id);
      if (childintableTxt == null) {
        break missingId;
      }

      id = R.id.constraint;
      ConstraintLayout constraint = rootView.findViewById(id);
      if (constraint == null) {
        break missingId;
      }

      id = R.id.createscrap_btn;
      MaterialButton createscrapBtn = rootView.findViewById(id);
      if (createscrapBtn == null) {
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

      id = R.id.defectqtn_rv;
      RecyclerView defectqtnRv = rootView.findViewById(id);
      if (defectqtnRv == null) {
        break missingId;
      }

      id = R.id.defectqty_txt;
      TextView defectqtyTxt = rootView.findViewById(id);
      if (defectqtyTxt == null) {
        break missingId;
      }

      id = R.id.defectquantity_txt;
      TextView defectquantityTxt = rootView.findViewById(id);
      if (defectquantityTxt == null) {
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

      id = R.id.qcrepair_txt;
      TextView qcrepairTxt = rootView.findViewById(id);
      if (qcrepairTxt == null) {
        break missingId;
      }

      id = R.id.qtnok_btn;
      MaterialButton qtnokBtn = rootView.findViewById(id);
      if (qtnokBtn == null) {
        break missingId;
      }

      id = R.id.reopendefect_btn;
      MaterialButton reopendefectBtn = rootView.findViewById(id);
      if (reopendefectBtn == null) {
        break missingId;
      }

      id = R.id.repairedqty_txt;
      TextView repairedqtyTxt = rootView.findViewById(id);
      if (repairedqtyTxt == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      return new FragmentQualityrepairpaintBinding((ConstraintLayout) rootView, approvedqtyEdt,
          approvedqtyTxt, approvedqtyintableTxt, basketbarcodeImg, basketcodeEdt, basketcodeTxt,
          childintableTxt, constraint, createscrapBtn, defectnameTxt, defectqtn, defectqtnRv,
          defectqtyTxt, defectquantityTxt, hsv, notesTxt, operation, operationTxt, parentTxt,
          parentcode, parentdesc, qcrepairTxt, qtnokBtn, reopendefectBtn, repairedqtyTxt, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
