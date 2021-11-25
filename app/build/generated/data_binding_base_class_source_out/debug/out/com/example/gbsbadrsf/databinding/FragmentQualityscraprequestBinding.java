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

public final class FragmentQualityscraprequestBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton acceptBtn;

  @NonNull
  public final TextView childTxt;

  @NonNull
  public final TextView childcode;

  @NonNull
  public final TextView childdesc;

  @NonNull
  public final MaterialButton declineBtn;

  @NonNull
  public final MaterialButton displaydeffectBtn;

  @NonNull
  public final TextView jobordername;

  @NonNull
  public final TextView jobordernameTxt;

  @NonNull
  public final EditText notesEdt;

  @NonNull
  public final TextView notesTxt;

  @NonNull
  public final TextView responsibledepTxt;

  @NonNull
  public final TextView responspiledep;

  @NonNull
  public final TextView scrapquantity;

  @NonNull
  public final TextView scrapquantityTxt;

  @NonNull
  public final TextView scraprequestTxt;

  private FragmentQualityscraprequestBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton acceptBtn, @NonNull TextView childTxt, @NonNull TextView childcode,
      @NonNull TextView childdesc, @NonNull MaterialButton declineBtn,
      @NonNull MaterialButton displaydeffectBtn, @NonNull TextView jobordername,
      @NonNull TextView jobordernameTxt, @NonNull EditText notesEdt, @NonNull TextView notesTxt,
      @NonNull TextView responsibledepTxt, @NonNull TextView responspiledep,
      @NonNull TextView scrapquantity, @NonNull TextView scrapquantityTxt,
      @NonNull TextView scraprequestTxt) {
    this.rootView = rootView;
    this.acceptBtn = acceptBtn;
    this.childTxt = childTxt;
    this.childcode = childcode;
    this.childdesc = childdesc;
    this.declineBtn = declineBtn;
    this.displaydeffectBtn = displaydeffectBtn;
    this.jobordername = jobordername;
    this.jobordernameTxt = jobordernameTxt;
    this.notesEdt = notesEdt;
    this.notesTxt = notesTxt;
    this.responsibledepTxt = responsibledepTxt;
    this.responspiledep = responspiledep;
    this.scrapquantity = scrapquantity;
    this.scrapquantityTxt = scrapquantityTxt;
    this.scraprequestTxt = scraprequestTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQualityscraprequestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQualityscraprequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_qualityscraprequest, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQualityscraprequestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.accept_btn;
      MaterialButton acceptBtn = rootView.findViewById(id);
      if (acceptBtn == null) {
        break missingId;
      }

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

      id = R.id.decline_btn;
      MaterialButton declineBtn = rootView.findViewById(id);
      if (declineBtn == null) {
        break missingId;
      }

      id = R.id.displaydeffect_btn;
      MaterialButton displaydeffectBtn = rootView.findViewById(id);
      if (displaydeffectBtn == null) {
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

      id = R.id.responsibledep_txt;
      TextView responsibledepTxt = rootView.findViewById(id);
      if (responsibledepTxt == null) {
        break missingId;
      }

      id = R.id.responspiledep;
      TextView responspiledep = rootView.findViewById(id);
      if (responspiledep == null) {
        break missingId;
      }

      id = R.id.scrapquantity;
      TextView scrapquantity = rootView.findViewById(id);
      if (scrapquantity == null) {
        break missingId;
      }

      id = R.id.scrapquantity_txt;
      TextView scrapquantityTxt = rootView.findViewById(id);
      if (scrapquantityTxt == null) {
        break missingId;
      }

      id = R.id.scraprequest_txt;
      TextView scraprequestTxt = rootView.findViewById(id);
      if (scraprequestTxt == null) {
        break missingId;
      }

      return new FragmentQualityscraprequestBinding((ConstraintLayout) rootView, acceptBtn,
          childTxt, childcode, childdesc, declineBtn, displaydeffectBtn, jobordername,
          jobordernameTxt, notesEdt, notesTxt, responsibledepTxt, responspiledep, scrapquantity,
          scrapquantityTxt, scraprequestTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
