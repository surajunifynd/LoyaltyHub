package com.example.loyaltyhub.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loyaltyhub.model.ServerResponseData
import com.example.loyaltyhub.repository.LoyaltyHubRepository

class LoyaltyHubViewModel: ViewModel() {

    var loyaltyHomeData : MutableLiveData<ServerResponseData>? = null

    fun getLoyaltyHome(token: String, mallId: String) : LiveData<ServerResponseData> {
        loyaltyHomeData = LoyaltyHubRepository.getLoyaltyHub(token, mallId)
        return loyaltyHomeData as MutableLiveData<ServerResponseData>
    }
}