package com.example.loyaltyhub.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class RetrofitClient {
    companion object {
        val instance: RetrofitClient? = RetrofitClient()
        var  apiService: ApiService? = null
        var apiServiceV2: ApiService? =null
        var apiServiceV3: ApiService? = null

    val apiServiceRc: ApiService = Retrofit.Builder()
        .baseUrl("https://asgard-apis-stage.frt.one/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)
    }
}