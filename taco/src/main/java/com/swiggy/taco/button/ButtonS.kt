package com.swiggy.taco.button

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.appcompat.widget.AppCompatButton

class ButtonS(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
   AppCompatButton(context!!, attrs) {
    constructor(context: Context?) : this(context, null) {}
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0) {}

    fun set1BackgroundColor(@ColorInt color: Int) {

    }



}
