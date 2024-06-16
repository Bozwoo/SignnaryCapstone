package com.bintang.signnarycapstone.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bintang.signnarycapstone.R

data class SentenceItem(val imageResId: Int, val text: String)

class SentenceAdapter (private val wordList: List<SentenceItem>) : RecyclerView.Adapter<SentenceAdapter.SentenceViewHolder>(){

    class SentenceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val sentenceImage: ImageView = itemView.findViewById(R.id.sentence_image)
        val sentenceText: TextView = itemView.findViewById(R.id.sentence_text)
        val sentenceTextBackground: ImageView = itemView.findViewById(R.id.sentence_text_background)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SentenceViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return SentenceViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SentenceViewHolder, position: Int) {
        val currentItem = sentenceList[position]
        holder.sentenceImage.setImageResource(currentItem.imageResId)
        holder.sentenceText.text = currentItem.text
    }

    override fun getItemCount() = wordList.size
    }
