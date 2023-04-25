package com.example.loyaltyhub.presentation

import com.example.loyaltyhub.data.api.RetrofitClient
import com.example.loyaltyhub.getErrorResponse
import com.example.loyaltyhub.model.PuzzleFeedWrapper
import com.example.loyaltyhub.ui.activity.PuzzleFeedActivity
import com.example.loyaltyhub.ui.view.PuzzleFeedView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PuzzleFeedPresenter(private val view: PuzzleFeedView) {

    fun getPuzzleFeed(token: String, mallId: String, pageNo: Int) {
        RetrofitClient?.apiService?.getPuzzleFeed(
            token,
            mallId,
            pageNo
        )?.enqueue(object : Callback<PuzzleFeedWrapper> {
            override fun onResponse(
                call: Call<PuzzleFeedWrapper>,
                response: Response<PuzzleFeedWrapper>
            ) {
                view.hideLoader()
                if (response.code() == 200) {
                    val data = response.body()?.data
                    if (data != null) {
                        val totalPages = data.totalPages ?: 1
                        view.onPuzzleFeedReceived(data, totalPages)
                    }
                } else {
                    val errorResponse = getErrorResponse(response)
                    view.onError(errorResponse)
                }
            }

            override fun onFailure(call: Call<PuzzleFeedWrapper>, t: Throwable) {

            }

        })
    }
}