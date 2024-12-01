// Generated by view binder compiler. Do not edit!
package com.dmribeiro87.cupcakeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dmribeiro87.cupcakeapp.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btFinish;

  @NonNull
  public final EditText edtCvcCard;

  @NonNull
  public final EditText edtDateCard;

  @NonNull
  public final EditText edtNameCard;

  @NonNull
  public final EditText edtNumberCard;

  @NonNull
  public final TextView tvTitle;

  private FragmentCardBinding(@NonNull ConstraintLayout rootView, @NonNull MaterialButton btFinish,
      @NonNull EditText edtCvcCard, @NonNull EditText edtDateCard, @NonNull EditText edtNameCard,
      @NonNull EditText edtNumberCard, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btFinish = btFinish;
    this.edtCvcCard = edtCvcCard;
    this.edtDateCard = edtDateCard;
    this.edtNameCard = edtNameCard;
    this.edtNumberCard = edtNumberCard;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt_finish;
      MaterialButton btFinish = ViewBindings.findChildViewById(rootView, id);
      if (btFinish == null) {
        break missingId;
      }

      id = R.id.edt_cvc_card;
      EditText edtCvcCard = ViewBindings.findChildViewById(rootView, id);
      if (edtCvcCard == null) {
        break missingId;
      }

      id = R.id.edt_date_card;
      EditText edtDateCard = ViewBindings.findChildViewById(rootView, id);
      if (edtDateCard == null) {
        break missingId;
      }

      id = R.id.edt_name_card;
      EditText edtNameCard = ViewBindings.findChildViewById(rootView, id);
      if (edtNameCard == null) {
        break missingId;
      }

      id = R.id.edt_number_card;
      EditText edtNumberCard = ViewBindings.findChildViewById(rootView, id);
      if (edtNumberCard == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new FragmentCardBinding((ConstraintLayout) rootView, btFinish, edtCvcCard, edtDateCard,
          edtNameCard, edtNumberCard, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}