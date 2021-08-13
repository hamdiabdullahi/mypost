package com.example.apiapplication1

import android.provider.CallLog
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("posts")
    fun getPosts():Call<List<post>>
@GET("posts/{id}")
fun getPostById(@Path("id") postId:Int):Call<post>
}