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
    private var totalPages = 1
    var totalPoints: Int = 0
    var totalGems: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPuzzlefeedBinding.inflate(layoutInflater)
        presenter = PuzzleFeedPresenter(this)
        getPuzzleFeed()
    }
    companion object {
        fun startActivity(context: Context) {
            val intent = Intent(context, PuzzleFeedActivity::class.java)
            context.startActivity(intent)
        }
    }

    private fun getPuzzleFeed() {
        presenter.getPuzzleFeed("", "", 20)
    }

    override fun onPuzzleFeedReceived(responseData: PuzzleFeed, totalPages: Int) {
        this.totalPages = totalPages
        this.totalPoints = responseData.totalPoints.toDouble().toInt()
        this.totalGems = responseData.gems.toDouble().toInt()
        if(responseData.puzzles.isNullOrEmpty()) {

        } else {

        }
    }
}