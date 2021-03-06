// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.gbsbadrsf.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentQualityRepairBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView basketBarcodeImg;

  @NonNull
  public final EditText basketCodeEdt;

  @NonNull
  public final TextView basketCodeTxt;

  @NonNull
  public final TextView childCode;

  @NonNull
  public final TextView childDesc;

  @NonNull
  public final TextView defectQtn;

  @NonNull
  public final TextView defectQtnTxt;

  @NonNull
  public final TextView defectedQty;

  @NonNull
  public final RecyclerView defectsDetailsList;

  @NonNull
  public final TextView defectsList;

  @NonNull
  public final TextView defectsQty;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView operation;

  @NonNull
  public final TextView operationTxt;

  @NonNull
  public final TextView parentTxt;

  @NonNull
  public final TextView qualityRepairTxt;

  private FragmentQualityRepairBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView basketBarcodeImg, @NonNull EditText basketCodeEdt,
      @NonNull TextView basketCodeTxt, @NonNull TextView childCode, @NonNull TextView childDesc,
      @NonNull TextView defectQtn, @NonNull TextView defectQtnTxt, @NonNull TextView defectedQty,
      @NonNull RecyclerView defectsDetailsList, @NonNull TextView defectsList,
      @NonNull TextView defectsQty, @NonNull LinearLayout linearLayout, @NonNull TextView operation,
      @NonNull TextView operationTxt, @NonNull TextView parentTxt,
      @NonNull TextView qualityRepairTxt) {
    this.rootView = rootView;
    this.basketBarcodeImg = basketBarcodeImg;
    this.basketCodeEdt = basketCodeEdt;
    this.basketCodeTxt = basketCodeTxt;
    this.childCode = childCode;
    this.childDesc = childDesc;
    this.defectQtn = defectQtn;
    this.defectQtnTxt = defectQtnTxt;
    this.defectedQty = defectedQty;
    this.defectsDetailsList = defectsDetailsList;
    this.defectsList = defectsList;
    this.defectsQty = defectsQty;
    this.linearLayout = linearLayout;
    this.operation = operation;
    this.operationTxt = operationTxt;
    this.parentTxt = parentTxt;
    this.qualityRepairTxt = qualityRepairTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQualityRepairBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQualityRepairBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_quality_repair, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQualityRepairBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.basket_barcode_img;
      ImageView basketBarcodeImg = rootView.findViewById(id);
      if (basketBarcodeImg == null) {
        break missingId;
      }

      id = R.id.basket_code_edt;
      EditText basketCodeEdt = rootView.findViewById(id);
      if (basketCodeEdt == null) {
        break missingId;
      }

      id = R.id.basket_code_txt;
      TextView basketCodeTxt = rootView.findViewById(id);
      if (basketCodeTxt == null) {
        break missingId;
      }

      id = R.id.child_code;
      TextView childCode = rootView.findViewById(id);
      if (childCode == null) {
        break missingId;
      }

      id = R.id.child_desc;
      TextView childDesc = rootView.findViewById(id);
      if (childDesc == null) {
        break missingId;
      }

      id = R.id.defect_qtn;
      TextView defectQtn = rootView.findViewById(id);
      if (defectQtn == null) {
        break missingId;
      }

      id = R.id.defect_qtn_txt;
      TextView defectQtnTxt = rootView.findViewById(id);
      if (defectQtnTxt == null) {
        break missingId;
      }

      id = R.id.defected_qty;
      TextView defectedQty = rootView.findViewById(id);
      if (defectedQty == null) {
        break missingId;
      }

      id = R.id.defects_details_list;
      RecyclerView defectsDetailsList = rootView.findViewById(id);
      if (defectsDetailsList == null) {
        break missingId;
      }

      id = R.id.defects_list;
      TextView defectsList = rootView.findViewById(id);
      if (defectsList == null) {
        break missingId;
      }

      id = R.id.defects_qty;
      TextView defectsQty = rootView.findViewById(id);
      if (defectsQty == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = rootView.findViewById(id);
      if (linearLayout == null) {
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

      id = R.id.quality_repair_txt;
      TextView qualityRepairTxt = rootView.findViewById(id);
      if (qualityRepairTxt == null) {
        break missingId;
      }

      return new FragmentQualityRepairBinding((ConstraintLayout) rootView, basketBarcodeImg,
          basketCodeEdt, basketCodeTxt, childCode, childDesc, defectQtn, defectQtnTxt, defectedQty,
          defectsDetailsList, defectsList, defectsQty, linearLayout, operation, operationTxt,
          parentTxt, qualityRepairTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
