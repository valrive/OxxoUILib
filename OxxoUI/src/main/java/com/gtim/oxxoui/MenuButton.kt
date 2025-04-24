package com.gtim.oxxoui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class MenuButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleResAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr, defStyleResAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.component_button, this, true)
        val button = findViewById<ImageButton>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(context, "Soy un botonazo!!", Toast.LENGTH_SHORT).show()
        }
    }
}