package com.example.loyaltyhub.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.loyaltyhub.LoyaltyHubView
import com.example.loyaltyhub.R
import com.example.loyaltyhub.databinding.ActivityLoyaltyhubBinding
import com.example.loyaltyhub.viewModel.LoyaltyHubViewModel

class LoyaltyHubActivity : AppCompatActivity(), LoyaltyHubView, View.OnClickListener {

    private lateinit var binding: ActivityLoyaltyhubBinding

    //private lateinit var presenter : LoyaltyHubPresenter
    private lateinit var loyaltyHubViewModel: LoyaltyHubViewModel
    private lateinit var token: String
    private var isLoyaltyHomeObserved = false
    private var isLoyaltyHomeResumed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoyaltyhubBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cvImagePuzzle.setOnClickListener(this)
        binding.clSpin.setOnClickListener(this)
        loyaltyHubViewModel =
            ViewModelProvider(this@LoyaltyHubActivity).get(LoyaltyHubViewModel::class.java)
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Ik5hUm1JVGJTW3Q0U2lucENVRVhUcVEkJCIsImZpcnN0TmFtZSI6IlN1cmFqIiwibGFzdE5hbWUiOiJTYWhhbmkiLCJlbWFpbCI6InN1cmFqQHVuaWZ5bmQuY29tIiwibW9iaWxlTnVtYmVyIjo3ODI3MDcwNTM5LCJkZXZpY2UiOiIyIiwiZGV2aWNlSWQiOiJiNTg4ZGZhNC00MTcwLTQxODMtOWIxNS1iYTM2MGQ3NWQ0YjQiLCJidWlsZCI6IjYuMi4xLjUiLCJwcmVmZXJyZWRNYWxsSWQiOm51bGwsImlzRXhjbHVzaXZlIjowLCJ3aGF0c0FwcENvbmNlbnQiOiIxIiwib3B0ZWRGb3JEZWxldGlvbiI6MCwicmVhY3RpdmF0aW9uQ29kZSI6bnVsbCwicHJvZmlsZVBpYyI6Imh0dHBzOi8vc3RhZ2UtYXNnYXJkLXByaXZhdGUuczMuYXAtc291dGgtMS5hbWF6b25hd3MuY29tL3Byb2ZpbGVQaWMvMjAyMi8xMC8yMC8xODIxMzg2MzkzNy00NTA1NjAtMjAyMi0xMC0yMC5qcGc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBNVlMNlRVTUVUNEdCUEVHRSUyRjIwMjMwNDI0JTJGYXAtc291dGgtMSUyRnMzJTJGYXdzNF9yZXF1ZXN0JlgtQW16LURhdGU9MjAyMzA0MjRUMDc1MzQ1WiZYLUFtei1FeHBpcmVzPTM2MDAmWC1BbXotU2lnbmF0dXJlPTAzMGJjNmNhMDNkODczZWFhM2Q5NmRlZmRjOTYxMzU5YjQxMTg4OTgwMWMxNmFjNDkwMTkwZTExMDIwMjk1NzImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0IiwibGFzdExvZ2luIjoiMjQtMDQtMjAyMyIsImRlbGV0aW9uUmVxdWVzdGVkQXQiOm51bGwsImlhdCI6MTY4MjMyMjgyNSwiZXhwIjoxNjgzNjE4ODI1fQ.Z3qqUr__aQLS2wQwB9ru1CUiCIoyD5na_udeGpPbkg4"
        //presenter.getLoyaltyHome(token,"mall_1")
        getLoyaltyHome()
    }

    private fun getLoyaltyHome() {
        val temp = loyaltyHubViewModel.getLoyaltyHome(token, "mall_1")

        if (!isLoyaltyHomeObserved) {
            temp?.observe(this, {
                if (isLoyaltyHomeResumed || it == null) return@observe
                onImagePuzzleReceived(it.isImagePuzzleEnable)
            })
            isLoyaltyHomeObserved = true
        }
    }

    private fun onImagePuzzleReceived(isEnable: Int) {
        if (isEnable == 1) {

        } else {

        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cvImagePuzzle -> {
                PuzzleFeedActivity.startActivity(this)
            }
            R.id.clSpin -> {
                SpinWheelFeedActivity.startActivity(this)
            }
        }
    }
}