package com.example.sportsquiz.business.repos

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.sportsquiz.business.models.QuestionModel
import com.google.firebase.firestore.FirebaseFirestore

class QuestionRepository() {

    @SuppressLint("SuspiciousIndentation")
    fun getQuestionData(id : Int) : LiveData<MutableList<QuestionModel>> {
        val mutableData = MutableLiveData<MutableList<QuestionModel>>()
        val collectionRef = FirebaseFirestore.getInstance().collection("Quiz")
        collectionRef.get().addOnSuccessListener { querySnapshot ->
            for (documentSnapshot in querySnapshot.documents) {
                val documentId = documentSnapshot.id
                FirebaseFirestore.getInstance().collection("Quiz").document(documentId)
                    .collection("questions").whereEqualTo("id", id)
                    .get()
                    .addOnSuccessListener { _result ->
                        val listData = mutableListOf<QuestionModel>()
                        for (document in _result.documents) {
                            val answer = document.getString("answer")
                            val option_a = document.getString("option_a")
                            val timer = document.getLong("timer")
                            val option_b = document.getString("option_b")
                            val question = document.getString("question")
                            val id = document.getLong("id")
                            val resultQuestionModel = QuestionModel(
                                answer = answer!!,
                                option_a = option_a!!,
                                timer = timer!!,
                                option_b = option_b!!,
                                question = question!!,
                                id = id!!
                            )
                            listData.add(resultQuestionModel)
                        }
                        mutableData.value = listData
                        Log.i("SNAPSHOT_QUESTIONS: ", mutableData.value.toString())
                    }
             }
        }

        return mutableData
    }
}