package com.example.loyaltyhub

import android.content.Context
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class WebData {


    companion object {

        private var baseURL: String = "https://asgard-apis-stage.frt.one/v1/"

        private var httpClient = OkHttpClient()

//        fun setBaseURL(isFull: Boolean){
//            baseURL = if(isFull) BuildConfig.FRT_PRO else BuildConfig.FRT_LITE
//        }
//

//        fun cancelAllRequests() {
//            httpClient.dispatcher.cancelAll()
//            Timber.d("Cancelled All Requests")
//        }

        fun getRetrofit(context: Context, version: String = "v1/"): Retrofit {
            //setBaseURL(SharedPref(context).isFRTFull())
            baseURL += version
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY

            val httpClientBuilder = httpClient.newBuilder().readTimeout(0, TimeUnit.SECONDS)
                .writeTimeout(0, TimeUnit.SECONDS)
                .connectTimeout(0, TimeUnit.SECONDS)
                .addInterceptor(logging)

            httpClientBuilder.addInterceptor { chain ->
                val originalRequest = chain.request()

                val requestBuilder = originalRequest.newBuilder()
                requestBuilder.method(originalRequest.method, originalRequest.body)
                // Add header in request

                val authToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Ik5hUm1JVGJTW3Q0U2lucENVRVhUcVEkJCIsImZpcnN0TmFtZSI6IlN1cmFqIiwibGFzdE5hbWUiOiJTYWhhbmkiLCJlbWFpbCI6InN1cmFqQHVuaWZ5bmQuY29tIiwibW9iaWxlTnVtYmVyIjo3ODI3MDcwNTM5LCJkZXZpY2UiOiIyIiwiZGV2aWNlSWQiOiJiNTg4ZGZhNC00MTcwLTQxODMtOWIxNS1iYTM2MGQ3NWQ0YjQiLCJidWlsZCI6IjYuMi4xLjUiLCJwcmVmZXJyZWRNYWxsSWQiOm51bGwsImlzRXhjbHVzaXZlIjowLCJ3aGF0c0FwcENvbmNlbnQiOiIxIiwib3B0ZWRGb3JEZWxldGlvbiI6MCwicmVhY3RpdmF0aW9uQ29kZSI6bnVsbCwicHJvZmlsZVBpYyI6Imh0dHBzOi8vc3RhZ2UtYXNnYXJkLXByaXZhdGUuczMuYXAtc291dGgtMS5hbWF6b25hd3MuY29tL3Byb2ZpbGVQaWMvMjAyMi8xMC8yMC8xODIxMzg2MzkzNy00NTA1NjAtMjAyMi0xMC0yMC5qcGc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBNVlMNlRVTUVUNEdCUEVHRSUyRjIwMjMwNDI0JTJGYXAtc291dGgtMSUyRnMzJTJGYXdzNF9yZXF1ZXN0JlgtQW16LURhdGU9MjAyMzA0MjRUMDc1MzQ1WiZYLUFtei1FeHBpcmVzPTM2MDAmWC1BbXotU2lnbmF0dXJlPTAzMGJjNmNhMDNkODczZWFhM2Q5NmRlZmRjOTYxMzU5YjQxMTg4OTgwMWMxNmFjNDkwMTkwZTExMDIwMjk1NzImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0IiwibGFzdExvZ2luIjoiMjQtMDQtMjAyMyIsImRlbGV0aW9uUmVxdWVzdGVkQXQiOm51bGwsImlhdCI6MTY4MjMyMjgyNSwiZXhwIjoxNjgzNjE4ODI1fQ.Z3qqUr__aQLS2wQwB9ru1CUiCIoyD5na_udeGpPbkg4"
                requestBuilder.header(Constants.HEADER_AUTHORIZATION, authToken)

//                val urlStr = original.url().toString()
//                val mallId = getMallId(urlStr, context)
//                requestBuilder.header(Constants.HEADER_MALL_ID, mallId)

                // Build request
                val request = requestBuilder.build()
                val response = chain.proceed(request)
                response
            }

            val okHttpClient = httpClientBuilder.build()

            return Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
        }

        /**
         * Get `mallId` based on feature.
         *
         * - For parking [SharedPref.getParkingMallId] will be used
         * - For rule engine [SharedPref.getRuleEngineMallId] will be used
         * - For payment [SharedPref.getPayNowtMallId] will be used
         * - For dining [SharedPref.getDiningMallId] will be used
         * - For baggage [SharedPref.getBaggageMallId] will be used
         */
//        private fun getMallId(urlStr: String, context: Context): String {
//            // For parking APIs use 'parkingMallId' else use 'preferredMallId'
//            if(isParkingAPI(urlStr)) {
//                return "mall_${SharedPref(context).getParkingMallId()}"
//            } else {
//                return "mall_${SharedPref(context).getPreferredMallId()}"
//            }
//        }

        private fun isParkingAPI(url: String?) : Boolean {
            return !url.isNullOrEmpty() &&
                    url.contains("customers/parking/")
        }
    }

}