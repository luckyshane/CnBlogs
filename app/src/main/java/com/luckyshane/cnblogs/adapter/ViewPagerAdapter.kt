package com.luckyshane.cnblogs.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager, private val fmList: List<Fragment>) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int = fmList.size

    override fun getItem(position: Int): Fragment = fmList[position]
}