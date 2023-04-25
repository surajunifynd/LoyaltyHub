package com.example.loyaltyhub.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loyaltyhub.model.Loyalty
import com.example.loyaltyhub.repository.LoyaltyHubRepository

class LoyaltyHubViewModel: ViewModel() {

    var loyaltyHomeData : MutableLiveData<Loyalty>? = null

    fun getLoyaltyHome(token: String, mallId: String) : LiveData<Loyalty> {
        loyaltyHomeData = LoyaltyHubRepository.getLoyaltyHubHome(token, mallId)
        return loyaltyHomeData as MutableLiveData<Loyalty>
    }
}