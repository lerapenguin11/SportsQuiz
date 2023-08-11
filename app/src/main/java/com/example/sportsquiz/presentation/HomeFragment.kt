package com.example.sportsquiz.presentation

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.sportsquiz.databinding.FragmentHomeBinding
import com.example.sportsquiz.utilits.LIFE_RESTORE_TIME
import com.example.sportsquiz.utilits.replaceFragment
import com.example.sportsquiz.viewModel.AwardsViewModel
import com.example.sportsquiz.viewModel.LivesViewModel
import java.util.*

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val viewModel : AwardsViewModel = ViewModelProvider(requireActivity()).get(
            AwardsViewModel::class.java)

        binding.tvPoints.text = viewModel.myCountQuestion.toString()

        binding.boxHockey.setOnClickListener {
            if (viewModel.counterQuestionLiveData.value!! >= 1000){
                viewModel.counterQuestion = 0
                binding.tvPoints.text = "0"
            } else{
                Toast.makeText(context, "You don't have enough points!", Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        lives()
    }

    private fun lives() {
        val viewModel : LivesViewModel = ViewModelProvider(requireActivity()).get(
            LivesViewModel::class.java)

        if (viewModel.getLives() == 0){
            viewModel.startLifeRestoreTimer(binding.tvLives)
            binding.clFootball.setOnClickListener {
                Toast.makeText(context, "You don't have enough lives! Wait for the update", Toast.LENGTH_LONG).show()
            }
        } else{
            binding.tvLives.text = viewModel.getLives().toString()
            binding.clFootball.setOnClickListener {
                replaceFragment(FootballFragment())
            }
        }
    }
}