package com.example.newsinshort.data.api

import com.example.newsinshort.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    //GET https://newsapi.org/v2/top-headlines?country=us&apiKey=16301971147e44ab9358086ba961a678
    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country:String,
        @Query("apiKey") apiKey:String = "YOUR_API_KEY"
    ): Response<NewsResponse>
}