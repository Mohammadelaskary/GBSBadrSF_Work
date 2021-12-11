// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class FragmentMainmachinesignoffBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton machineholdBtn;

  @NonNull
  public final MaterialButton machinesignoffBtn;

  private FragmentMainmachinesignoffBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton machineholdBtn, @NonNull MaterialButton machinesignoffBtn) {
    this.rootView = rootView;
    this.machineholdBtn = machineholdBtn;
    this.machinesignoffBtn = machinesignoffBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainmachinesignoffBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainmachinesignoffBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_mainmachinesignoff, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainmachinesignoffBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.machinehold_btn;
      MaterialButton machineholdBtn = ViewBindings.findChildViewById(rootView, id);
      if (machineholdBtn == null) {
        break missingId;
      }

      id = R.id.machinesignoff_btn;
      MaterialButton machinesignoffBtn = ViewBindings.findChildViewById(rootView, id);
      if (machinesignoffBtn == null) {
        break missingId;
      }

      return new FragmentMainmachinesignoffBinding((ConstraintLayout) rootView, machineholdBtn,
          machinesignoffBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
