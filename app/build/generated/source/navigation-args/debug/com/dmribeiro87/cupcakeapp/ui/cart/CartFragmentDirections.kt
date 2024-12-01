package com.dmribeiro87.cupcakeapp.ui.cart

import android.os.Bundle
import androidx.navigation.NavDirections
import com.dmribeiro87.cupcakeapp.R
import kotlin.Int
import kotlin.String

public class CartFragmentDirections private constructor() {
  private data class ActionNavCartToVavAdress(
    public val orderId: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_nav_cart_to_vav_adress

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("orderId", this.orderId)
        return result
      }
  }

  public companion object {
    public fun actionNavCartToVavAdress(orderId: String): NavDirections =
        ActionNavCartToVavAdress(orderId)
  }
}
