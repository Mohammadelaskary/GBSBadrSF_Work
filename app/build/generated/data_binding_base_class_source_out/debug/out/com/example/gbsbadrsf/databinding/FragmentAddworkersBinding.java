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
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddworkersBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView addworkerTxt;

  @NonNull
  public final CheckBox elro5saTxt;

  @NonNull
  public final CheckBox exportidCheckBox;

  @NonNull
  public final CheckBox markazelba7oth;

  @NonNull
  public final MaterialButton savecustexaBtn;

  @NonNull
  public final CheckBox shadatelmanshaTxt;

  @NonNull
  public final TextView workernameTxt;

  private FragmentAddworkersBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView addworkerTxt, @NonNull CheckBox elro5saTxt,
      @NonNull CheckBox exportidCheckBox, @NonNull CheckBox markazelba7oth,
      @NonNull MaterialButton savecustexaBtn, @NonNull CheckBox shadatelmanshaTxt,
      @NonNull TextView workernameTxt) {
    this.rootView = rootView;
    this.addworkerTxt = addworkerTxt;
    this.elro5saTxt = elro5saTxt;
    this.exportidCheckBox = exportidCheckBox;
    this.markazelba7oth = markazelba7oth;
    this.savecustexaBtn = savecustexaBtn;
    this.shadatelmanshaTxt = shadatelmanshaTxt;
    this.workernameTxt = workernameTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddworkersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddworkersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_addworkers, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddworkersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addworker_txt;
      TextView addworkerTxt = rootView.findViewById(id);
      if (addworkerTxt == null) {
        break missingId;
      }

      id = R.id.elro5sa_txt;
      CheckBox elro5saTxt = rootView.findViewById(id);
      if (elro5saTxt == null) {
        break missingId;
      }

      id = R.id.exportid_checkBox;
      CheckBox exportidCheckBox = rootView.findViewById(id);
      if (exportidCheckBox == null) {
        break missingId;
      }

      id = R.id.markazelba7oth;
      CheckBox markazelba7oth = rootView.findViewById(id);
      if (markazelba7oth == null) {
        break missingId;
      }

      id = R.id.savecustexa_btn;
      MaterialButton savecustexaBtn = rootView.findViewById(id);
      if (savecustexaBtn == null) {
        break missingId;
      }

      id = R.id.shadatelmansha_txt;
      CheckBox shadatelmanshaTxt = rootView.findViewById(id);
      if (shadatelmanshaTxt == null) {
        break missingId;
      }

      id = R.id.workername_txt;
      TextView workernameTxt = rootView.findViewById(id);
      if (workernameTxt == null) {
        break missingId;
      }

      return new FragmentAddworkersBinding((ConstraintLayout) rootView, addworkerTxt, elro5saTxt,
          exportidCheckBox, markazelba7oth, savecustexaBtn, shadatelmanshaTxt, workernameTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
