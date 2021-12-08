package com.shisheo.net.ui.home

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shisheo.net.R
import com.shisheo.net.Repository
import com.shisheo.net.SharedViewModel
import com.shisheo.net.adapters.RestaurantsAdapter
import com.shisheo.net.models.Data
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(val repository: Repository) : ViewModel() {

//    private val _restaurantsResults = MutableLiveData<ClickEvent<List<Data>?>>()
//    val restaurantsResults: LiveData<ClickEvent<List<Data>?>>
//        get() = _restaurantsResults

    val postAdapter = RestaurantsAdapter()
    var restaurantsResults: MutableLiveData<List<Data>?> = MutableLiveData()
    var noResults: MutableLiveData<Int> = MutableLiveData()
    var loadingVisibility: MutableLiveData<Int>? = MutableLiveData()

    val errorClickListener = View.OnClickListener {
        noResults.value = null
        loadingVisibility?.value = View.VISIBLE
        repository.getRestaurantsResults(restaurantsResults, noResults)
    }

    init {
        noResults.value = null
        loadingVisibility?.value = View.VISIBLE
        repository.getRestaurantsResults(restaurantsResults, noResults)
    }

    fun handelResults(it: List<Data>, sharedViewModel: SharedViewModel) {
        loadingVisibility?.value = View.GONE
        if (it.size > 0) {
            it.forEachIndexed { i, value ->
                value.latitude = getCoordinatesData()[i].latitude
                value.longitude = getCoordinatesData()[i].longitude
            }
            sharedViewModel.data = it
            postAdapter.updateDataList(it)
        } else noResults.value = R.string.no_results
    }

    fun getCoordinatesData(): List<Data> {
        val arrayList = ArrayList<Data>()
        arrayList.add(Data(latitude = 25.192804, longitude = 55.266805))
        arrayList.add(Data(latitude = 25.191457, longitude = 55.266709))
        arrayList.add(Data(latitude = 25.191457, longitude = 55.266130))
        return arrayList
    }

}