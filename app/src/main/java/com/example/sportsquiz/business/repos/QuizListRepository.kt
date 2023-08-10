package com.example.sportsquiz.business.repos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.sportsquiz.business.models.Constants
import com.example.sportsquiz.business.models.QuestionModel
import com.example.sportsquiz.business.models.QuizListModelFootball

class QuizListRepository() {

    fun getQuizListFootball() : LiveData<MutableList<QuizListModelFootball>> {
        val quizList = Constants.getQuizList()
        val mutableData = MutableLiveData<MutableList<QuizListModelFootball>>()
        val list = mutableListOf<QuizListModelFootball>()

        val question = Constants.getQuestionList()

        for (i in quizList){
            val id = i.id
            val title = i.title
            val level = i.level
            val questions = i.questions
            val category = i.category

            val listQuizModel = QuizListModelFootball(
                id = id,
                title = title,
                level = level,
                questions = questions,
                category = category
            )
            list.add(listQuizModel)
        }

        mutableData.value = list

        return mutableData
    }
}

