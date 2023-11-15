package com.dasakreativa.sekitarkampus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashLauncher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_launcher)
    }

    private fun loadingToMain() {
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish()
    }
}