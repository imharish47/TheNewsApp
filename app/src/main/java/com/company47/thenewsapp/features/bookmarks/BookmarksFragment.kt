package com.company47.thenewsapp.features.bookmarks

import androidx.fragment.app.Fragment
import com.company47.thenewsapp.MainActivity
import com.company47.thenewsapp.R

class BookmarksFragment:Fragment(R.layout.fragment_bookmarks),
    MainActivity.OnBottomNavigationFragmentReselectedListener {
    override fun onBottomNavigationFragmentReselected() {
    }
}