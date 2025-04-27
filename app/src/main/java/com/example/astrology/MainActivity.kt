package com.example.astrology

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_1 -> {
                    replaceFragment(MainFragment())
                    true
                }
                R.id.nav_2 -> {
                    replaceFragment(MapFragment())
                    true
                }
                R.id.nav_3 -> {
                    replaceFragment(FateFragment())
                    true
                }
                R.id.nav_4 -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
        if (savedInstanceState == null) {
            replaceFragment(MainFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}