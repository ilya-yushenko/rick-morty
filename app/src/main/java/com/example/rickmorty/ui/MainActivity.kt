package com.example.rickmorty.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.rickmorty.R

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    lateinit var nawController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nawController = Navigation.findNavController(this, R.id.navHostFragment)
    }
}