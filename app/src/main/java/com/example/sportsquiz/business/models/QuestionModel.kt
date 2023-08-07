package com.example.sportsquiz.business.models

import com.google.firebase.firestore.DocumentId

data class QuestionModel(
    @DocumentId
    val questionId : String,
    val answer : String,
    val option_a : String,
    val option_b : String,
    val timer : Long
)