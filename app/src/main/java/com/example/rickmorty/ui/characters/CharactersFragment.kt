package com.example.rickmorty.ui.characters

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.rickmorty.App
import com.example.rickmorty.R
import javax.inject.Inject

class CharactersFragment : Fragment(R.layout.fragment_characters) {

    @Inject
    lateinit var viewModel: CharactersViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (view.context.applicationContext as App).appComponent.inject(this)
        setupObserving()
    }

    private fun setupObserving() {
        viewModel.characters.observe(viewLifecycleOwner, {

        })
    }

}