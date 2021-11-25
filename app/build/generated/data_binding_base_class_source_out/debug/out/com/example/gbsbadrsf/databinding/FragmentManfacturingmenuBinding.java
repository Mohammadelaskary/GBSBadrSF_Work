// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class FragmentManfacturingmenuBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton baskettransferBtn;

  @NonNull
  public final MaterialButton machineloadingBtn;

  @NonNull
  public final MaterialButton machinesignoffBtn;

  @NonNull
  public final MaterialButton machinewipBtn;

  @NonNull
  public final TextView manfacturingTxt;

  @NonNull
  public final MaterialButton plansequenceholdBtn;

  @NonNull
  public final MaterialButton productionrepairBtn;

  @NonNull
  public final MaterialButton qualityscraprequest;

  @NonNull
  public final MaterialButton scraprmanagmentBtn;

  private FragmentManfacturingmenuBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton baskettransferBtn, @NonNull MaterialButton machineloadingBtn,
      @NonNull MaterialButton machinesignoffBtn, @NonNull MaterialButton machinewipBtn,
      @NonNull TextView manfacturingTxt, @NonNull MaterialButton plansequenceholdBtn,
      @NonNull MaterialButton productionrepairBtn, @NonNull MaterialButton qualityscraprequest,
      @NonNull MaterialButton scraprmanagmentBtn) {
    this.rootView = rootView;
    this.baskettransferBtn = baskettransferBtn;
    this.machineloadingBtn = machineloadingBtn;
    this.machinesignoffBtn = machinesignoffBtn;
    this.machinewipBtn = machinewipBtn;
    this.manfacturingTxt = manfacturingTxt;
    this.plansequenceholdBtn = plansequenceholdBtn;
    this.productionrepairBtn = productionrepairBtn;
    this.qualityscraprequest = qualityscraprequest;
    this.scraprmanagmentBtn = scraprmanagmentBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentManfacturingmenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentManfacturingmenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_manfacturingmenu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentManfacturingmenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.baskettransfer_btn;
      MaterialButton baskettransferBtn = rootView.findViewById(id);
      if (baskettransferBtn == null) {
        break missingId;
      }

      id = R.id.machineloading_btn;
      MaterialButton machineloadingBtn = rootView.findViewById(id);
      if (machineloadingBtn == null) {
        break missingId;
      }

      id = R.id.machinesignoff_btn;
      MaterialButton machinesignoffBtn = rootView.findViewById(id);
      if (machinesignoffBtn == null) {
        break missingId;
      }

      id = R.id.machinewip_btn;
      MaterialButton machinewipBtn = rootView.findViewById(id);
      if (machinewipBtn == null) {
        break missingId;
      }

      id = R.id.manfacturing_txt;
      TextView manfacturingTxt = rootView.findViewById(id);
      if (manfacturingTxt == null) {
        break missingId;
      }

      id = R.id.plansequencehold_btn;
      MaterialButton plansequenceholdBtn = rootView.findViewById(id);
      if (plansequenceholdBtn == null) {
        break missingId;
      }

      id = R.id.productionrepair_btn;
      MaterialButton productionrepairBtn = rootView.findViewById(id);
      if (productionrepairBtn == null) {
        break missingId;
      }

      id = R.id.qualityscraprequest;
      MaterialButton qualityscraprequest = rootView.findViewById(id);
      if (qualityscraprequest == null) {
        break missingId;
      }

      id = R.id.scraprmanagment_btn;
      MaterialButton scraprmanagmentBtn = rootView.findViewById(id);
      if (scraprmanagmentBtn == null) {
        break missingId;
      }

      return new FragmentManfacturingmenuBinding((ConstraintLayout) rootView, baskettransferBtn,
          machineloadingBtn, machinesignoffBtn, machinewipBtn, manfacturingTxt, plansequenceholdBtn,
          productionrepairBtn, qualityscraprequest, scraprmanagmentBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
