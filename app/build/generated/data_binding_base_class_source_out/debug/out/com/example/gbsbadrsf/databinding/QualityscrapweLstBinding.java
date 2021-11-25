// Generated by view binder compiler. Do not edit!
package com.example.gbsbadrsf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.gbsbadrsf.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class QualityscrapweLstBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView clientdetinCard;

  @NonNull
  public final TextView depTxt;

  @NonNull
  public final TextView department;

  @NonNull
  public final TextView jobordername;

  @NonNull
  public final TextView jobordernumTxt;

  @NonNull
  public final TextView parent;

  @NonNull
  public final TextView parentTxt;

  @NonNull
  public final TextView scrapqtn;

  @NonNull
  public final TextView scrapqtnTxt;

  private QualityscrapweLstBinding(@NonNull CardView rootView, @NonNull CardView clientdetinCard,
      @NonNull TextView depTxt, @NonNull TextView department, @NonNull TextView jobordername,
      @NonNull TextView jobordernumTxt, @NonNull TextView parent, @NonNull TextView parentTxt,
      @NonNull TextView scrapqtn, @NonNull TextView scrapqtnTxt) {
    this.rootView = rootView;
    this.clientdetinCard = clientdetinCard;
    this.depTxt = depTxt;
    this.department = department;
    this.jobordername = jobordername;
    this.jobordernumTxt = jobordernumTxt;
    this.parent = parent;
    this.parentTxt = parentTxt;
    this.scrapqtn = scrapqtn;
    this.scrapqtnTxt = scrapqtnTxt;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static QualityscrapweLstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static QualityscrapweLstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.qualityscrapwe_lst, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static QualityscrapweLstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView clientdetinCard = (CardView) rootView;

      id = R.id.dep_txt;
      TextView depTxt = rootView.findViewById(id);
      if (depTxt == null) {
        break missingId;
      }

      id = R.id.department;
      TextView department = rootView.findViewById(id);
      if (department == null) {
        break missingId;
      }

      id = R.id.jobordername;
      TextView jobordername = rootView.findViewById(id);
      if (jobordername == null) {
        break missingId;
      }

      id = R.id.jobordernum_txt;
      TextView jobordernumTxt = rootView.findViewById(id);
      if (jobordernumTxt == null) {
        break missingId;
      }

      id = R.id.parent;
      TextView parent = rootView.findViewById(id);
      if (parent == null) {
        break missingId;
      }

      id = R.id.parent_txt;
      TextView parentTxt = rootView.findViewById(id);
      if (parentTxt == null) {
        break missingId;
      }

      id = R.id.scrapqtn;
      TextView scrapqtn = rootView.findViewById(id);
      if (scrapqtn == null) {
        break missingId;
      }

      id = R.id.scrapqtn_txt;
      TextView scrapqtnTxt = rootView.findViewById(id);
      if (scrapqtnTxt == null) {
        break missingId;
      }

      return new QualityscrapweLstBinding((CardView) rootView, clientdetinCard, depTxt, department,
          jobordername, jobordernumTxt, parent, parentTxt, scrapqtn, scrapqtnTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
