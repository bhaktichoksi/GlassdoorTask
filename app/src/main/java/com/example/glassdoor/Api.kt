package com.example.glassdoor

import com.example.glassdoor.POJO.Glassdoor
import retrofit2.Call;
import retrofit2.http.GET;

interface Api {


    //urls
    @GET("feed.json")
    fun getGlassdoors(): Call<Glassdoor>?



}