package com.kakapo.kotlin.gostrada.fragment.reminder_info

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.gostrada.R

class ReminderInfoFragment : Fragment() {

    companion object {
        fun newInstance() = ReminderInfoFragment()
    }

    private lateinit var viewModel: ReminderInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.reminder_info_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReminderInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}