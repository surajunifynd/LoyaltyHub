package com.example.loyaltyhub.ui.view

import com.example.loyaltyhub.model.PuzzleFeed

interface PuzzleFeedView  {

    fun onPuzzleFeedReceived(responseData: PuzzleFeed, totalPages:Int)

}