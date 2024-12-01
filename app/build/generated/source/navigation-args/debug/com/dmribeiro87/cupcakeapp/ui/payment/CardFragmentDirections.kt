package com.dmribeiro87.cupcakeapp.ui.payment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.dmribeiro87.cupcakeapp.R

public class CardFragmentDirections private constructor() {
  public companion object {
    public fun actionNavCardPaymentToNavSuccess(): NavDirections =
        ActionOnlyNavDirections(R.id.action_nav_card_payment_to_nav_success)
  }
}
