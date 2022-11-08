package com.ozancanguz.cleanarchitecturenewsapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ozancanguz.cleanarchitecturenewsapp.model.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: Article):Long

    @Query("Select*from articles")
    fun getAllArticles():LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)

}