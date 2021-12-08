package com.shisheo.net;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/shisheo/net/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/shisheo/net/Repository;", "(Lcom/shisheo/net/Repository;)V", "data", "", "Lcom/shisheo/net/models/Data;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getRepository", "()Lcom/shisheo/net/Repository;", "onCleared", "", "app_debug"})
public final class SharedViewModel extends androidx.lifecycle.ViewModel {
    public java.util.List<com.shisheo.net.models.Data> data;
    @org.jetbrains.annotations.NotNull()
    private final com.shisheo.net.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.shisheo.net.models.Data> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shisheo.net.models.Data> p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shisheo.net.Repository getRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public SharedViewModel(@org.jetbrains.annotations.NotNull()
    com.shisheo.net.Repository repository) {
        super();
    }
}