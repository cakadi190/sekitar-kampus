package com.dasakreativa.sekitarkampus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.dasakreativa.sekitarkampus.recyclers.ImagePromoAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Showing the promo sliders
        val images = intArrayOf(
            R.drawable.promo_banner_default,
            R.drawable.promo_banner_default,
            R.drawable.promo_banner_default,
            R.drawable.promo_banner_default,
            R.drawable.promo_banner_default
        );
        promoImage(images)
    }

    private fun promoImage(images: IntArray) {
        viewPager2 = findViewById(R.id.viewpager)

        val viewPager2Adapter = ImagePromoAdapter(this, images)

        with(viewPager2) {
            adapter = viewPager2Adapter
            registerOnPageChangeCallback(object : OnPageChangeCallback() {
                override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                    super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                }

                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                }

                override fun onPageScrollStateChanged(state: Int) {
                    super.onPageScrollStateChanged(state)
                }
            })
        }
    }
}
