package com.droid.layoutperformace

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val time1 = System.currentTimeMillis()
        setContentView(R.layout.view_image_text_linear)
        val time2 = System.currentTimeMillis()

        System.out.println("FragmentActivity.TAG onCreate: " + (time2 - time1))
    }
}

