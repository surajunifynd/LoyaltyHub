package com.example.loyaltyhub.repository

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.example.loyaltyhub.data.api.RetrofitClient
import com.example.loyaltyhub.getErrorResponse
import com.example.loyaltyhub.model.Loyalty
import com.example.loyaltyhub.model.ServerResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object LoyaltyHubRepository {

    val loyaltyHomeData = MutableLiveData<Loyalty>()
    fun getLoyaltyHub(token: String, mallId: String) : MutableLiveData<Loyalty> {
        loyaltyHomeData.value = null
        RetrofitClient.apiService?.getLoyaltyHub(token, mallId)?.enqueue(object : Callback<ServerResponse>{
            override fun onResponse(call: Call<ServerResponse>, response: Response<ServerResponse>) {
                val data = response.body()?.data
                if (response.code() == 200 && data !=null) {
                    loyaltyHomeData.value = data
                } else {
                    val errorResponse = getErrorResponse(response)
                    //Timber.e(errorResponse)

                }
            }
            override fun onFailure(call: Call<ServerResponse>, t: Throwable) {

            }

        })
        return loyaltyHomeData
    }
}