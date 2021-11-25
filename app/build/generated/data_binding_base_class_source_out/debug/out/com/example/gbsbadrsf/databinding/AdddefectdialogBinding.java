// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class AdddefectdialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView childTxt;

  @NonNull
  public final TextView childcode;

  @NonNull
  public final TextView childdesc;

  @NonNull
  public final MaterialButton closeBtn;

  @NonNull
  public final AppCompatSpinner defectSpin;

  @NonNull
  public final TextView defectTxt;

  @NonNull
  public final EditText notesEdt;

  @NonNull
  public final TextView notesTxt;

  @NonNull
  public final EditText qtnEdt;

  @NonNull
  public final TextView qtnTxt;

  @NonNull
  public final MaterialButton saveBtn;

  private AdddefectdialogBinding(@NonNull ConstraintLayout rootView, @NonNull TextView childTxt,
      @NonNull TextView childcode, @NonNull TextView childdesc, @NonNull MaterialButton closeBtn,
      @NonNull AppCompatSpinner defectSpin, @NonNull TextView defectTxt, @NonNull EditText notesEdt,
      @NonNull TextView notesTxt, @NonNull EditText qtnEdt, @NonNull TextView qtnTxt,
      @NonNull MaterialButton saveBtn) {
    this.rootView = rootView;
    this.childTxt = childTxt;
    this.childcode = childcode;
    this.childdesc = childdesc;
    this.closeBtn = closeBtn;
    this.defectSpin = defectSpin;
    this.defectTxt = defectTxt;
    this.notesEdt = notesEdt;
    this.notesTxt = notesTxt;
    this.qtnEdt = qtnEdt;
    this.qtnTxt = qtnTxt;
    this.saveBtn = saveBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AdddefectdialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdddefectdialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.adddefectdialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdddefectdialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.child_txt;
      TextView childTxt = rootView.findViewById(id);
      if (childTxt == null) {
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

      id = R.id.close_btn;
      MaterialButton closeBtn = rootView.findViewById(id);
      if (closeBtn == null) {
        break missingId;
      }

      id = R.id.defect_spin;
      AppCompatSpinner defectSpin = rootView.findViewById(id);
      if (defectSpin == null) {
        break missingId;
      }

      id = R.id.defect_txt;
      TextView defectTxt = rootView.findViewById(id);
      if (defectTxt == null) {
        break missingId;
      }

      id = R.id.notes_edt;
      EditText notesEdt = rootView.findViewById(id);
      if (notesEdt == null) {
        break missingId;
      }

      id = R.id.notes_txt;
      TextView notesTxt = rootView.findViewById(id);
      if (notesTxt == null) {
        break missingId;
      }

      id = R.id.qtn_edt;
      EditText qtnEdt = rootView.findViewById(id);
      if (qtnEdt == null) {
        break missingId;
      }

      id = R.id.qtn_txt;
      TextView qtnTxt = rootView.findViewById(id);
      if (qtnTxt == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = rootView.findViewById(id);
      if (saveBtn == null) {
        break missingId;
      }

      return new AdddefectdialogBinding((ConstraintLayout) rootView, childTxt, childcode, childdesc,
          closeBtn, defectSpin, defectTxt, notesEdt, notesTxt, qtnEdt, qtnTxt, saveBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
