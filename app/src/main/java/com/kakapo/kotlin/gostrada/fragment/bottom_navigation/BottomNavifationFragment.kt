package com.kakapo.kotlin.gostrada.fragment.bottom_navigation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.gostrada.R

class BottomNavifationFragment : Fragment() {

    companion object {
        fun newInstance() = BottomNavifationFragment()
    }

    private lateinit var viewModel: BottomNavifationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_navifation_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BottomNavifationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}