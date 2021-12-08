package com.shisheo.net.utils

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import dagger.hilt.android.HiltAndroidApp
import io.github.inflationx.calligraphy3.CalligraphyConfig
import io.github.inflationx.calligraphy3.CalligraphyInterceptor
import io.github.inflationx.viewpump.ViewPump

@HiltAndroidApp
class AppClass : Application() {

    override fun onCreate() {
        super.onCreate()
        ViewPump.init(
            ViewPump.builder()
            .addInterceptor(
                CalligraphyInterceptor(
                    CalligraphyConfig.Builder()
                .setDefaultFontPath("font/tajawal.ttf")
                .build())
            ).build())
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}