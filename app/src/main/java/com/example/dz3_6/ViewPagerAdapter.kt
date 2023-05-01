package com.example.dz3_6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> CalculatorFragment()
            1 -> ResultFragment()
            2 -> FinalFragment()
            else -> CalculatorFragment()
        }
    }
}