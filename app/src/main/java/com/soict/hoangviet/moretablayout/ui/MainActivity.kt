package com.soict.hoangviet.moretablayout.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soict.hoangviet.moretablayout.R
import com.soict.hoangviet.moretablayout.adapter.CustomAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var mCustomAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAdapter()
    }

    private fun initAdapter() {
        mCustomAdapter = CustomAdapter(supportFragmentManager)
        viewPagers.adapter = mCustomAdapter
        tabs.setupWithViewPager(viewPagers)
    }
}
