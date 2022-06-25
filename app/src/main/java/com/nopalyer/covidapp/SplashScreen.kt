package com.nopalyer.covidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


            var an = AnimationUtils.loadAnimation(this,R.anim.spin)
            imgbtn.startAnimation(an)


        btnGo.setOnClickListener {
            var intent = Intent(this@SplashScreen,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
