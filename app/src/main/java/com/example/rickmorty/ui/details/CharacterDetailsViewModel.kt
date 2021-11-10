package com.example.rickmorty.ui.details

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

class CharacterDetailsViewModel @Inject constructor(
    private val repository: DataRepository
) : ViewModel() {

    val character = MutableLiveData<Character?>()

    fun loadData(id: Int) {
        viewModelScope.launch {
            character.value = withContext(Dispatchers.IO) {
                repository.getDetails(id).toCharacter()
            }
        }
    }
}