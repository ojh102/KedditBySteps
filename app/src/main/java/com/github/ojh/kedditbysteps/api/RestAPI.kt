package com.github.ojh.kedditbysteps.api

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created by JaeHwan on 2016. 8. 17..
 */
class RestAPI {
    private val redditApi: RedditApi;

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://www.reddit.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        redditApi = retrofit.create(RedditApi::class.java)
    }

    fun getNews(after: String, before: String): Call<RedditNewsResponse> {
        return redditApi.getTop(after, before)
    }
}