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

public final class FragmentMainmachineloadingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton continueloading;

  @NonNull
  public final MaterialButton firstloadingBtn;

  private FragmentMainmachineloadingBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton continueloading, @NonNull MaterialButton firstloadingBtn) {
    this.rootView = rootView;
    this.continueloading = continueloading;
    this.firstloadingBtn = firstloadingBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainmachineloadingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainmachineloadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_mainmachineloading, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainmachineloadingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.continueloading;
      MaterialButton continueloading = ViewBindings.findChildViewById(rootView, id);
      if (continueloading == null) {
        break missingId;
      }

      id = R.id.firstloading_btn;
      MaterialButton firstloadingBtn = ViewBindings.findChildViewById(rootView, id);
      if (firstloadingBtn == null) {
        break missingId;
      }

      return new FragmentMainmachineloadingBinding((ConstraintLayout) rootView, continueloading,
          firstloadingBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}