package com.example.sportsquiz.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sportsquiz.databinding.FragmentFootballBinding
import com.example.sportsquiz.presentation.adapter.QuizListAdapter
import com.example.sportsquiz.utilits.replaceFragment
import com.example.sportsquiz.viewModel.QuizListViewModel

class FootballFragment : Fragment() {

    private var _binding : FragmentFootballBinding? = null
    private val binding get() = _binding!!
    private var mAdapterQuizList = QuizListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFootballBinding.inflate(inflater, container, false)

        binding.rvFootballQuiz.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvFootballQuiz.adapter = mAdapterQuizList



        return binding.root
    }

    override fun onResume() {
        super.onResume()
        observeData()
        onClick()
    }

    private fun onClick() {
        binding.btArrow.setOnClickListener {
            replaceFragment(HomeFragment())
            onDestroy()
        }
    }

    private fun observeData() {
        val viewModel : QuizListViewModel = ViewModelProvider(requireActivity()).get(QuizListViewModel::class.java)

        viewModel.getResultQuiz().observe(viewLifecycleOwner, Observer {
            mAdapterQuizList.setItem(it)
        })

    }
}