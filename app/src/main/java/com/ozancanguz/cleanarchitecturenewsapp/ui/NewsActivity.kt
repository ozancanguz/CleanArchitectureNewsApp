package com.ozancanguz.cleanarchitecturenewsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.ozancanguz.cleanarchitecturenewsapp.R
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {
    //Your API key is: 93c28c74405444fba565c9b1ca6734de

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)


        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}