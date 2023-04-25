package com.example.loyaltyhub.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loyaltyhub.databinding.ActivityPuzzlefeedBinding
import com.example.loyaltyhub.presentation.PuzzleFeedPresenter

class PuzzleFeedActivity : AppCompatActivity() {

    private lateinit var presenter: PuzzleFeedPresenter

    private lateinit var binding: ActivityPuzzlefeedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPuzzlefeedBinding.inflate(layoutInflater)
        presenter = PuzzleFeedPresenter(this)
        getPuzzleFeed()
    }

    private fun getPuzzleFeed() {
        presenter.getPuzzleFeed("", "", 20)
    }
}