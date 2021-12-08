package com.shisheo.net

import androidx.lifecycle.ViewModel
import com.shisheo.net.models.Data
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(val repository: Repository): ViewModel() {
    lateinit var data : List<Data>

    override fun onCleared() {
        super.onCleared()
        repository.subscriptionDisposable()
    }
}