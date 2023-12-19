package com.example.datateman

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity:FragmentActivity) :
            FragmentStateAdapter(fragmentActivity) {
                private val JUMLAh_MENU = 3

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> {return MyFriendFragment() }
            1 -> {return GitHubFragment() }
            2 -> {return ProfileFragment()}
            else -> {return GitHubFragment() }
        }
    }

    override fun getItemCount(): Int {
        return JUMLAh_MENU
    }
}