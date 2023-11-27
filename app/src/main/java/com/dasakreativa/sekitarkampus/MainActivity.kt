package com.dasakreativa.sekitarkampus

import ImagePromoAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Showing the promo sliders
        val images = intArrayOf(
            R.drawable.sekitar_kampus_color,
            R.drawable.sekitar_kampus_color,
            R.drawable.sekitar_kampus_color,
            R.drawable.sekitar_kampus_color,
            R.drawable.sekitar_kampus_color
        );
        promoImage(images)
    }

    private fun promoImage(images: IntArray) {
        val imageAdapter = ImagePromoAdapter(images);
        findViewById<RecyclerView>(R.id.imagePromoSlider).adapter = imageAdapter;
    }
}
