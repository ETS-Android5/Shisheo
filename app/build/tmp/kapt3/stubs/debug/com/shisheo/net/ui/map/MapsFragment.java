package com.shisheo.net.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\'\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0002\u0010!R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/shisheo/net/ui/map/MapsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "ZoomLevel", "", "getZoomLevel", "()I", "setZoomLevel", "(I)V", "adapter", "Lcom/shisheo/net/adapters/CustomInfoWindowAdapter;", "rootView", "Landroid/view/View;", "sharedViewModel", "Lcom/shisheo/net/SharedViewModel;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "onViewCreated", "view", "zoomTo", "lat", "", "lng", "(Lcom/google/android/gms/maps/GoogleMap;Ljava/lang/Double;Ljava/lang/Double;)V", "app_debug"})
public final class MapsFragment extends androidx.fragment.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.shisheo.net.adapters.CustomInfoWindowAdapter adapter;
    private android.view.View rootView;
    private com.shisheo.net.SharedViewModel sharedViewModel;
    private int ZoomLevel = 16;
    private java.util.HashMap _$_findViewCache;
    
    public final int getZoomLevel() {
        return 0;
    }
    
    public final void setZoomLevel(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    public final void zoomTo(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap, @org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    java.lang.Double lng) {
    }
    
    public MapsFragment() {
        super();
    }
}