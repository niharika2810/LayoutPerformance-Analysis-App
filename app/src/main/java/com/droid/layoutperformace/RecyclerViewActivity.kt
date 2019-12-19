package com.droid.layoutperformace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    private var list: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val time1 = System.currentTimeMillis()
        setContentView(R.layout.activity_recycler_view)
        list = findViewById(R.id.list)
        setList()
        val time2 = System.currentTimeMillis()
        System.out.println("FragmentActivity.TAG onCreate: " + (time2 - time1))
    }

    private fun setList() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        list?.layoutManager = layoutManager
        list?.isNestedScrollingEnabled = false
        list?.itemAnimator = DefaultItemAnimator()
        list?.adapter = RecyclerViewAdapter()
    }

}
