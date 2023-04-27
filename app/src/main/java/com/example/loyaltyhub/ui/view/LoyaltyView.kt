package com.example.loyaltyhub.ui.view

import com.example.loyaltyhub.model.ServerResponseData
import com.example.loyaltyhub.model.User

interface LoyaltyView: BaseView {
    fun onServerLoyaltyHubReceived(loyaltyHub: ServerResponseData)
}