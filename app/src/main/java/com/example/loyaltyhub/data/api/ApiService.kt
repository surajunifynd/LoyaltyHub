package com.example.loyaltyhub.data.api

import com.example.loyaltyhub.model.ServerResponseData
import com.example.loyaltyhub.model.PuzzleFeedWrapper
import com.example.loyaltyhub.model.ServerResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {

    @GET("customers/loyaltyHub")
    fun getLoyaltyHub(
        @Header("Authorization") toke: String,
        @Header("mallId") mallId: String,
    ) : Call<ServerResponse>

    @GET("customers/imagePuzzle")
    fun getPuzzleFeed(
        @Header("Authorization") token: String,
        @Header("mallid") mallId: String,
        @Query("pageNo") pageNo: Int,
        @Query("pageSize") pageSize: Int = 20
    ): Call<PuzzleFeedWrapper>

    @GET("customers/spinWheel")
    fun getSpinWheelFeed(
        @Header("Authorization") token: String,
        @Header("mallid") mallId: String,
        @Query("pageNo") pageNo: Int,
        @Query("pageSize") pageSize: Int = Constants.IDEAL_PAGE_SIZE
    ): Call<SpinWheelFeedWrapper>

}