package com.example.sportsquiz.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.sportsquiz.R
import com.example.sportsquiz.databinding.FragmentResultBinding
import com.example.sportsquiz.utilits.replaceFragment
import com.example.sportsquiz.viewModel.AwardsViewModel

class ResultFragment : Fragment() {
    private var _binding : FragmentResultBinding? = null
    private val binding get() = _binding!!
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultBinding.inflate(inflater, container, false)

        val result = arguments?.getInt("result")
        val resultStr = result.toString()

        if (result == 10) {
            binding.blockWin.visibility = View.VISIBLE
        } else {
            binding.blockWrong.visibility = View.VISIBLE
        }
        binding.tvAnswerCount.text = "$resultStr/10"

        binding.btClose.setOnClickListener {
            replaceFragment(FootballFragment())
            onDestroyView()
        }

        return binding.root
    }
}