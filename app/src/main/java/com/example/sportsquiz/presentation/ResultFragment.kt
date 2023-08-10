package com.example.sportsquiz.presentation

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
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultBinding.inflate(inflater, container, false)

        val viewModel: AwardsViewModel = ViewModelProvider(requireActivity()).get(
            AwardsViewModel::class.java
        )

        if (viewModel.counterQuestion == 3) {
            binding.blockWin.visibility = View.VISIBLE
        } else {
            binding.blockWrong.visibility = View.VISIBLE
        }
        viewModel.counterQuestionLiveData.observe(viewLifecycleOwner) {
            binding.tvAnswerCount.text = "$it/3"
        }

        binding.btClose.setOnClickListener {
            replaceFragment(FootballFragment())
            onDestroyView()
        }

        return binding.root
    }
}