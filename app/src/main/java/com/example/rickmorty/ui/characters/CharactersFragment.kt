package com.example.rickmorty.ui.characters

import android.os.Bundle
import android.view.View
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rickmorty.App
import com.example.rickmorty.R
import com.example.rickmorty.databinding.FragmentCharactersBinding
import javax.inject.Inject

class CharactersFragment : Fragment(R.layout.fragment_characters) {

    @Inject
    lateinit var viewModel: CharactersViewModel

    private val controller = CharactersController {
        findNavController().navigate(
            CharactersFragmentDirections.openCharacterDetailsFragment(it.id, it.name)
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (view.context.applicationContext as App).appComponent.inject(this)
        FragmentCharactersBinding.bind(view).apply {
            recyclerView.adapter = controller.adapter

            sortView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    query?.let { viewModel.getCharacters(it) }
                    return false
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    if (newText.isNullOrEmpty()) {
                        viewModel.getCharacters("")
                    }
                    return false
                }
            })
        }

        setupObserving()
    }

    private fun setupObserving() {
        viewModel.characters.observe(viewLifecycleOwner, { list ->
            controller.setData(list)
        })
    }

}