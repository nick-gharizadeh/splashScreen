package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.FragmentContainer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val imageView = findViewById<ImageView>(R.id.icon_splash_screen)
        val fragment = findViewById<View>(R.id.fragmentContainerView)
        imageView.alpha=0f
        imageView.animate().setDuration(1500).alpha(1f).withEndAction {
           fragment.visibility=View.VISIBLE
            imageView.visibility=View.GONE
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}