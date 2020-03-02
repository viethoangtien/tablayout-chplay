package com.soict.hoangviet.moretablayout.ui

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.soict.hoangviet.moretablayout.R
import kotlinx.android.synthetic.main.fragment_tab.*

class FirstFragment : Fragment() {
    companion object {
        private val EXTRA_KEY = "extra_key"
        fun getInstance(position: Int): FirstFragment {
            val firstFragment = FirstFragment()
            val bundle = Bundle()
            bundle.putInt(EXTRA_KEY, position)
            firstFragment.arguments = bundle
            return firstFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tab, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        initData()
        initListener()
    }

    private fun initListener() {
    }

    private fun initData() {
        when (arguments?.getInt(EXTRA_KEY)) {
            0 -> {
                setColor(R.color.md_green_50)
            }
            1 -> {
                setColor(R.color.md_green_100)
            }
            2 -> {
                setColor(R.color.md_green_200)
            }
            3 -> {
                setColor(R.color.md_green_300)
            }
            4 -> {
                setColor(R.color.md_green_400)
            }
            5 -> {
                setColor(R.color.md_green_500)
            }
            6 -> {
                setColor(R.color.md_green_600)
            }
        }
    }

    private fun setColor(color: Int) {
        container.setBackgroundColor(resources.getColor(color, null));
    }

    private fun initViews() {

    }
}