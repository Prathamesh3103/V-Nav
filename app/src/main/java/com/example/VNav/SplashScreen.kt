package com.example.VNav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        val appname = findViewById<TextView>(R.id.appname)
        val lottie = findViewById<LottieAnimationView>(R.id.lottie)

        appname.animate().translationY(-500F).setDuration(2700).setStartDelay(0)
        lottie.animate().translationX(0f).setDuration(2000).setStartDelay(2900)
        Handler().postDelayed({
            val openStartingPoint = Intent(this@SplashScreen,intro::class.java)
            startActivity(openStartingPoint)
        }, 5000)
    }
}