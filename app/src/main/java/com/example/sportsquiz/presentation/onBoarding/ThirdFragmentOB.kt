package com.example.sportsquiz.presentation.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sportsquiz.databinding.FragmentThirdBinding

class ThirdFragmentOB : Fragment() {
    private var _binding : FragmentThirdBinding? = null
    private val binding get() = _binding!!
    //Второй фрагмент onBoarding Sport Quiz

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)

        binding.imageView9.visibility = View.VISIBLE
        binding.textView14.visibility = View.VISIBLE

        return binding.root
    }
}