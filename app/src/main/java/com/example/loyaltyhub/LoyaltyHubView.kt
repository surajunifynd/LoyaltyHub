package com.example.loyaltyhub

import com.example.loyaltyhub.model.TierDetails
import com.example.loyaltyhub.model.User

interface LoyaltyHubView {
    fun onTierHomeRetrieved(list: ArrayList<TierDetails>, currentTierDetails: TierDetails?, userDetails: User?, tierBasedOn: Int)
}