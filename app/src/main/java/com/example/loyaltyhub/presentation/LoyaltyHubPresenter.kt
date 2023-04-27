package com.example.loyaltyhub.presentation

import com.example.loyaltyhub.LoyaltyHubView
import com.example.loyaltyhub.data.api.RetrofitClient
import com.example.loyaltyhub.getErrorResponse
import com.example.loyaltyhub.model.ServerResponse
import com.example.loyaltyhub.repository.LoyaltyHubRepository
import com.example.loyaltyhub.ui.view.LoyaltyView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoyaltyHubPresenter(private val loyaltyPresenter: LoyaltyView) {
    fun getLoyaltyHome(token: String, mallId: String) {
        RetrofitClient.apiServiceRc.getLoyaltyHub(token, mallId)
            .enqueue(object : retrofit2.Callback<ServerResponse> {
                override fun onResponse(
                    call: Call<ServerResponse>,
                    response: Response<ServerResponse>
                ) {
//                    if (response.isSuccessful) {
//                        val data = response.body()
//                        if (data != null && data != null) {
//                            loyaltyPresenter.onServerLoyaltyHubReceived(response.body()!!.data)
//                        }
//                    }
                    val data = response.body()?.data
                    if(response.code() == 200 && data !=null) {
                        loyaltyPresenter.onServerLoyaltyHubReceived(response.body()!!.data)
                    } else {
                        val errorResponse = getErrorResponse(response)

                    }
                }

                override fun onFailure(call: Call<ServerResponse>, t: Throwable) {

                }

            })
    }
}