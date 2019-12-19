package com.droid.layoutperformace

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * @author niharika
 */
class RecyclerViewAdapter() : RecyclerView.Adapter<RecyclerViewAdapter.ListViewHolder>() {
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        //do stuff
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater =
            parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.card_item_linear, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        //Taking this for demo
        return 10
    }

    class ListViewHolder(view: View) : RecyclerView.ViewHolder(view)
}

