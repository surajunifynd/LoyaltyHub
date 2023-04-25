package com.example.loyaltyhub.presentation

import com.example.loyaltyhub.data.api.RetrofitClient
import com.example.loyaltyhub.getErrorResponse
import com.example.loyaltyhub.model.SpinWheelFeedWrapper
import com.example.loyaltyhub.ui.view.SpinWheelFeedView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SpinWheelFeedPresenter(private val view: SpinWheelFeedView) {

    fun getSpinWheelFeed(token: String, mallId: String, pageNo: Int) {
        view.showLoader()
        RetrofitClient.apiService?.getSpinWheelFeed(
            token,
            mallId,
            pageNo
        )?.enqueue(object : Callback<SpinWheelFeedWrapper> {
            override fun onResponse(
                call: Call<SpinWheelFeedWrapper>,
                response: Response<SpinWheelFeedWrapper>
            ) {
                view.hideLoader()
                if (response.code() == 200) {
                    val data = response.body()?.data
                    if (data != null) {
                        val totalPages = data.totalPages ?: 1
                        view.onSpinWheelFeedReceived(data, totalPages)
                    }
                } else {
                    val errorResponse = getErrorResponse(response)
                    view.onError(errorResponse)
                }
            }

            override fun onFailure(call: Call<SpinWheelFeedWrapper>, t: Throwable) {

            }

        })
    }
}