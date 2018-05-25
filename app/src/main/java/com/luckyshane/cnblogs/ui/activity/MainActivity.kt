package com.luckyshane.cnblogs.ui.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.view.MenuItem
import com.luckyshane.cnblogs.R
import com.luckyshane.cnblogs.adapter.ViewPagerAdapter
import com.luckyshane.cnblogs.ui.fragment.BaseBlogFragment
import com.luckyshane.cnblogs.ui.fragment.HomeBlogFragment
import com.luckyshane.cnblogs.ui.fragment.NewsBlogFragment
import com.luckyshane.cnblogs.ui.fragment.RankListBlogFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    private var mSelectedMenu: MenuItem? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                mainViewPager.setCurrentItem(0, false)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                mainViewPager.setCurrentItem(1, false)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                mainViewPager.setCurrentItem(2, false)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val fmList = ArrayList<BaseBlogFragment>()
        fmList.add(HomeBlogFragment())
        fmList.add(NewsBlogFragment())
        fmList.add(RankListBlogFragment())

        mainViewPager.run {
            adapter = ViewPagerAdapter(supportFragmentManager, fmList)
            addOnPageChangeListener(object : ViewPager.SimpleOnPageChangeListener() {
                override fun onPageSelected(position: Int) {
                    if (mSelectedMenu != null) {
                        mSelectedMenu!!.isChecked = false
                    } else {
                        navigation.menu.getItem(0).isChecked = false
                    }
                    mSelectedMenu = navigation.menu.getItem(position)
                    mSelectedMenu!!.isChecked = true
                }
            })
        }

    }
}
