package com.soict.hoangviet.moretablayout.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.soict.hoangviet.moretablayout.ui.FirstFragment

class CustomAdapter : FragmentPagerAdapter {
    private var listFragment: MutableList<Fragment> = mutableListOf(
        FirstFragment.getInstance(0),
        FirstFragment.getInstance(1),
        FirstFragment.getInstance(2),
        FirstFragment.getInstance(3),
        FirstFragment.getInstance(4),
        FirstFragment.getInstance(5)
    )

    constructor(fragmentManager: FragmentManager) : super(fragmentManager) {
    }

    override fun getItem(position: Int): Fragment {
        return listFragment[position]
    }

    override fun getCount(): Int {
        return listFragment.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> {
                return "Cho bạn"
            }
            1 -> {
                return "Bảng xếp hạng"
            }
            2 -> {
                return "Loại"
            }
            3 -> {
                return "Lựa chọn của biên tập viên"
            }
            4 -> {
                return "Gia đình"
            }
            5 -> {
                return "Quyền truy cập nhóm"
            }
            else -> return ""
        }
    }
}