package com.example.sportsquiz.business.repos

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.sportsquiz.business.models.Constants
import com.example.sportsquiz.business.models.QuestionModel
import com.example.sportsquiz.business.models.QuizListModelFootball

class QuestionRepository() {

    private lateinit var modelQuiz : QuizListModelFootball
    private lateinit var modelQuestion : QuestionModel

    @SuppressLint("SuspiciousIndentation")
    fun getQuestionData(id : Int) : LiveData<MutableList<QuestionModel>> {
        val mutableData = MutableLiveData<MutableList<QuestionModel>>()
        val list = mutableListOf<QuestionModel>()
        val question = Constants.getQuestionList()

        for (j in question){
            if (j.idItemQuiz == id){
                val idItemQuiz = j.idItemQuiz
                val question = j.question
                val option_a = j.option_a
                val option_b = j.option_b
                val answer = j.answer

                val listQuestionModel = QuestionModel(
                    id = id,
                    idItemQuiz = idItemQuiz,
                    question = question,
                    option_a = option_a,
                    option_b = option_b,
                    answer = answer
                )
                modelQuestion = listQuestionModel
                list.add(modelQuestion)
            }
        }

        mutableData.value = list

        return mutableData
    }
}