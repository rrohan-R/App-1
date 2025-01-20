package com.example.assessmentquestion.recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assessmentquestion.R

class Viewholder(itemview:View):RecyclerView.ViewHolder(itemview) {
    var myTextView: TextView = itemView.findViewById(R.id.myTextView)

}
