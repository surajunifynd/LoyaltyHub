package com.example.loyaltyhub.ui.view

import com.example.loyaltyhub.model.SpinWheelFeed

interface SpinWheelFeedView: BaseView {

    fun onSpinWheelFeedReceived(responseData: SpinWheelFeed, totalPages: Int)
}