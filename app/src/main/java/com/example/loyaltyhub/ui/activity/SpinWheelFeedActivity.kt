package com.example.loyaltyhub.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loyaltyhub.R
import com.example.loyaltyhub.model.SpinWheelFeed
import com.example.loyaltyhub.presentation.SpinWheelFeedPresenter
import com.example.loyaltyhub.ui.view.SpinWheelFeedView

class SpinWheelFeedActivity : AppCompatActivity() , SpinWheelFeedView{

    private lateinit var token: String
    private lateinit var presenter: SpinWheelFeedPresenter
    private var currentPage = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spin_wheel_feed)
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Ik5hUm1JVGJTW3Q0U2lucENVRVhUcVEkJCIsImZpcnN0TmFtZSI6IlN1cmFqIiwibGFzdE5hbWUiOiJTYWhhbmkiLCJlbWFpbCI6InN1cmFqQHVuaWZ5bmQuY29tIiwibW9iaWxlTnVtYmVyIjo3ODI3MDcwNTM5LCJkZXZpY2UiOiIyIiwiZGV2aWNlSWQiOiJiNTg4ZGZhNC00MTcwLTQxODMtOWIxNS1iYTM2MGQ3NWQ0YjQiLCJidWlsZCI6IjYuMi4xLjUiLCJwcmVmZXJyZWRNYWxsSWQiOm51bGwsImlzRXhjbHVzaXZlIjowLCJ3aGF0c0FwcENvbmNlbnQiOiIxIiwib3B0ZWRGb3JEZWxldGlvbiI6MCwicmVhY3RpdmF0aW9uQ29kZSI6bnVsbCwicHJvZmlsZVBpYyI6Imh0dHBzOi8vc3RhZ2UtYXNnYXJkLXByaXZhdGUuczMuYXAtc291dGgtMS5hbWF6b25hd3MuY29tL3Byb2ZpbGVQaWMvMjAyMi8xMC8yMC8xODIxMzg2MzkzNy00NTA1NjAtMjAyMi0xMC0yMC5qcGc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBNVlMNlRVTUVUNEdCUEVHRSUyRjIwMjMwNDI0JTJGYXAtc291dGgtMSUyRnMzJTJGYXdzNF9yZXF1ZXN0JlgtQW16LURhdGU9MjAyMzA0MjRUMDc1MzQ1WiZYLUFtei1FeHBpcmVzPTM2MDAmWC1BbXotU2lnbmF0dXJlPTAzMGJjNmNhMDNkODczZWFhM2Q5NmRlZmRjOTYxMzU5YjQxMTg4OTgwMWMxNmFjNDkwMTkwZTExMDIwMjk1NzImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0IiwibGFzdExvZ2luIjoiMjQtMDQtMjAyMyIsImRlbGV0aW9uUmVxdWVzdGVkQXQiOm51bGwsImlhdCI6MTY4MjMyMjgyNSwiZXhwIjoxNjgzNjE4ODI1fQ.Z3qqUr__aQLS2wQwB9ru1CUiCIoyD5na_udeGpPbkg4"
        presenter = SpinWheelFeedPresenter(this)
        getSpinWheelFeed()

    }
    private fun getSpinWheelFeed() {

            presenter.getSpinWheelFeed(
                token,"mall_id", currentPage)
    }

    override fun onSpinWheelFeedReceived(responseData: SpinWheelFeed, totalPages: Int) {
        if(responseData.spinWheels.isNullOrEmpty()) {
            binding
        }
    }

    override fun onError(message: String) {

    }

    override fun showLoader() {

    }

    override fun hideLoader() {

    }
}