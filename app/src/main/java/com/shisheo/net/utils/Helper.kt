package com.shisheo.net.utils

import android.widget.EditText

object Helper {

    fun disableEdts(edt: EditText) {
        edt.isSelected = false
        edt.isFocusable = false
    }

}