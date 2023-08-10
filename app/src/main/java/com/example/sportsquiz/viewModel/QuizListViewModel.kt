package com.example.sportsquiz.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportsquiz.business.models.QuizListModelFootball
import com.example.sportsquiz.business.repos.QuizListRepository

class QuizListViewModel : ViewModel(){

    private val repository  = QuizListRepository()

    fun getResultQuiz() : LiveData<MutableList<QuizListModelFootball>> {
        val mutableData = MutableLiveData<MutableList<QuizListModelFootball>>()
        repository.getQuizListFootball().observeForever {list ->
            mutableData.value = list
        }

        return mutableData
    }
}
