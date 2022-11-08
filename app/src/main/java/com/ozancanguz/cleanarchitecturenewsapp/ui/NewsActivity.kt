package com.ozancanguz.cleanarchitecturenewsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.ozancanguz.cleanarchitecturenewsapp.R
import com.ozancanguz.cleanarchitecturenewsapp.db.ArticleDatabase
import com.ozancanguz.cleanarchitecturenewsapp.repository.NewsRepository
import com.ozancanguz.cleanarchitecturenewsapp.viewmodel.NewsViewModel
import com.ozancanguz.cleanarchitecturenewsapp.viewmodel.NewsViewModelProviderFactory
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {
    //Your API key is: 93c28c74405444fba565c9b1ca6734de

    lateinit var viewModel: NewsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)


        val repository=NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory= NewsViewModelProviderFactory(repository)
        viewModel=ViewModelProvider(this,viewModelProviderFactory).get(NewsViewModel::class.java)


        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}