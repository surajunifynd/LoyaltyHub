package com.example.loyaltyhub

import com.example.loyaltyhub.Constants.DEFAULT_BACKEND_MESSAGE
import com.example.loyaltyhub.model.ErrorResponse
import com.google.gson.Gson
import retrofit2.Response


fun getErrorResponse(responseBody: Response<*>, showDefault: Boolean = false): String {
    val gson = Gson()
    return try {
        val errorResponse = gson.fromJson(
            responseBody.errorBody()?.charStream(),
            ErrorResponse::class.java
        )
        errorResponse.status.message
    } catch (e: Exception) {
        try {
            responseBody.message()
        } catch (e: Exception) {
            DEFAULT_BACKEND_MESSAGE
        }
    }
}

