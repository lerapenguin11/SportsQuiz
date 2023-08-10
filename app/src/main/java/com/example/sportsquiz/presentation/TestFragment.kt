package com.example.sportsquiz.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.sportsquiz.R
import com.example.sportsquiz.databinding.FragmentTestBinding
import com.example.sportsquiz.utilits.replaceFragment
import com.example.sportsquiz.viewModel.AwardsViewModel
import com.example.sportsquiz.viewModel.QuestionViewModel

class TestFragment : Fragment(){

    private var _binding : FragmentTestBinding? = null
    private val binding get() = _binding!!
    var checkClick = true
    var check = 1
    var position = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTestBinding.inflate(inflater, container, false)

        loadQuestions(position)

        return binding.root
    }

    @SuppressLint("SuspiciousIndentation")
    private fun loadQuestions(i : Int){
        if (position<=8){
            val viewModel : QuestionViewModel = ViewModelProvider(requireActivity()).get(
                QuestionViewModel::class.java)
            viewModel.getResulQuestion().observe(viewLifecycleOwner, Observer {questions ->
                binding.tvQuestionsTest.text = questions.get(i + 1).question
                binding.tvOptionOne.text = questions.get(i + 1).option_a
                binding.tvOptionTwo.text = questions.get(i + 1).option_b
                binding.tvOptionThree.text = questions.get(i + 1).answer
                optionsClick()
            })
            position++
            newQuestion()
            println("POSITION: " + position)
        } else{
            binding.btNext.setOnClickListener {
                replaceFragment(ResultFragment())
            }
        }

    }

    private fun newQuestion() {

        val viewModel : QuestionViewModel = ViewModelProvider(requireActivity()).get(
            QuestionViewModel::class.java)
        //TODO изменить
            binding.btNext.setOnClickListener {
                updateOptionsClick()
                loadQuestions(position)

                checkClick = true
            }
    }

    private fun updateOptionsClick() {
        binding.constraintLayout9.background = ContextCompat.getDrawable(requireContext(), R.drawable.bg_test_options)
        binding.constraintLayout10.background = ContextCompat.getDrawable(requireContext(), R.drawable.bg_test_options)
        binding.constraintLayout11.background = ContextCompat.getDrawable(requireContext(), R.drawable.bg_test_options)
        binding.ivStatusWrong.visibility = View.INVISIBLE
        binding.tvStatusWrong.visibility = View.INVISIBLE
        binding.ivStatusCorrect.visibility = View.INVISIBLE
        binding.tvStatusCorrect.visibility = View.INVISIBLE
        binding.btNext.visibility = View.INVISIBLE
    }

    private fun optionsClick() {
        val viewModel : AwardsViewModel = ViewModelProvider(requireActivity()).get(
            AwardsViewModel::class.java)
        if(check == 10) {
            /*binding.btNext.setOnClickListener {
                replaceFragment(ResultFragment())
            }*/ println(check)
        } else{
            binding.constraintLayout9.setOnClickListener {
                if (checkClick){
                    binding.constraintLayout9.background = ContextCompat.getDrawable(requireContext(), R.drawable.bg_option_wrong)
                    checkClick = false
                    binding.ivStatusWrong.visibility = View.VISIBLE
                    binding.tvStatusWrong.visibility = View.VISIBLE
                    binding.btNext.visibility = View.VISIBLE
                    check++
                }
            }
            binding.constraintLayout10.setOnClickListener {
                if (checkClick){
                    binding.constraintLayout10.background = ContextCompat.getDrawable(requireContext(), R.drawable.bg_option_wrong)
                    checkClick = false
                    binding.ivStatusWrong.visibility = View.VISIBLE
                    binding.tvStatusWrong.visibility = View.VISIBLE
                    binding.btNext.visibility = View.VISIBLE
                    check++
                }
            }
            binding.constraintLayout11.setOnClickListener {
                if (checkClick){
                    binding.constraintLayout11.background = ContextCompat.getDrawable(requireContext(), R.drawable.bg_option_win)
                    checkClick = false
                    binding.ivStatusCorrect.visibility = View.VISIBLE
                    binding.tvStatusCorrect.visibility = View.VISIBLE
                    binding.btNext.visibility = View.VISIBLE
                    check++

                    viewModel.collectQuestion()
                }
            }
        }


    }
}