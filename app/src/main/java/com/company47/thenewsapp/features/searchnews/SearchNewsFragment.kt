package com.company47.thenewsapp.features.searchnews

import androidx.fragment.app.Fragment
import com.company47.thenewsapp.MainActivity
import com.company47.thenewsapp.R

class SearchNewsFragment:Fragment(R.layout.fragment_search_news),
    MainActivity.OnBottomNavigationFragmentReselectedListener {
    override fun onBottomNavigationFragmentReselected() {
    }
}