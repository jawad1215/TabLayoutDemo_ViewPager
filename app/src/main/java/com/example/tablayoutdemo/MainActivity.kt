package com.example.tablayoutdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import java.net.URI

class MainActivity : AppCompatActivity(),Tab1Fragment.OnFragment1InteractionListener,
    Tab2Fragment.OnFragment2InteractionListener,
    Tab3Fragment.OnFragment3InteractionListener,
    Tab4Fragment.OnFragment4InteractionListener {
    lateinit var tab_layout:TabLayout
    lateinit var pager:ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toolbar: Toolbar = findViewById(R.id.tb)
        toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(toolbar)
        configureTabLayout()

    }

    private fun configureTabLayout() {
        tab_layout = findViewById(R.id.tab_layout)
        pager = findViewById(R.id.pager)
        tab_layout.addTab(tab_layout.newTab().setIcon(android.R.drawable.ic_dialog_email))
        tab_layout.addTab(tab_layout.newTab().setIcon(android.R.drawable.ic_dialog_dialer))
        tab_layout.addTab(tab_layout.newTab().setIcon(android.R.drawable.ic_dialog_map))
        tab_layout.addTab(tab_layout.newTab().setIcon(android.R.drawable.ic_dialog_info))
        val adapter = TabPagerAdapter(supportFragmentManager, tab_layout.tabCount)

        pager.adapter = adapter
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
        tab_layout.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    pager.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }

    override fun onFragment1Interaction(uri: URI) {

    }

    override fun onFragment2Interaction(uri: URI) {

    }

    override fun onFragment3Interaction(uri: URI) {

    }

    override fun onFragment4Interaction(uri: URI) {

    }

}