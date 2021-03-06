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
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentScrapBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView childTxt;

  @NonNull
  public final TextView childcode;

  @NonNull
  public final TextView childesc;

  @NonNull
  public final TextView jobordername;

  @NonNull
  public final TextView jobordernameTxt;

  @NonNull
  public final EditText notesEdt;

  @NonNull
  public final TextView notesTxt;

  @NonNull
  public final AppCompatSpinner responsibledepSpin;

  @NonNull
  public final TextView responsibledepTxt;

  @NonNull
  public final MaterialButton saveBtn;

  @NonNull
  public final AppBarLayout scrapAppbar;

  @NonNull
  public final EditText scrapqtnEdt;

  @NonNull
  public final TextView scrapqtnTxt;

  private FragmentScrapBinding(@NonNull ConstraintLayout rootView, @NonNull TextView childTxt,
      @NonNull TextView childcode, @NonNull TextView childesc, @NonNull TextView jobordername,
      @NonNull TextView jobordernameTxt, @NonNull EditText notesEdt, @NonNull TextView notesTxt,
      @NonNull AppCompatSpinner responsibledepSpin, @NonNull TextView responsibledepTxt,
      @NonNull MaterialButton saveBtn, @NonNull AppBarLayout scrapAppbar,
      @NonNull EditText scrapqtnEdt, @NonNull TextView scrapqtnTxt) {
    this.rootView = rootView;
    this.childTxt = childTxt;
    this.childcode = childcode;
    this.childesc = childesc;
    this.jobordername = jobordername;
    this.jobordernameTxt = jobordernameTxt;
    this.notesEdt = notesEdt;
    this.notesTxt = notesTxt;
    this.responsibledepSpin = responsibledepSpin;
    this.responsibledepTxt = responsibledepTxt;
    this.saveBtn = saveBtn;
    this.scrapAppbar = scrapAppbar;
    this.scrapqtnEdt = scrapqtnEdt;
    this.scrapqtnTxt = scrapqtnTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentScrapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentScrapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_scrap, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentScrapBinding bind(@NonNull View rootView) {
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

      id = R.id.childesc;
      TextView childesc = rootView.findViewById(id);
      if (childesc == null) {
        break missingId;
      }

      id = R.id.jobordername;
      TextView jobordername = rootView.findViewById(id);
      if (jobordername == null) {
        break missingId;
      }

      id = R.id.jobordername_txt;
      TextView jobordernameTxt = rootView.findViewById(id);
      if (jobordernameTxt == null) {
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

      id = R.id.responsibledep_spin;
      AppCompatSpinner responsibledepSpin = rootView.findViewById(id);
      if (responsibledepSpin == null) {
        break missingId;
      }

      id = R.id.responsibledep_txt;
      TextView responsibledepTxt = rootView.findViewById(id);
      if (responsibledepTxt == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = rootView.findViewById(id);
      if (saveBtn == null) {
        break missingId;
      }

      id = R.id.scrap_appbar;
      AppBarLayout scrapAppbar = rootView.findViewById(id);
      if (scrapAppbar == null) {
        break missingId;
      }

      id = R.id.scrapqtn_edt;
      EditText scrapqtnEdt = rootView.findViewById(id);
      if (scrapqtnEdt == null) {
        break missingId;
      }

      id = R.id.scrapqtn_txt;
      TextView scrapqtnTxt = rootView.findViewById(id);
      if (scrapqtnTxt == null) {
        break missingId;
      }

      return new FragmentScrapBinding((ConstraintLayout) rootView, childTxt, childcode, childesc,
          jobordername, jobordernameTxt, notesEdt, notesTxt, responsibledepSpin, responsibledepTxt,
          saveBtn, scrapAppbar, scrapqtnEdt, scrapqtnTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
