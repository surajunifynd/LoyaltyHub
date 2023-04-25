package com.example.loyaltyhub.ui.view

interface BaseView {

    fun onError(message: String)
    fun showLoader()
    fun hideLoader()
}