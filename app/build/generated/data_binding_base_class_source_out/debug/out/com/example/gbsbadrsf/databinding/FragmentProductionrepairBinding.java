// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.gbsbadrsf.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductionRepairBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton addRepair;

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
  public final RecyclerView defectsDetailsList;

  @NonNull
  public final TextView defectsList;

  @NonNull
  public final TextView operation;

  @NonNull
  public final TextView operationTxt;

  @NonNull
  public final TextView parentTxt;

  @NonNull
  public final TextView productionRepairTxt;

  private FragmentProductionRepairBinding(@NonNull ScrollView rootView,
      @NonNull MaterialButton addRepair, @NonNull ImageView basketBarcodeImg,
      @NonNull EditText basketCodeEdt, @NonNull TextView basketCodeTxt, @NonNull TextView childCode,
      @NonNull TextView childDesc, @NonNull TextView defectQtn, @NonNull TextView defectQtnTxt,
      @NonNull RecyclerView defectsDetailsList, @NonNull TextView defectsList,
      @NonNull TextView operation, @NonNull TextView operationTxt, @NonNull TextView parentTxt,
      @NonNull TextView productionRepairTxt) {
    this.rootView = rootView;
    this.addRepair = addRepair;
    this.basketBarcodeImg = basketBarcodeImg;
    this.basketCodeEdt = basketCodeEdt;
    this.basketCodeTxt = basketCodeTxt;
    this.childCode = childCode;
    this.childDesc = childDesc;
    this.defectQtn = defectQtn;
    this.defectQtnTxt = defectQtnTxt;
    this.defectsDetailsList = defectsDetailsList;
    this.defectsList = defectsList;
    this.operation = operation;
    this.operationTxt = operationTxt;
    this.parentTxt = parentTxt;
    this.productionRepairTxt = productionRepairTxt;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductionRepairBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductionRepairBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_production_repair, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductionRepairBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_repair;
      MaterialButton addRepair = rootView.findViewById(id);
      if (addRepair == null) {
        break missingId;
      }

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

      id = R.id.production_repair_txt;
      TextView productionRepairTxt = rootView.findViewById(id);
      if (productionRepairTxt == null) {
        break missingId;
      }

      return new FragmentProductionRepairBinding((ScrollView) rootView, addRepair, basketBarcodeImg,
          basketCodeEdt, basketCodeTxt, childCode, childDesc, defectQtn, defectQtnTxt,
          defectsDetailsList, defectsList, operation, operationTxt, parentTxt, productionRepairTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}