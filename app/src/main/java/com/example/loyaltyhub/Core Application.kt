package com.example.loyaltyhub

import android.content.Context
import com.example.loyaltyhub.data.api.ApiService

class CoreApplication {

    companion object {
        var instance: CoreApplication? = CoreApplication()
        var apiService: ApiService? = null
        var apiServiceV2: ApiService? = null
        var apiServiceV3: ApiService? = null

        fun pointToNewURL(context: Context) {
            apiService = WebData.getRetrofit(context).create(ApiService::class.java)
            apiServiceV2 = WebData.getRetrofit(context, "v2/").create(ApiService::class.java)
            apiServiceV3 = WebData.getRetrofit(context, "v3/").create(ApiService::class.java)
        }

    }
}