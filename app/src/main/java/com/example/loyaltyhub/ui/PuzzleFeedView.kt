package com.example.loyaltyhub.ui

import com.example.loyaltyhub.model.PuzzleFeed

interface PuzzleFeedView  {

    fun onPuzzleFeedReceived(responseData: PuzzleFeed, totalPages:Int)

}