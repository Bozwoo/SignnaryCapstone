package com.bintang.signnarycapstone.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bintang.signnarycapstone.R
import com.bintang.signnarycapstone.adapters.AbjadAdapter
import com.bintang.signnarycapstone.adapters.AbjadItem
import java.util.zip.Inflater

class AbjadFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var abjadAdapter: AbjadAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_abjad, container, false)
        recyclerView = rootView.findViewById(R.id.recyclerView)

        val layoutManager = GridLayoutManager(context, 2)
        recyclerView.layoutManager = layoutManager

        val abjadList = getAbjadList()
        abjadAdapter = AbjadAdapter(abjadList)
        recyclerView.adapter = abjadAdapter

        return rootView
    }

    private fun getAbjadList(): List<AbjadItem> {

        return listOf(
            AbjadItem(R.drawable.buttonshape, "A"),
            AbjadItem(R.drawable.buttonshape, "B"),
            AbjadItem(R.drawable.buttonshape, "C"),
            AbjadItem(R.drawable.buttonshape, "D"),
            AbjadItem(R.drawable.buttonshape, "E"),
            AbjadItem(R.drawable.buttonshape, "F"),
            AbjadItem(R.drawable.buttonshape, "G"),
            AbjadItem(R.drawable.buttonshape, "H"),
            AbjadItem(R.drawable.buttonshape, "I"),
            AbjadItem(R.drawable.buttonshape, "J"),
            AbjadItem(R.drawable.buttonshape, "K"),
            AbjadItem(R.drawable.buttonshape, "L"),
            AbjadItem(R.drawable.buttonshape, "M"),
            AbjadItem(R.drawable.buttonshape, "N"),
            AbjadItem(R.drawable.buttonshape, "O"),
            AbjadItem(R.drawable.buttonshape, "P"),
            AbjadItem(R.drawable.buttonshape, "Q"),
            AbjadItem(R.drawable.buttonshape, "R"),
            AbjadItem(R.drawable.buttonshape, "S"),
            AbjadItem(R.drawable.buttonshape, "T"),
            AbjadItem(R.drawable.buttonshape, "U"),
            AbjadItem(R.drawable.buttonshape, "V"),
            AbjadItem(R.drawable.buttonshape, "W"),
            AbjadItem(R.drawable.buttonshape, "X"),
            AbjadItem(R.drawable.buttonshape, "Y"),
            AbjadItem(R.drawable.buttonshape, "Z")
        )
    }
}