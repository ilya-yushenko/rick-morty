package com.example.rickmorty.ui.details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rickmorty.App
import com.example.rickmorty.R
import com.example.rickmorty.databinding.FragmentCharacterDetailsBinding
import com.example.rickmorty.model.Character
import com.squareup.picasso.Picasso
import javax.inject.Inject

class CharacterDetailsFragment : Fragment(R.layout.fragment_character_details) {

    private val idCharacter: Int by lazy {
        CharacterDetailsFragmentArgs.fromBundle(requireArguments()).id
    }

    private val nameCharacter: String by lazy {
        CharacterDetailsFragmentArgs.fromBundle(requireArguments()).title
    }

    @Inject
    lateinit var viewModel: CharacterDetailsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (view.context.applicationContext as App).appComponent.inject(this)
        FragmentCharacterDetailsBinding.bind(view).apply {
            titleView.text = nameCharacter
            backView.setOnClickListener {
                findNavController().popBackStack()
            }
        }
        setupObserving()
        viewModel.loadData(idCharacter)
    }

    private fun setupObserving() {
        viewModel.character.observe(viewLifecycleOwner, {
            setInfo(it)
        })
    }

    private fun setInfo(data: Character?) {
        view?.let {
            FragmentCharacterDetailsBinding.bind(it).apply {
                Picasso.with(requireContext())
                    .load(data?.image)
                    .into(imageView)

                speciesView.text = root.context.resources.getString(R.string.species, data?.species)
                genderView.text = root.context.resources.getString(R.string.gender, data?.gender)
                statusView.text = root.context.resources.getString(R.string.status, data?.status)
            }
        }
    }


}