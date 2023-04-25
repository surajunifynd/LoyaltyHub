package com.example.loyaltyhub.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loyaltyhub.R

class SpinWheelFeedActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spin_wheel_feed)
        getSpinWheelFeed()

    }
    private fun getSpinWheelFeed() {

            presenter.getSpinWheelFeed(
                SharedPref(this).getToken(),
                "mall_${SharedPref(this).getPreferredMallId()}",
                currentPage
            )
        }
}