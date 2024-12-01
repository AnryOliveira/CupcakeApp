// Generated by view binder compiler. Do not edit!
package com.dmribeiro87.cupcakeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dmribeiro87.cupcakeapp.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAdressBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final MaterialButton btnCard;

  @NonNull
  public final MaterialButton btnPix;

  @NonNull
  public final EditText edtCity;

  @NonNull
  public final EditText edtComplement;

  @NonNull
  public final EditText edtName;

  @NonNull
  public final EditText edtNeighborhood;

  @NonNull
  public final EditText edtNumber;

  @NonNull
  public final EditText edtState;

  @NonNull
  public final EditText edtStreet;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView tvTitle2;

  private FragmentAdressBinding(@NonNull NestedScrollView rootView, @NonNull MaterialButton btnCard,
      @NonNull MaterialButton btnPix, @NonNull EditText edtCity, @NonNull EditText edtComplement,
      @NonNull EditText edtName, @NonNull EditText edtNeighborhood, @NonNull EditText edtNumber,
      @NonNull EditText edtState, @NonNull EditText edtStreet, @NonNull TextView tvTitle,
      @NonNull TextView tvTitle2) {
    this.rootView = rootView;
    this.btnCard = btnCard;
    this.btnPix = btnPix;
    this.edtCity = edtCity;
    this.edtComplement = edtComplement;
    this.edtName = edtName;
    this.edtNeighborhood = edtNeighborhood;
    this.edtNumber = edtNumber;
    this.edtState = edtState;
    this.edtStreet = edtStreet;
    this.tvTitle = tvTitle;
    this.tvTitle2 = tvTitle2;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAdressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAdressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_adress, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAdressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_card;
      MaterialButton btnCard = ViewBindings.findChildViewById(rootView, id);
      if (btnCard == null) {
        break missingId;
      }

      id = R.id.btn_pix;
      MaterialButton btnPix = ViewBindings.findChildViewById(rootView, id);
      if (btnPix == null) {
        break missingId;
      }

      id = R.id.edt_city;
      EditText edtCity = ViewBindings.findChildViewById(rootView, id);
      if (edtCity == null) {
        break missingId;
      }

      id = R.id.edt_complement;
      EditText edtComplement = ViewBindings.findChildViewById(rootView, id);
      if (edtComplement == null) {
        break missingId;
      }

      id = R.id.edt_name;
      EditText edtName = ViewBindings.findChildViewById(rootView, id);
      if (edtName == null) {
        break missingId;
      }

      id = R.id.edt_neighborhood;
      EditText edtNeighborhood = ViewBindings.findChildViewById(rootView, id);
      if (edtNeighborhood == null) {
        break missingId;
      }

      id = R.id.edt_number;
      EditText edtNumber = ViewBindings.findChildViewById(rootView, id);
      if (edtNumber == null) {
        break missingId;
      }

      id = R.id.edt_state;
      EditText edtState = ViewBindings.findChildViewById(rootView, id);
      if (edtState == null) {
        break missingId;
      }

      id = R.id.edt_street;
      EditText edtStreet = ViewBindings.findChildViewById(rootView, id);
      if (edtStreet == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.tv_title2;
      TextView tvTitle2 = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle2 == null) {
        break missingId;
      }

      return new FragmentAdressBinding((NestedScrollView) rootView, btnCard, btnPix, edtCity,
          edtComplement, edtName, edtNeighborhood, edtNumber, edtState, edtStreet, tvTitle,
          tvTitle2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}