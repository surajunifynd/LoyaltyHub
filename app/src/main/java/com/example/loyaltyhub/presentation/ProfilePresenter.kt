package com.example.loyaltyhub.presentation

import com.example.loyaltyhub.data.api.RetrofitClient
import com.example.loyaltyhub.getErrorResponse
import com.example.loyaltyhub.model.PuzzleFeedWrapper
import com.example.loyaltyhub.model.ServerResponse
import com.example.loyaltyhub.ui.view.ProfileView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProfilePresenter(private val profileView: ProfileView)  {

    fun getUserDetails(authToken: String, mallId: String, showLoader: Boolean = false) {
        if(showLoader)
            profileView.showLoader()
        RetrofitClient.apiServiceRc?.getUserDetails(authToken, mallId)?.enqueue(
            object : Callback<ServerResponse> {
                override fun onResponse(
                    call: Call<ServerResponse>,
                    response: Response<ServerResponse>
                ) {
                    if (showLoader)
                        profileView.hideLoader()
                    if (response.body()!!.status.code == 200) {
                        profileView.onServerProfileDetailsReceived(response.body()!!.data.userData)
                    } else {
                        profileView.onError(response.body()!!.status.message)
                    }
                }

                override fun onFailure(call: Call<ServerResponse>, t: Throwable) {
                    if(showLoader)
                        profileView.hideLoader()
                    profileView.onError("Some Error open")
                }

            }
        )

    }
}