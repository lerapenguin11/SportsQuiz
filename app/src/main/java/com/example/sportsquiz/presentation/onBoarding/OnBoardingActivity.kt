package com.example.sportsquiz.presentation.onBoarding

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
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
        setViewPager()
    }

    private fun setViewPager() {
        val fragmentList = ArrayList<Fragment>()
        fragmentList.add(ThirstFragmentOB())
        fragmentList.add(SecondFragmentOB())
        fragmentList.add(ThirdFragmentOB())
        val adapterViewPager = OnBoardingAdapter(
            fragmentList,
            this.supportFragmentManager,
            lifecycle
        )
        val viewPager = findViewById<ViewPager2>(R.id.view_pager)
        viewPager.adapter = adapterViewPager
        val indicator = findViewById<DotsIndicator>(R.id.dots_indicator)
        indicator.attachTo(viewPager)
        val finish = findViewById<ConstraintLayout>(R.id.bt_finish)
        finish.setOnClickListener { v: View? ->
            val intent = Intent(
                this@OnBoardingActivity,
                MainActivity::class.java
            )
            startActivity(intent)
            finish()
        }
    }
}