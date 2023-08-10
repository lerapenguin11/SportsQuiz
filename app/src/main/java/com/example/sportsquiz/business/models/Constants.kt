package com.example.sportsquiz.business.models


object Constants {

    fun getQuizList() : MutableList<QuizListModelFootball> {
        val quizList = mutableListOf<QuizListModelFootball>()

        val quiz1 = QuizListModelFootball(0,"title1", "esey", 10, "football")
        quizList.add(quiz1)

        val quiz2 = QuizListModelFootball(1,"title1", "esey", 10, "football")
        quizList.add(quiz2)

        val quiz3 = QuizListModelFootball(2,"title1", "esey", 10, "football")
        quizList.add(quiz3)

        val quiz4 = QuizListModelFootball(3,"title1", "esey", 10, "football")
        quizList.add(quiz4)

        val quiz5 = QuizListModelFootball(4,"title1", "esey", 10, "football")
        quizList.add(quiz5)

        val quiz6 = QuizListModelFootball(5,"title1", "esey", 10, "football")
        quizList.add(quiz6)

        val quiz7 = QuizListModelFootball(6,"title1", "esey", 10, "football")
        quizList.add(quiz7)

        val quiz8 = QuizListModelFootball(7,"title1", "esey", 10, "football")
        quizList.add(quiz8)

        val quiz9 = QuizListModelFootball(8,"title1", "esey", 10, "football")
        quizList.add(quiz9)

        val quiz10 = QuizListModelFootball(9,"title1", "esey", 10, "football")
        quizList.add(quiz10)

        return quizList
    }

    fun getQuestionList() : MutableList<QuestionModel>{
        val questionList = mutableListOf<QuestionModel>()

        //quiz id = 0
        val question01 = QuestionModel(0, 0, "id = 0?", "option_a1", "2", "3")
        questionList.add(question01)

        val question02 = QuestionModel(1, 0, "?", "option_a1", "2", "3")
        questionList.add(question02)

        val question03 = QuestionModel(2, 0, "vopros?", "option_a1", "2", "3")
        questionList.add(question03)

        val question04 = QuestionModel(3, 0, "vopros?", "option_a1", "2", "3")
        questionList.add(question04)

        val question05 = QuestionModel(4, 0, "vopros?", "option_a1", "2", "3")
        questionList.add(question05)

        val question06 = QuestionModel(5, 0, "vopros?", "option_a1", "2", "3")
        questionList.add(question06)

        val question07 = QuestionModel(6, 0, "vopros?", "option_a1", "2", "3")
        questionList.add(question07)

        val question08 = QuestionModel(7, 0, "vopros?", "option_a1", "2", "3")
        questionList.add(question08)

        val question09 = QuestionModel(8, 0, "vopros?", "option_a1", "2", "3")
        questionList.add(question09)

        val question010 = QuestionModel(9, 0, "vopros?", "option_a1", "2", "3")
        questionList.add(question010)

        //quiz id = 1
        val question11 = QuestionModel(0, 1, "id = 1?_0", "option_a1", "2", "3")
        questionList.add(question11)

        val question12 = QuestionModel(1, 1, "id = 1?_1", "option_a1", "2", "3")
        questionList.add(question12)

        val question13 = QuestionModel(2, 1, "id = 1?_2", "option_a1", "2", "3")
        questionList.add(question13)

        val question14 = QuestionModel(3, 1, "id = 1?_3", "option_a1", "2", "3")
        questionList.add(question14)

        val question15 = QuestionModel(4, 1, "id = 1?_4", "option_a1", "2", "3")
        questionList.add(question15)

        val question16 = QuestionModel(5, 1, "id = 1?_5", "option_a1", "2", "3")
        questionList.add(question16)

        val question17 = QuestionModel(6, 1, "id = 1?_6", "option_a1", "2", "3")
        questionList.add(question17)

        val question18 = QuestionModel(7, 1, "id = 1?_7", "option_a1", "2", "3")
        questionList.add(question18)

        val question19 = QuestionModel(8, 1, "id = 1?_8", "option_a1", "2", "3")
        questionList.add(question19)

        val question110 = QuestionModel(9, 1, "id = 1?_9", "option_a1", "2", "3")
        questionList.add(question110)

        return questionList
    }
}