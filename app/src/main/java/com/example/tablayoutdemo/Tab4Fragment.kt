package com.example.tablayoutdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.net.URI


class Tab4Fragment : Fragment() {

    interface OnFragment4InteractionListener
    {
        fun onFragment4Interaction(uri:URI)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab4, container, false)
    }

}