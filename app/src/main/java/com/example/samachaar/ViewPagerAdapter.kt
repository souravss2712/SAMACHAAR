@file:Suppress("DEPRECATION")

package com.example.samachaar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fm: FragmentManager) :
    FragmentStatePagerAdapter(fm) {

     val fragmentlist: MutableList<Fragment> = ArrayList()
     val stringlist: MutableList<String> = ArrayList()

    override fun getCount(): Int {
        return fragmentlist.size

    }

    override fun getItem(position: Int): Fragment {
        return fragmentlist[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return stringlist[position]
    }
     fun addfragment(fragment : Fragment  , title : String ) {
         fragmentlist.add(fragment)
         stringlist.add(title)
    }

}