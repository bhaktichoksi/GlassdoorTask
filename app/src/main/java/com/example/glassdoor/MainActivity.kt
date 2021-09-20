package com.example.glassdoor

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.glassdoor.fragment.InterviewFragment
import com.example.glassdoor.fragment.ReviewFragment
import com.example.glassdoor.fragment.SalaryFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : FragmentActivity() {

    private lateinit var mPager: ViewPager
    private lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabs)
        tabLayout.setupWithViewPager(mPager)

        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager)
        mPager.adapter = pagerAdapter
    }

    override fun onBackPressed() {
        if (mPager.currentItem == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed()
        } else {
            // Otherwise, select the previous step.
            mPager.currentItem = mPager.currentItem - 1
        }
    }

    private inner class ScreenSlidePagerAdapter(fm: FragmentManager) :
            FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        override fun getCount(): Int = 3

        override fun getItem(position: Int): Fragment {
            var fragment: Fragment? = null
            if (position == 0) {
                fragment = ReviewFragment().newInstance()
            } else if (position == 1) {
                fragment = InterviewFragment()
            } else if (position == 2) {
                fragment = SalaryFragment()
            }
            return fragment!!
        }
        override fun getPageTitle(position: Int): CharSequence? {
            var title  = ""
            when(position) {
                0 -> title ="Review"
                1 -> title = "Interview"
                2 -> title = "Salary"
            }
            return title
        }
    }
}