package com.dts.a20221210_nikitasoloviov_nycschools.data.domain.utils

import android.util.Log
import androidx.fragment.app.DialogFragment


// Extension function for dialogFragment to safe close of dialog
fun DialogFragment?.safeDismiss(allowStateLoss: Boolean = true) {
    this?.let { dialogFragment ->
        if (allowStateLoss) {
            dialogFragment.dismissAllowingStateLoss()
        } else {
            dialogFragment.dismiss()
        }
    } ?: run {
        Log.d("Dialog", "DialogFragment instance is null")
    }
}