package com.luckyshane.cnblogs.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.luckyshane.cnblogs.R
import kotlinx.android.synthetic.main.fragment_base_blog.*


open class BaseBlogFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_base_blog, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
    }

    private fun initView() {
        blogRecyclerView.run {
            layoutManager = LinearLayoutManager(activity)

        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
    }




}