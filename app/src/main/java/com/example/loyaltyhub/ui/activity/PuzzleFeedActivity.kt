package com.example.loyaltyhub.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loyaltyhub.databinding.ActivityPuzzlefeedBinding
import com.example.loyaltyhub.model.PuzzleFeed
import com.example.loyaltyhub.presentation.PuzzleFeedPresenter
import com.example.loyaltyhub.ui.view.PuzzleFeedView

class PuzzleFeedActivity : AppCompatActivity(), PuzzleFeedView {

    private lateinit var presenter: PuzzleFeedPresenter

    private lateinit var binding: ActivityPuzzlefeedBinding
    private lateinit var token: String
    private var totalPages = 1
    var totalPoints: Int = 0
    var totalGems: Int = 0
    private var currentPage = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPuzzlefeedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = PuzzleFeedPresenter(this)
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Ik5hUm1JVGJTW3Q0U2lucENVRVhUcVEkJCIsImZpcnN0TmFtZSI6IlN1cmFqIiwibGFzdE5hbWUiOiJTYWhhbmkiLCJlbWFpbCI6InN1cmFqQHVuaWZ5bmQuY29tIiwibW9iaWxlTnVtYmVyIjo3ODI3MDcwNTM5LCJkZXZpY2UiOiIyIiwiZGV2aWNlSWQiOiJiNTg4ZGZhNC00MTcwLTQxODMtOWIxNS1iYTM2MGQ3NWQ0YjQiLCJidWlsZCI6IjYuMi4xLjUiLCJwcmVmZXJyZWRNYWxsSWQiOm51bGwsImlzRXhjbHVzaXZlIjowLCJ3aGF0c0FwcENvbmNlbnQiOiIxIiwib3B0ZWRGb3JEZWxldGlvbiI6MCwicmVhY3RpdmF0aW9uQ29kZSI6bnVsbCwicHJvZmlsZVBpYyI6Imh0dHBzOi8vc3RhZ2UtYXNnYXJkLXByaXZhdGUuczMuYXAtc291dGgtMS5hbWF6b25hd3MuY29tL3Byb2ZpbGVQaWMvMjAyMi8xMC8yMC8xODIxMzg2MzkzNy00NTA1NjAtMjAyMi0xMC0yMC5qcGc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBNVlMNlRVTUVUNEdCUEVHRSUyRjIwMjMwNDI0JTJGYXAtc291dGgtMSUyRnMzJTJGYXdzNF9yZXF1ZXN0JlgtQW16LURhdGU9MjAyMzA0MjRUMDc1MzQ1WiZYLUFtei1FeHBpcmVzPTM2MDAmWC1BbXotU2lnbmF0dXJlPTAzMGJjNmNhMDNkODczZWFhM2Q5NmRlZmRjOTYxMzU5YjQxMTg4OTgwMWMxNmFjNDkwMTkwZTExMDIwMjk1NzImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0IiwibGFzdExvZ2luIjoiMjQtMDQtMjAyMyIsImRlbGV0aW9uUmVxdWVzdGVkQXQiOm51bGwsImlhdCI6MTY4MjMyMjgyNSwiZXhwIjoxNjgzNjE4ODI1fQ.Z3qqUr__aQLS2wQwB9ru1CUiCIoyD5na_udeGpPbkg4"
    }

    override fun onResume() {
        super.onResume()
        getPuzzleFeed()
    }
    companion object {
        fun startActivity(context: Context) {
            val intent = Intent(context, PuzzleFeedActivity::class.java)
            context.startActivity(intent)
        }
    }

    private fun getPuzzleFeed() {
        presenter.getPuzzleFeed(token, "mall_1", currentPage)
    }

    override fun onPuzzleFeedReceived(responseData: PuzzleFeed, totalPages: Int) {
        this.totalPages = totalPages
        this.totalPoints = responseData.totalPoints.toDouble().toInt()
        this.totalGems = responseData.gems.toDouble().toInt()
        if(responseData.puzzles.isNullOrEmpty()) {

        } else {

        }
    }

    override fun onError(message: String) {

    }

    override fun showLoader() {

    }

    override fun hideLoader() {

    }
}