package com.example.sportsquiz.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sportsquiz.R
import com.example.sportsquiz.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    private var _binding : FragmentTestBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTestBinding.inflate(inflater, container, false)

        return binding.root
    }
}