package com.example.assessmentquestion.recycler

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assessmentquestion.MainActivity
import com.example.assessmentquestion.R
import com.example.assessmentquestion.fragments.FragmentOne

class Adapter(mainActivity: FragmentOne) :RecyclerView.Adapter(Viewholder){
    private var mutableList = mutableListOf(
        "Rohan",
        "Yadhu",
        "Sheril",
        "Dayana",
        "Amrutha",
        "Nikhil",
        "Anandu",
        "Robin",
        "Joel",
        "Fatima",
        "Abhishek",
        "Aswin"
    )

    private var mClickListener: FragmentOne = mainActivity

    override fun getItemViewType(position: Int): Int {
        Log.e("Adapter viewType", position.toString())

        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        Log.e("Adapter viewType", viewType.toString())
        val mContext = parent.context
        val layoutInflater = LayoutInflater.from(mContext)
        val view = layoutInflater.inflate(R.layout.recyclerview_row, parent, false)
        return Viewholder(view, mClickListener)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        Log.e("Adapter position", position.toString())

        val planet = mutableList[position]
        holder.myTextView.text = planet
    }

    override fun getItemCount(): Int {
        return mutableList.size
    }

    interface ItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }

}