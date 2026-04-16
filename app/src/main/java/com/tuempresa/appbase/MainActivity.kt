package com.tuempresa.appbase

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.TextView
import android.view.Gravity
import android.view.ViewGroup

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this).apply {
            text = "App en desarrollo"
            textSize = 20f
            gravity = Gravity.CENTER
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }
        setContentView(tv)
    }
}