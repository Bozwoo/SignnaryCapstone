package com.bintang.signnarycapstone.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bintang.signnarycapstone.R

data class WordItem(val imageResId: Int, val text: String)

class WordAdapter (private val wordList: List<WordItem>) : RecyclerView.Adapter<WordAdapter.WordViewHolder>(){

    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val wordImage: ImageView = itemView.findViewById(R.id.word_image)
        val wordText: TextView = itemView.findViewById(R.id.word_text)
        val wordTextBackground: ImageView = itemView.findViewById(R.id.word_text_background)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return WordViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val currentItem = wordList[position]
        holder.wordImage.setImageResource(currentItem.imageResId)
        holder.wordText.text = currentItem.text
    }

    override fun getItemCount() = wordList.size
    }
