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
import com.bintang.signnarycapstone.adapters.NumberAdapter
import java.util.zip.Inflater

class NumberFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var numberAdapter: NumberAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_number, container, false)
        recyclerView = rootView.findViewById(R.id.recyclerView)

        val layoutManager = GridLayoutManager(context, 2)
        recyclerView.layoutManager = layoutManager

        val numberList = getNumberList()
        numberAdapter = NumberAdapter(numberList)
        recyclerView.adapter = numberAdapter

        return rootView
    }

    private fun getNumberList(): List<NumberItem> {

        return listOf(
            NumberItem(R.drawable.buttonshape, "0"),
            NumberItem(R.drawable.buttonshape, "1"),
            NumberItem(R.drawable.buttonshape, "2"),
            NumberItem(R.drawable.buttonshape, "3"),
            NumberItem(R.drawable.buttonshape, "4"),
            NumberItem(R.drawable.buttonshape, "5"),
            NumberItem(R.drawable.buttonshape, "6"),
            NumberItem(R.drawable.buttonshape, "7"),
            NumberItem(R.drawable.buttonshape, "8"),
            NumberItem(R.drawable.buttonshape, "9")
            )
    }
}