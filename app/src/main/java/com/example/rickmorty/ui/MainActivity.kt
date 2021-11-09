package com.example.rickmorty.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rickmorty.R
import com.example.rickmorty.ui.characters.CharactersFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, CharactersFragment()).commit()
    }
}