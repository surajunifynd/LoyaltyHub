package com.example.loyaltyhub.ui.view

import com.example.loyaltyhub.model.PuzzleFeed

interface PuzzleFeedView : BaseView {

    fun onPuzzleFeedReceived(responseData: PuzzleFeed, totalPages:Int)

}