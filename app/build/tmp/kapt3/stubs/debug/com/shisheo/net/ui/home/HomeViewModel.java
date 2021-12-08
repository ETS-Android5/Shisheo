package com.shisheo.net.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u001c\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\"\u001a\u00020#R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f\u00a8\u0006$"}, d2 = {"Lcom/shisheo/net/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shisheo/net/Repository;", "(Lcom/shisheo/net/Repository;)V", "errorClickListener", "Landroid/view/View$OnClickListener;", "getErrorClickListener", "()Landroid/view/View$OnClickListener;", "loadingVisibility", "Landroidx/lifecycle/MutableLiveData;", "", "getLoadingVisibility", "()Landroidx/lifecycle/MutableLiveData;", "setLoadingVisibility", "(Landroidx/lifecycle/MutableLiveData;)V", "noResults", "getNoResults", "setNoResults", "postAdapter", "Lcom/shisheo/net/adapters/RestaurantsAdapter;", "getPostAdapter", "()Lcom/shisheo/net/adapters/RestaurantsAdapter;", "getRepository", "()Lcom/shisheo/net/Repository;", "restaurantsResults", "", "Lcom/shisheo/net/models/Data;", "getRestaurantsResults", "setRestaurantsResults", "getCoordinatesData", "handelResults", "", "it", "sharedViewModel", "Lcom/shisheo/net/SharedViewModel;", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.shisheo.net.adapters.RestaurantsAdapter postAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.shisheo.net.models.Data>> restaurantsResults;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> noResults;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> loadingVisibility;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener errorClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final com.shisheo.net.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.shisheo.net.adapters.RestaurantsAdapter getPostAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.shisheo.net.models.Data>> getRestaurantsResults() {
        return null;
    }
    
    public final void setRestaurantsResults(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.shisheo.net.models.Data>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getNoResults() {
        return null;
    }
    
    public final void setNoResults(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLoadingVisibility() {
        return null;
    }
    
    public final void setLoadingVisibility(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getErrorClickListener() {
        return null;
    }
    
    public final void handelResults(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shisheo.net.models.Data> it, @org.jetbrains.annotations.NotNull()
    com.shisheo.net.SharedViewModel sharedViewModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.shisheo.net.models.Data> getCoordinatesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shisheo.net.Repository getRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.shisheo.net.Repository repository) {
        super();
    }
}