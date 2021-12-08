package com.shisheo.net

import androidx.lifecycle.MutableLiveData
import com.shisheo.net.models.Data
import com.shisheo.net.network.Api
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Repository @Inject constructor(val api: Api) {

    private lateinit var subscription: Disposable

    /**
     * Fetching Restaurants Data
     */
    fun getRestaurantsResults(
        restaurantsResults: MutableLiveData<List<Data>?>,
        noResults: MutableLiveData<Int>
    ) {
        subscription = api.getRestaurants()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { result ->
                    onRetrievePostListSuccess(result, restaurantsResults, noResults)
                },
                { error -> onRetrievePostListError(error, noResults) }
            )
    }

    private fun onRetrievePostListError(
        error: Throwable?,
        noResults: MutableLiveData<Int>) {
        noResults.value = R.string.no_internet_connection
    }

    private fun onRetrievePostListSuccess(
        result: List<Data>?,
        restaurantsResults: MutableLiveData<List<Data>?>,
        noResults: MutableLiveData<Int>) {
        restaurantsResults.value = result
        noResults.value = null
    }


    fun subscriptionDisposable() {
        subscription.dispose()
    }

}