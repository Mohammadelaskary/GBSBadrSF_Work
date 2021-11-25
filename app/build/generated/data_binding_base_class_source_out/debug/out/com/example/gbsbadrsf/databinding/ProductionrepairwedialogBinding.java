// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class ProductionrepairwedialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton closeBtn;

  @NonNull
  public final TextView defectname;

  @NonNull
  public final TextView defectnameTxt;

  @NonNull
  public final TextView defectqty;

  @NonNull
  public final TextView defectqtyTxt;

  @NonNull
  public final EditText notesEdt;

  @NonNull
  public final TextView notesTxt;

  @NonNull
  public final TextView parentTxt;

  @NonNull
  public final TextView parentdesc;

  @NonNull
  public final EditText requiredqtnEdt;

  @NonNull
  public final TextView requiredqtnTxt;

  @NonNull
  public final MaterialButton saveBtn;

  private ProductionrepairwedialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton closeBtn, @NonNull TextView defectname,
      @NonNull TextView defectnameTxt, @NonNull TextView defectqty, @NonNull TextView defectqtyTxt,
      @NonNull EditText notesEdt, @NonNull TextView notesTxt, @NonNull TextView parentTxt,
      @NonNull TextView parentdesc, @NonNull EditText requiredqtnEdt,
      @NonNull TextView requiredqtnTxt, @NonNull MaterialButton saveBtn) {
    this.rootView = rootView;
    this.closeBtn = closeBtn;
    this.defectname = defectname;
    this.defectnameTxt = defectnameTxt;
    this.defectqty = defectqty;
    this.defectqtyTxt = defectqtyTxt;
    this.notesEdt = notesEdt;
    this.notesTxt = notesTxt;
    this.parentTxt = parentTxt;
    this.parentdesc = parentdesc;
    this.requiredqtnEdt = requiredqtnEdt;
    this.requiredqtnTxt = requiredqtnTxt;
    this.saveBtn = saveBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProductionrepairwedialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProductionrepairwedialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.productionrepairwedialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProductionrepairwedialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.close_btn;
      MaterialButton closeBtn = rootView.findViewById(id);
      if (closeBtn == null) {
        break missingId;
      }

      id = R.id.defectname;
      TextView defectname = rootView.findViewById(id);
      if (defectname == null) {
        break missingId;
      }

      id = R.id.defectname_txt;
      TextView defectnameTxt = rootView.findViewById(id);
      if (defectnameTxt == null) {
        break missingId;
      }

      id = R.id.defectqty;
      TextView defectqty = rootView.findViewById(id);
      if (defectqty == null) {
        break missingId;
      }

      id = R.id.defectqty_txt;
      TextView defectqtyTxt = rootView.findViewById(id);
      if (defectqtyTxt == null) {
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

      id = R.id.parent_txt;
      TextView parentTxt = rootView.findViewById(id);
      if (parentTxt == null) {
        break missingId;
      }

      id = R.id.parentdesc;
      TextView parentdesc = rootView.findViewById(id);
      if (parentdesc == null) {
        break missingId;
      }

      id = R.id.requiredqtn_edt;
      EditText requiredqtnEdt = rootView.findViewById(id);
      if (requiredqtnEdt == null) {
        break missingId;
      }

      id = R.id.requiredqtn_txt;
      TextView requiredqtnTxt = rootView.findViewById(id);
      if (requiredqtnTxt == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = rootView.findViewById(id);
      if (saveBtn == null) {
        break missingId;
      }

      return new ProductionrepairwedialogBinding((ConstraintLayout) rootView, closeBtn, defectname,
          defectnameTxt, defectqty, defectqtyTxt, notesEdt, notesTxt, parentTxt, parentdesc,
          requiredqtnEdt, requiredqtnTxt, saveBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
