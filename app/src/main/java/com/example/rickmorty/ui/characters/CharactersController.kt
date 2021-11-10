package com.example.rickmorty.ui.characters

import android.view.View
import com.airbnb.epoxy.EpoxyModel
import com.airbnb.epoxy.TypedEpoxyController
import com.example.rickmorty.R
import com.example.rickmorty.databinding.ItemCharacterBinding
import com.example.rickmorty.model.Character
import com.squareup.picasso.Picasso

class CharactersController(
    private val onClick: (Character) -> Unit
) : TypedEpoxyController<List<Character>>() {
    override fun buildModels(data: List<Character>?) {
        data?.forEach { item ->
            CharactersModel(item).addTo(this)
        }
    }

    inner class CharactersModel(private val data: Character) : EpoxyModel<View>() {

        init {
            id(data.hashCode())
        }

        override fun getDefaultLayout(): Int = R.layout.item_character

        override fun bind(view: View) {
            ItemCharacterBinding.bind(view).apply {
                Picasso.with(view.context)
                    .load(data.image)
                    .into(imageView)

                nameView.text = data.name

                root.setOnClickListener {
                    onClick(data)
                }
            }
        }

    }
}