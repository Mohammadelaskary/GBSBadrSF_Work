// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.gbsbadrsf.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DefectnameandcodeLstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView child;

  @NonNull
  public final CheckBox defectnameCheckBox;

  @NonNull
  public final TextView defectqty;

  @NonNull
  public final TextView sampleqty;

  private DefectnameandcodeLstBinding(@NonNull ConstraintLayout rootView, @NonNull TextView child,
      @NonNull CheckBox defectnameCheckBox, @NonNull TextView defectqty,
      @NonNull TextView sampleqty) {
    this.rootView = rootView;
    this.child = child;
    this.defectnameCheckBox = defectnameCheckBox;
    this.defectqty = defectqty;
    this.sampleqty = sampleqty;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DefectnameandcodeLstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DefectnameandcodeLstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.defectnameandcode_lst, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DefectnameandcodeLstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.child;
      TextView child = rootView.findViewById(id);
      if (child == null) {
        break missingId;
      }

      id = R.id.defectname_checkBox;
      CheckBox defectnameCheckBox = rootView.findViewById(id);
      if (defectnameCheckBox == null) {
        break missingId;
      }

      id = R.id.defectqty;
      TextView defectqty = rootView.findViewById(id);
      if (defectqty == null) {
        break missingId;
      }

      id = R.id.sampleqty;
      TextView sampleqty = rootView.findViewById(id);
      if (sampleqty == null) {
        break missingId;
      }

      return new DefectnameandcodeLstBinding((ConstraintLayout) rootView, child, defectnameCheckBox,
          defectqty, sampleqty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
