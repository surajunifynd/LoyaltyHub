package com.example.loyaltyhub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loyaltyhub.R
import com.example.loyaltyhub.databinding.ActivityLoyaltyhubBinding

class LoyaltyHubActivity : AppCompatActivity() , LoyaltyHubView{

    private lateinit var binding: ActivityLoyaltyhubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoyaltyhubBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun loginButtonClicked(userName: String, password: String) {

    }
}