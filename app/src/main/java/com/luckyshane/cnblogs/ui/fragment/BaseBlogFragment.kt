package com.luckyshane.cnblogs.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.luckyshane.cnblogs.R
import com.luckyshane.cnblogs.adapter.BlogAdapter
import com.luckyshane.cnblogs.model.entity.Blog
import kotlinx.android.synthetic.main.fragment_base_blog.*


open class BaseBlogFragment : Fragment() {

    private var blogAdapter: BlogAdapter? = null
    private val blogList = ArrayList<Blog>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_base_blog, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
    }

    private fun initView() {
        blogAdapter = BlogAdapter(blogList)
        blogRecyclerView.run {
            layoutManager = LinearLayoutManager(activity)
            adapter = blogAdapter
        }
        loadBlog()
    }

    private fun loadBlog() {
        blogList.run {
            clear()
            add(Blog("1",
                    authorName = "陌叶冷",
                    title = "Python | Python资源",
                    subtitle = "Python 资源 我想很多程序员应该记得 GitHub 上有一个 Awesome - XXX 系列的资源整理。awesome-python是 vinta 发起维护的 Pyt...",
                    avatarUrl = "https://upload.jianshu.io/users/upload_avatars/6046379/51aea171-dc8b-4efe-9049-2a87bc32eefc.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/64/h/64"))
            add(Blog("2", "认识自己，接纳自己", "最近一直在写心灵鸡汤，对自己的鸡汤。还没有定位我的读者群，" +
                    "权当把自己的梳理作为你们也在探索的东西吧。 我是一个想法比较多的人，容易受别人影响的人，对自己也比较苛刻，我知道不应.",
                    authorName = "格格分享"))
            add(Blog("3", "如果生命到此为止，你是不是没有任何遗憾？", "文/妖精婆婆 01生命来来往往，来日并不方长 如果生命戛然而止，无论你怎么努力也挽留不住逐渐消逝的生命温度；" +
                    "如果离别迫在眉睫，无论你多么肝肠寸断呼天抢地也不得不放开紧握的双手...",
                    authorName = "妖精婆婆"))
        }
        blogAdapter?.notifyDataSetChanged()
    }


}