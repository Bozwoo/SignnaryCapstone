package com.bintang.signnarycapstone.adapters

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.compose.ui.layout.Layout
import androidx.recyclerview.widget.RecyclerView
import com.bintang.signnarycapstone.R
import com.google.android.ads.mediationtestsuite.viewmodels.ItemViewHolder

class ItemAdapter(private val itemList: List<Item>) :
        RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
                 val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
                return ItemViewHolder(itemView)
            }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = itemList[position]
    }

        override fun getItemCount() = itemList.size
        class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        }
        }