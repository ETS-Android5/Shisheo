package com.shisheo.net.adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import com.shisheo.net.R
import com.shisheo.net.models.Data
import kotlinx.android.synthetic.main.row_restaurants.view.*
import javax.sql.DataSource


class CustomInfoWindowAdapter(val context: Context) : GoogleMap.InfoWindowAdapter {
    override fun getInfoContents(p0: Marker): View? {
        return null
    }

    override fun getInfoWindow(marker: Marker): View {
        val li = LayoutInflater.from(context)
        val rootView = li.inflate(R.layout.row_infowindow, null)

        val infoWindowData: Data? = marker.tag as Data?
        rootView.name_txt.setText(infoWindowData?.name)
        rootView.description_txt.setText(infoWindowData?.description)
        rootView.offer_txt.setText(infoWindowData?.offer)

        Glide.with(context)
            .load(infoWindowData?.image_url)
            .listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    p0: GlideException?,
                    p1: Any?,
                    p2: com.bumptech.glide.request.target.Target<Drawable>,
                    p3: Boolean
                ): Boolean {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onResourceReady(
                    p0: Drawable?,
                    p1: Any?,
                    target: com.bumptech.glide.request.target.Target<Drawable>?,
                    dataSource: com.bumptech.glide.load.DataSource?,
                    isFromMemoryCache: Boolean
                ): Boolean {
                    if (marker.isInfoWindowShown) {

                        marker.hideInfoWindow()
                        marker.showInfoWindow()
                    }
                    //do something when picture already loaded
                    return false
                }
            })
            .into(rootView.post_image)
        return rootView
    }
}
