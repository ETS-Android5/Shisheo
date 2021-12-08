package com.shisheo.net.network

import com.shisheo.net.models.Data
import io.reactivex.Observable
import retrofit2.http.GET

interface Api {

    @GET("social/api/web/post/arina/test/")
    fun getPosts(): Observable<List<Data>?>

}