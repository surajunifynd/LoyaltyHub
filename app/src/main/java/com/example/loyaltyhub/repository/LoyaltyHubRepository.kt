package com.example.loyaltyhub.repository

import androidx.lifecycle.MutableLiveData
import com.example.loyaltyhub.data.api.RetrofitClient
import com.example.loyaltyhub.model.ServerResponseData
import com.example.loyaltyhub.model.ServerResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object LoyaltyHubRepository {

    val loyaltyHomeData = MutableLiveData<ServerResponseData>()
    fun getLoyaltyHub(token: String, mallId: String) : MutableLiveData<ServerResponseData> {
        loyaltyHomeData.value = null
        RetrofitClient.apiService?.getLoyaltyHub(token, mallId)?.enqueue(object : Callback<ServerResponse> {
            override fun onResponse(
                call: Call<ServerResponse>,
                response: Response<ServerResponse>
            ) {

            }

            override fun onFailure(call: Call<ServerResponse>, t: Throwable) {

            }

        })
        return loyaltyHomeData
    }
}