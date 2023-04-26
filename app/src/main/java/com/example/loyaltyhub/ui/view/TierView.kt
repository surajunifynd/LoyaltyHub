package com.example.loyaltyhub.ui.view

import com.example.loyaltyhub.model.TierDetails
import com.example.loyaltyhub.model.User

interface TierView : BaseView {
    fun onTierListRetrieved(list: ArrayList<TierDetails>, totalPages: Int)

    fun onTierHomeRetrieved(list: ArrayList<TierDetails>, currentTierDetails: TierDetails?, userDetails: User?, tierBasedOn: Int)

}