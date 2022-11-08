package com.ozancanguz.cleanarchitecturenewsapp.repository

import com.ozancanguz.cleanarchitecturenewsapp.api.RetrofitInstance
import com.ozancanguz.cleanarchitecturenewsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}