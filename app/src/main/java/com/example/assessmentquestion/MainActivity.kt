package com.example.assessmentquestion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.FragmentActivity
import com.example.assessmentquestion.fragments.FragmentOne
import com.example.assessmentquestion.fragments.FragmentTwo
import com.example.assessmentquestion.ui.theme.AssessmentQuestionTheme
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.bottom_navigation)
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
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

    }
}