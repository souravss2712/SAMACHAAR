package com.example.samachaar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    lateinit var viewpager: ViewPager
    lateinit var tablayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tablayout = findViewById(R.id.tablayout)
        viewpager = findViewById(R.id.viewpager)

        val viewpageradapter = ViewPagerAdapter(supportFragmentManager)

        viewpageradapter.addfragment(FragmentSports.getInstance(), "SPORTS")

        viewpageradapter.addfragment(FragmentHealth.getInstance(), "HEALTH")

        viewpageradapter.addfragment(FragmentTechnology.getInstance(), "TECHNOLOGY")

        viewpageradapter.addfragment(FragmentBusiness.getInstance(), "BUSINESS")

        viewpageradapter.addfragment(FragmentScience.getInstance(), "SCIENCE")

        viewpageradapter.addfragment(FragmentEntertainment.getInstance(), "ENTERTAINMENT")







        viewpager.adapter = viewpageradapter

        tablayout.setupWithViewPager(viewpager)


    }
//    public fun getTabs(){
//        val viewpageradapter = ViewPagerAdapter(supportFragmentManager)
//        var mHandler: Handler? = null
//        if (mHandler != null) {
//            mHandler.post(Runnable {
//
//                fun run()
//                {
//                    viewpageradapter.addfragment(FragmentEntertainment.getInstance(), "CHATS")
//                    viewpageradapter.addfragment(FragmentSports.getInstance(), "SPORTS")
//                    viewpageradapter.addfragment(FragmentPolitics.getInstance(), "POLITICS")
//
//                    viewpager.adapter = viewpageradapter
//
//                    tablayout.setupWithViewPager(viewpager)
//                }
//
//            })
//        }




}