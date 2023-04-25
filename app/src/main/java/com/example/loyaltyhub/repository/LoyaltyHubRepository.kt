package com.example.loyaltyhub.repository

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.example.loyaltyhub.data.api.RetrofitClient
import com.example.loyaltyhub.model.Loyalty
import retrofit2.Call
import retrofit2.Response

object LoyaltyHubRepository {

    val loyaltyHomeData = MutableLiveData<Loyalty>()
    fun getLoyaltyHub(token: String, mallId: String) : MutableLiveData<Loyalty> {
        loyaltyHomeData.value = null
        RetrofitClient.apiService?.getLoyaltyHub(token, mallId)?.enqueue(object : retrofit2.Callback<Loyalty>{
            override fun onResponse(call: Call<Loyalty>, response: Response<Loyalty>) {
                val data = response.body()?.data
                if (response.code() == 200 && data !=null) {
                } else {

                }
            }
            override fun onFailure(call: Call<Loyalty>, t: Throwable) {

            }

        })
        return loyaltyHomeData
    }
}