package com.example.loyaltyhub.data

import com.example.loyaltyhub.domain.Loyalty
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {

    @GET("customers/loyaltyHub")
    fun getLoyaltyHub(
        @Header("Authorization") toke: String,
        @Header("mallId") mallId: String,
    ) : Call<Loyalty>

}