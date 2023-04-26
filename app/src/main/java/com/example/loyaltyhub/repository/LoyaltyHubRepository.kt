package com.example.loyaltyhub.repository

import androidx.lifecycle.MutableLiveData
import com.example.loyaltyhub.CoreApplication
import com.example.loyaltyhub.data.api.RetrofitClient
import com.example.loyaltyhub.getErrorResponse
import com.example.loyaltyhub.model.ServerResponseData
import com.example.loyaltyhub.model.ServerResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object LoyaltyHubRepository {

    val loyaltyHomeData = MutableLiveData<ServerResponseData>()
    fun getLoyaltyHub(token: String, mallId: String): MutableLiveData<ServerResponseData> {
        loyaltyHomeData.value = null
        RetrofitClient.apiServiceRc?.getLoyaltyHub(token, mallId)
            ?.enqueue(object : Callback<ServerResponse> {
                override fun onResponse(call: Call<ServerResponse>, response: Response<ServerResponse>) {
                    val data = response.body()?.data
                    if(response.code() == 200 && data !=null) {
                        loyaltyHomeData.value = data
                    } else {
                        val errorResponse = getErrorResponse(response)

                    }
                }

                override fun onFailure(call: Call<ServerResponse>, t: Throwable) {

                }

            })
        return loyaltyHomeData
    }


//    fun getLoyaltyHub(token: String, mallId: String): MutableLiveData<ServerResponseData> {
//        loyaltyHomeData.value = null
//        CoreApplication.apiServiceV2?.getLoyaltyHub(token, mallId)
//            ?.enqueue(object : Callback<ServerResponse> {
//                override fun onResponse(call: Call<ServerResponse>, response: Response<ServerResponse>) {
//                    val data = response.body()?.data
//                    if(response.code() == 200 && data !=null) {
//                        loyaltyHomeData.value = data
//                    } else {
//                        val errorResponse = getErrorResponse(response)
//
//                    }
//                }
//
//                override fun onFailure(call: Call<ServerResponse>, t: Throwable) {
//
//                }
//
//            })
//        return loyaltyHomeData
//    }

}