package com.example.sportsquiz.business.models

data class QuizListModelFootball(
    val id : Int,
    val title : String = "",
    val level : String = "",
    val questions : Int,
    val category : String = "",
)
