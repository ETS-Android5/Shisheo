package com.shisheo.net.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/shisheo/net/network/Api;", "", "getPosts", "Lio/reactivex/Observable;", "", "Lcom/shisheo/net/models/Data;", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "social/api/web/post/arina/test/")
    public abstract io.reactivex.Observable<java.util.List<com.shisheo.net.models.Data>> getPosts();
}