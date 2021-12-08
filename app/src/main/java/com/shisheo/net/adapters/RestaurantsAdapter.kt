package com.shisheo.net.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shisheo.net.R
import com.shisheo.net.models.Data
import kotlinx.android.synthetic.main.row_restaurants.view.*


class RestaurantsAdapter :
    RecyclerView.Adapter<RestaurantsViewHolder>() {
    private lateinit var dataList: List<Data>
    private var rowIndex = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = RestaurantsViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_restaurants, parent, false)
    )

    override fun onBindViewHolder(holder: RestaurantsViewHolder, position: Int) {
        val personListModel = dataList[position]

        holder.post_image.setOnClickListener(View.OnClickListener {
            rowIndex = position
            notifyItemChanged(rowIndex)
        })

        if (rowIndex == position) {
            if (personListModel.isSelected) {
                personListModel.isSelected = false
                holder.ratingBar.visibility = View.GONE
            } else {
                personListModel.isSelected = true
                holder.ratingBar.visibility = View.VISIBLE
            }
        }

            holder.bind(personListModel)
        }

        override fun getItemCount(): Int {
            return if (::dataList.isInitialized) dataList.size else 0
        }

        fun updateDataList(data: List<Data>) {
            this.dataList = data
            notifyDataSetChanged()
        }

    }

    class RestaurantsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ratingBar = view.ratingBar
        val post_image = view.post_image
        val name_txt = view.name_txt
        val offer_txt = view.offer_txt
        val description_txt = view.description_txt
        fun bind(model: Data) {

            Glide
                .with(itemView.context)
                .load(model.image_url)
                .placeholder(R.mipmap.ic_launcher)
                .into(post_image)

            name_txt.text = model.name
            description_txt.text = model.description
            offer_txt.text = model.offer
        }
    }
