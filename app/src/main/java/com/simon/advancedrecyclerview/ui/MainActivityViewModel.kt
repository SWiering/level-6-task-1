package com.simon.advancedrecyclerview.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.simon.advancedrecyclerview.model.ColorItem
import com.simon.advancedrecyclerview.services.ColorRepository

class MainActivityViewModel : ViewModel(){
    private val colorRepository = ColorRepository()

    val colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }
}
