package com.example.loyaltyhub.ui.view

import com.example.loyaltyhub.model.User

interface ProfileView : BaseView {
    fun onServerProfileDetailsReceived(user: User)
}