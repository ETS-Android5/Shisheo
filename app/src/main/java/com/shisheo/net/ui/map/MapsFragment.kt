package com.shisheo.net.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.shisheo.net.R
import com.shisheo.net.SharedViewModel
import com.shisheo.net.adapters.CustomInfoWindowAdapter


class MapsFragment : Fragment(), OnMapReadyCallback {

    private lateinit var adapter: CustomInfoWindowAdapter
    private lateinit var rootView: View
    private lateinit var sharedViewModel: SharedViewModel
    var ZoomLevel = 16

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rootView = inflater.inflate(R.layout.fragment_maps, container, false)
        activity?.let {
            sharedViewModel =
                ViewModelProvider(it).get(SharedViewModel::class.java)
        }

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         adapter = CustomInfoWindowAdapter(requireContext())

        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {

        googleMap.setInfoWindowAdapter(adapter)

        sharedViewModel.data.forEach { model ->
            val markerOpt = MarkerOptions()
            markerOpt.position(
                LatLng(model.latitude, model.longitude))
//                .icon(BitmapDescriptorFactory.fromResource(R.drawable.place))

            googleMap.addMarker(markerOpt)?.tag = model
            zoomTo(googleMap, model.latitude, model.longitude)
        }
    }

    fun zoomTo(googleMap: GoogleMap, lat: Double?, lng: Double?) {
        if (lat != null && lng != null) {
            val cameraPosition = CameraPosition.Builder()
                .target(LatLng(lat, lng))
                .zoom(ZoomLevel.toFloat())
                .build()
            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
        }
    }

}