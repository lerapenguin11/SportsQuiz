package com.example.sportsquiz.presentation

import android.app.Dialog
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sportsquiz.R
import com.example.sportsquiz.business.models.QuizListModelFootball
import com.example.sportsquiz.databinding.FragmentFootballBinding
import com.example.sportsquiz.presentation.adapter.QuizListAdapter
import com.example.sportsquiz.presentation.adapter.listener.QuizListListener
import com.example.sportsquiz.utilits.replaceFragment
import com.example.sportsquiz.viewModel.LivesViewModel
import com.example.sportsquiz.viewModel.QuestionViewModel
import com.example.sportsquiz.viewModel.QuizListViewModel

class FootballFragment : Fragment(), QuizListListener {

    private var _binding : FragmentFootballBinding? = null
    private val binding get() = _binding!!
    private var mAdapterQuizList = QuizListAdapter(this)

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

    override fun quizList(list: QuizListModelFootball) {
        val viewModel : LivesViewModel = ViewModelProvider(requireActivity()).get(
            LivesViewModel::class.java)

        val dialog = Dialog(requireContext(), android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.full_screen_dialog_open_test)
        dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        dialog.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val title : TextView = dialog.findViewById(R.id.tv_title)
        val point : TextView = dialog.findViewById(R.id.tv_poins)
        val category : TextView = dialog.findViewById(R.id.tv_category)
        val questions : TextView = dialog.findViewById(R.id.tv_questions)
        val level : TextView = dialog.findViewById(R.id.tv_level)
        val close : ConstraintLayout = dialog.findViewById(R.id.bt_close)
        val play : ConstraintLayout = dialog.findViewById(R.id.bt_play)

        var countPoints = list.questions * 10

        title.text = list.title
        point.text = countPoints.toString()
        category.text = list.category
        questions.text = list.questions.toString()
        level.text = list.level
        dialog.getWindow()!!.getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.show()

        close.setOnClickListener { dialog.cancel() }

        val viewModelTest : QuestionViewModel = ViewModelProvider(requireActivity()).get(
            QuestionViewModel::class.java)

        play.setOnClickListener {
            dialog.dismiss()
            viewModel.useLife()
            viewModelTest.id = list.id
            replaceFragment(TestFragment())}
    }
}