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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BasketcodeLstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView basketQnt;

  @NonNull
  public final TextView basketcode;

  private BasketcodeLstBinding(@NonNull ConstraintLayout rootView, @NonNull TextView basketQnt,
      @NonNull TextView basketcode) {
    this.rootView = rootView;
    this.basketQnt = basketQnt;
    this.basketcode = basketcode;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BasketcodeLstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BasketcodeLstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.basketcode_lst, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BasketcodeLstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.basketQnt;
      TextView basketQnt = rootView.findViewById(id);
      if (basketQnt == null) {
        break missingId;
      }

      id = R.id.basketcode;
      TextView basketcode = rootView.findViewById(id);
      if (basketcode == null) {
        break missingId;
      }

      return new BasketcodeLstBinding((ConstraintLayout) rootView, basketQnt, basketcode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
