package com.dasakreativa.sekitarkampus

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashLauncher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_launcher)

        Handler(Looper.getMainLooper()).postDelayed({
            loadingToMain()
        }, 5000)
    }

    /**
     * Redirect to main activity (MainActivity.kt
     */
    private fun loadingToMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}