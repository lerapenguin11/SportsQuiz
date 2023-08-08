package com.example.sportsquiz.business.repos

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.sportsquiz.business.models.QuizListModel
import com.google.firebase.firestore.FirebaseFirestore

class QuizListRepository() {

    @SuppressLint("SuspiciousIndentation")
    fun getQuizData() : LiveData<MutableList<QuizListModel>> {
        val mutableData = MutableLiveData<MutableList<QuizListModel>>()
        FirebaseFirestore.getInstance().collection("Quiz").get()
            .addOnSuccessListener { _result ->
                val listData = mutableListOf<QuizListModel>()
                for (document in _result) {
                    val title = document.getString("title")
                    val level = document.getString("level")
                    val questions = document.getLong("questions")
                    val category = document.getString("category")
                    val id = document.getString("id")
                    val resultQuizListModel = QuizListModel(
                         title = title!!,
                        level = level!!,
                        questions = questions!!,
                        category = category!!
                    )
                    listData.add(resultQuizListModel)
                }
                mutableData.value = listData
                Log.i("SNAPSHOT: ", mutableData.value.toString())
            }

        return mutableData
    }
}

