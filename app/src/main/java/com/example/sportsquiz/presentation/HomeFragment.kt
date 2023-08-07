package com.example.sportsquiz.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sportsquiz.R
import com.example.sportsquiz.databinding.FragmentHomeBinding
import com.example.sportsquiz.utilits.replaceFragment

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        onClick()
    }

    private fun onClick() {
        binding.clFootball.setOnClickListener {
            replaceFragment(FootballFragment())
        }
    }
}