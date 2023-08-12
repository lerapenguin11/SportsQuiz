package com.example.sportsquiz.presentation.onBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sportsquiz.R
import com.example.sportsquiz.databinding.FragmentSecondBinding

class SecondFragmentOB : Fragment() {
    private var _binding : FragmentSecondBinding? = null
    private val binding get() = _binding!!

    // Третий фрагмент onBoarding Sport Quiz

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        return binding.root
    }
}