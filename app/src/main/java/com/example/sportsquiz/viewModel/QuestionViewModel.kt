package com.example.sportsquiz.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportsquiz.business.models.QuestionModel
import com.example.sportsquiz.business.repos.QuestionRepository
import kotlinx.coroutines.launch

class QuestionViewModel : ViewModel() {

    private val repository = QuestionRepository()

    fun getResulQuestion() : LiveData<MutableList<QuestionModel>> {
        val mutableData = MutableLiveData<MutableList<QuestionModel>>()
        repository.getQuestionData(updateId()).observeForever { list ->
            mutableData.value = list
        }

        return mutableData
    }
    var id = 0
    fun updateId() : Int{
        viewModelScope.launch {
            id++
        }
        return id
    }
}