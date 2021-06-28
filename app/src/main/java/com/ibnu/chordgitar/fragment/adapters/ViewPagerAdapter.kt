package com.ibnu.chordgitar.fragment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(supportFragmentManager: FragmentManager) : FragmentPagerAdapter (supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTiltleList = ArrayList <String>()



    override fun getCount(): Int {
        return mFragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList [position]
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTiltleList [position]
    }

    fun addFragment (fragment: Fragment, title: String){
        mFragmentList.add(fragment)
        mFragmentTiltleList.add(title)

    }


}