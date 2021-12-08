package com.shisheo.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fJ \u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0002J<\u0010\u0014\u001a\u00020\n2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fH\u0002J\u0006\u0010\u0016\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/shisheo/net/Repository;", "", "api", "Lcom/shisheo/net/network/Api;", "(Lcom/shisheo/net/network/Api;)V", "getApi", "()Lcom/shisheo/net/network/Api;", "subscription", "Lio/reactivex/disposables/Disposable;", "getRestaurantsResults", "", "restaurantsResults", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/shisheo/net/models/Data;", "noResults", "", "onRetrievePostListError", "error", "", "onRetrievePostListSuccess", "result", "subscriptionDisposable", "app_debug"})
@javax.inject.Singleton()
public final class Repository {
    private io.reactivex.disposables.Disposable subscription;
    @org.jetbrains.annotations.NotNull()
    private final com.shisheo.net.network.Api api = null;
    
    /**
     * Fetching Restaurants Data
     */
    public final void getRestaurantsResults(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.shisheo.net.models.Data>> restaurantsResults, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> noResults) {
    }
    
    private final void onRetrievePostListError(java.lang.Throwable error, androidx.lifecycle.MutableLiveData<java.lang.Integer> noResults) {
    }
    
    private final void onRetrievePostListSuccess(java.util.List<com.shisheo.net.models.Data> result, androidx.lifecycle.MutableLiveData<java.util.List<com.shisheo.net.models.Data>> restaurantsResults, androidx.lifecycle.MutableLiveData<java.lang.Integer> noResults) {
    }
    
    public final void subscriptionDisposable() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shisheo.net.network.Api getApi() {
        return null;
    }
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.shisheo.net.network.Api api) {
        super();
    }
}