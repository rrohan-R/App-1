package com.example.assessmentquestion

import android.os.Bundle

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.replace
import com.example.assessmentquestion.fragments.FragmentOne
import com.example.assessmentquestion.fragments.FragmentTwo
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.bottom_navigation)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        bottomNavigation.selectedItemId = R.id.nav_fragment_one

        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_fragment_one -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container,FragmentOne())
                        .commit()
                }

                R.id.nav_fragment_two -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, FragmentTwo())
                        .commit()
                }
            }
            true
        }
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,FragmentOne()).commit()

    }
}