// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.gbsbadrsf.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentQualityscraplistBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView qualityscrapRv;

  @NonNull
  public final TextView qualityscrapTxt;

  private FragmentQualityscraplistBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView qualityscrapRv, @NonNull TextView qualityscrapTxt) {
    this.rootView = rootView;
    this.qualityscrapRv = qualityscrapRv;
    this.qualityscrapTxt = qualityscrapTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQualityscraplistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQualityscraplistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_qualityscraplist, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQualityscraplistBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.qualityscrap_rv;
      RecyclerView qualityscrapRv = ViewBindings.findChildViewById(rootView, id);
      if (qualityscrapRv == null) {
        break missingId;
      }

      id = R.id.qualityscrap_txt;
      TextView qualityscrapTxt = ViewBindings.findChildViewById(rootView, id);
      if (qualityscrapTxt == null) {
        break missingId;
      }

      return new FragmentQualityscraplistBinding((ConstraintLayout) rootView, qualityscrapRv,
          qualityscrapTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
