package com.dmribeiro87.cupcakeapp.ui.address

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.dmribeiro87.cupcakeapp.R

public class AddressFragmentDirections private constructor() {
  public companion object {
    public fun actionNavAdressToPixPaymentFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_nav_adress_to_pixPaymentFragment)

    public fun actionNavAdressToNavCardPayment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_nav_adress_to_nav_card_payment)
  }
}
