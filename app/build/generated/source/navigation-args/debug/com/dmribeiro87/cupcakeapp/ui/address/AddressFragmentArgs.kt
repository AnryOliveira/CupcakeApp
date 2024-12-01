package com.dmribeiro87.cupcakeapp.ui.address

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AddressFragmentArgs(
  public val orderId: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("orderId", this.orderId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("orderId", this.orderId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddressFragmentArgs {
      bundle.setClassLoader(AddressFragmentArgs::class.java.classLoader)
      val __orderId : String?
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getString("orderId")
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      return AddressFragmentArgs(__orderId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AddressFragmentArgs {
      val __orderId : String?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      return AddressFragmentArgs(__orderId)
    }
  }
}
