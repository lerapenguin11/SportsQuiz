package com.example.sportsquiz.business.models

data class QuestionModel(
    val question : String = "",
    val option_a : String = "",
    val option_b : String = "",
    val answer : String = "",
    val timer : Long,
    val id : Long
)