package com.example.assessmentquestion.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assessmentquestion.R
import com.google.android.gms.ads.mediation.Adapter

class FragmentOne:Fragment() {

    private lateinit var mRecyclerView: RecyclerView
    private var mAdapter: RecyclerView.Adapter =
        com.example.assessmentquestion.recycler.Adapter(this)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_one, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mRecyclerView = view.findViewById(R.id.recyclerview)

        mRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        //  mAdapter.setClickListener(this)
        mRecyclerView.adapter = mAdapter

    }



}