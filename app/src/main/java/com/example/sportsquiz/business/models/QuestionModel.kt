package com.example.sportsquiz.business.models

data class QuestionModel(
    val id : Int,
    val idItemQuiz : Int,
    val question : String,
    val option_a : String,
    val option_b : String,
    val answer : String
)