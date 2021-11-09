package com.example.rickmorty.ui.characters

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickmorty.model.Character
import com.example.rickmorty.model.toCharacter
import com.example.rickmorty.repository.DataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CharactersViewModel @Inject constructor(
    private val repository: DataRepository
) : ViewModel() {

    val characters = MutableLiveData<List<Character>?>()

    init {
        getCharacters()
    }

    private fun getCharacters() {
        viewModelScope.launch {
            characters.value = withContext(Dispatchers.IO) {
                repository.getCharacters().map { it.toCharacter() }
            }
        }
    }
}