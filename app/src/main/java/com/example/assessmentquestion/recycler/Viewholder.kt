package com.example.assessmentquestion.recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assessmentquestion.R

class Viewholder(itemview:View,mclicklistener:RecyclerView.Adapter.itemclicklistener):RecyclerView.ViewHolder(itemview) {
    var myTextView: TextView = itemView.findViewById<TextView>(R.id.textView)
    var myBtn: TextView = itemView.findViewById<TextView>(R.id.btn)

    init {
        itemView.setOnClickListener { view ->
            mClickListener.onItemClick(view, adapterPosition)
        }
    }

}