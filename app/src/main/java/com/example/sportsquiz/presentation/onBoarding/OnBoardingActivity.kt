package com.example.sportsquiz.presentation.onBoarding

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.sportsquiz.R
import com.example.sportsquiz.presentation.MainActivity
import com.example.sportsquiz.presentation.adapter.OnBoardingAdapter
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class OnBoardingActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        setStatusBarGradiant(this)
        setViewPager()
    }

    private fun setViewPager() {
        val fragmentList = arrayListOf<Fragment>(
            ThirstFragmentOB(),
            SecondFragmentOB(),
            ThirdFragmentOB()
        )

        val adapterViewPager = OnBoardingAdapter(
            fragmentList,
            this.supportFragmentManager,
            lifecycle
        )

        val viewPager : ViewPager2 = findViewById(R.id.view_pager)
        viewPager.adapter = adapterViewPager

        val indicator : DotsIndicator = findViewById(R.id.dots_indicator)
        indicator.attachTo(viewPager)

        val finish = findViewById<ConstraintLayout>(R.id.bt_finish)
        finish.setOnClickListener {
            val intent = Intent(this@OnBoardingActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    @SuppressLint("ObsoleteSdkInt")
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    fun setStatusBarGradiant(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window: Window = activity.window
            val background = ContextCompat.getDrawable(activity, R.color.background)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

            window.statusBarColor = ContextCompat.getColor(activity,android.R.color.transparent)
            window.setBackgroundDrawable(background)
        }
    }
}