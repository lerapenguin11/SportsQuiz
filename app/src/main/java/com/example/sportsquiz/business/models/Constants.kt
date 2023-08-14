package com.example.sportsquiz.business.models


object Constants {

    fun getQuizList() : MutableList<QuizListModelFootball> {
        val quizList = mutableListOf<QuizListModelFootball>()

        val quiz1 = QuizListModelFootball(0,"Famous football clubs", "Easy", 10, "football")
        quizList.add(quiz1)

        val quiz2 = QuizListModelFootball(1,"The history of football", "Easy", 10, "football")
        quizList.add(quiz2)

        val quiz3 = QuizListModelFootball(2,"National teams", "Easy", 10, "football")
        quizList.add(quiz3)

        val quiz4 = QuizListModelFootball(3,"National teams 2", "Easy", 10, "football")
        quizList.add(quiz4)

        val quiz5 = QuizListModelFootball(4,"National teams 3", "Easy", 10, "football")
        quizList.add(quiz5)

        val quiz6 = QuizListModelFootball(5,"Famous football clubs 2", "Easy", 10, "football")
        quizList.add(quiz6)

        val quiz7 = QuizListModelFootball(6,"Famous football clubs 4", "Easy", 10, "football")
        quizList.add(quiz7)

        val quiz8 = QuizListModelFootball(7,"Famous football clubs 3", "Easy", 10, "football")
        quizList.add(quiz8)

        val quiz9 = QuizListModelFootball(8,"Famous football clubs", "Easy", 10, "football")
        quizList.add(quiz9)

        val quiz10 = QuizListModelFootball(9,"Famous football clubs", "Easy", 10, "football")
        quizList.add(quiz10)

        return quizList
    }

    fun getQuestionList() : MutableList<QuestionModel>{
        val questionList = mutableListOf<QuestionModel>()

        //quiz id = 0
        val question01 = QuestionModel(0, 0, "Which football club does Lionel Messi play for?", "Barcelona", "Manchester United", "PSG")
        questionList.add(question01)

        val question02 = QuestionModel(1, 0, "What is the name of the club that won the 2020 Champions League?", "Bayern Munich", "Juventus", "Liverpool")
        questionList.add(question02)

        val question03 = QuestionModel(2, 0, "Which club does Cristiano Ronaldo play\n" +
                "for?", "Manchester City", "Juventus", "Real Madrid")
        questionList.add(question03)

        val question04 = QuestionModel(3, 0, "Which club is the record winner of the Champions League?", "Barcelona",
            "Manchester United", "Real Madrid")
        questionList.add(question04)

        val question05 = QuestionModel(4, 0, "Which club does Neymar play at?",
            "PSG", "Bayern Munich", "Juventus")
        questionList.add(question05)

        val question06 = QuestionModel(5, 0, "What is the name of the club that won the English Championship in the 2019/2020 season?",
            "Manchester City", "Liverpool", "Arsenal")
        questionList.add(question06)

        val question07 = QuestionModel(6, 0, "Which club is the record winner of Serie A (Italian Championship)?",
            "Atalanta", "Juventus", "Milan")
        questionList.add(question07)

        val question08 = QuestionModel(7, 0, "Which club does Kylian Mbappe play\n" +
                "for?", "Bayern Munich", "Monaco", "PSG")
        questionList.add(question08)

        val question09 = QuestionModel(8, 0, "What is the name of the football club from Germany that won the 2020 World Club Championship?",
            "Borussia Dortmund", "Bayern Munich", "Schalke 04")
        questionList.add(question09)

        val question010 = QuestionModel(9, 0, "When was FIFA founded?", "1900", "1904", "1908")
        questionList.add(question010)

        //quiz id = 1
        val question11 = QuestionModel(0, 1, "Who won the first FIFA World Cup?",
            "Brazil", "Uruguay", "Italy")
        questionList.add(question11)

        val question12 = QuestionModel(1, 1, "In what year was the first Football Olympiad held?",
            "1896", "1900", "1904")
        questionList.add(question12)

        val question13 = QuestionModel(2, 1, "Which team became the first champion of England?",
            "Manchester United", "Liverpool", "Preston North End")
        questionList.add(question13)

        val question14 = QuestionModel(3, 1, "Who scored the fastest goal in the history of football at the World Championships?",
            "Christiano Ronaldo", "Jose Batista", "Haidar Salahi")
        questionList.add(question14)

        val question15 = QuestionModel(4, 1, " Who scored the fastest goal in the history of football at the World Championships?"
            , "Christiano Ronaldo", "Jose Batista", "Haidar Salahi")
        questionList.add(question15)

        val question16 = QuestionModel(5, 1, "Which club holds the record for the number of wins in the UEFA Champions League?",
            "Milan", "Bayern", "Real Madrid")
        questionList.add(question16)

        val question17 = QuestionModel(6, 1, "Who scored the most goals in his career?",
            "Lionel Messi", "Cristiano Ronaldo", "Pele")
        questionList.add(question17)

        val question18 = QuestionModel(7, 1, "Who coached the German national team at the 2014 World Cup?",
            "Jose Mourinho", "Joao Molina", "Joachim Lev")
        questionList.add(question18)

        val question19 = QuestionModel(8, 1, "Which country holds the record for the number of victories in the FIFA World Cup?",
            "Brazil", "Germany", "Italy")
        questionList.add(question19)

        val question110 = QuestionModel(9, 1, "Which of the following players did not receive the Golden Ball?",
            "Neymar", "Luis Figo", "Gareth Bale")
        questionList.add(question110)



        //quiz id = 2
        val question21 = QuestionModel(0, 2, "Which football club does Lionel Messi play for?", "Barcelona", "Manchester United", "PSG")
        questionList.add(question21)

        val question22 = QuestionModel(1, 2, "What is the name of the club that won the 2020 Champions League?", "Bayern Munich", "Juventus", "Liverpool")
        questionList.add(question22)

        val question23 = QuestionModel(2, 2, "Which club does Cristiano Ronaldo play\n" +
                "for?", "Manchester City", "Juventus", "Real Madrid")
        questionList.add(question23)

        val question24 = QuestionModel(3, 2, "Which club is the record winner of the Champions League?", "Barcelona",
            "Manchester United", "Real Madrid")
        questionList.add(question24)

        val question25 = QuestionModel(4, 2, "Which club does Neymar play at?",
            "PSG", "Bayern Munich", "Juventus")
        questionList.add(question25)

        val question26 = QuestionModel(5, 2, "What is the name of the club that won the English Championship in the 2019/2020 season?",
            "Manchester City", "Liverpool", "Arsenal")
        questionList.add(question26)

        val question27 = QuestionModel(6, 2, "Which club is the record winner of Serie A (Italian Championship)?",
            "Atalanta", "Juventus", "Milan")
        questionList.add(question27)

        val question28 = QuestionModel(7, 2, "Which club does Kylian Mbappe play\n" +
                "for?", "Bayern Munich", "Monaco", "PSG")
        questionList.add(question28)

        val question29 = QuestionModel(8, 2, "What is the name of the football club from Germany that won the 2020 World Club Championship?",
            "Borussia Dortmund", "Bayern Munich", "Schalke 04")
        questionList.add(question29)

        val question210 = QuestionModel(9, 2, "When was FIFA founded?", "1900", "1904", "1908")
        questionList.add(question210)

        //quiz id = 3

        val question31 = QuestionModel(0, 3, "Who won the first FIFA World Cup?",
            "Brazil", "Uruguay", "Italy")
        questionList.add(question31)

        val question32 = QuestionModel(1, 3, "In what year was the first Football Olympiad held?",
            "1896", "1900", "1904")
        questionList.add(question32)

        val question33 = QuestionModel(2, 3, "Which team became the first champion of England?",
            "Manchester United", "Liverpool", "Preston North End")
        questionList.add(question33)

        val question34 = QuestionModel(3, 3, "Who scored the fastest goal in the history of football at the World Championships?",
            "Christiano Ronaldo", "Jose Batista", "Haidar Salahi")
        questionList.add(question34)

        val question35 = QuestionModel(4, 3, " Who scored the fastest goal in the history of football at the World Championships?"
            , "Christiano Ronaldo", "Jose Batista", "Haidar Salahi")
        questionList.add(question35)

        val question36 = QuestionModel(5, 3, "Which club holds the record for the number of wins in the UEFA Champions League?",
            "Milan", "Bayern", "Real Madrid")
        questionList.add(question36)

        val question37 = QuestionModel(6, 3, "Who scored the most goals in his career?",
            "Lionel Messi", "Cristiano Ronaldo", "Pele")
        questionList.add(question37)

        val question38 = QuestionModel(7, 3, "Who coached the German national team at the 2014 World Cup?",
            "Jose Mourinho", "Joao Molina", "Joachim Lev")
        questionList.add(question38)

        val question39 = QuestionModel(8, 3, "Which country holds the record for the number of victories in the FIFA World Cup?",
            "Brazil", "Germany", "Italy")
        questionList.add(question39)

        val question310 = QuestionModel(9, 3, "Which of the following players did not receive the Golden Ball?",
            "Neymar", "Luis Figo", "Gareth Bale")
        questionList.add(question310)


        //quiz id = 4
        val question41 = QuestionModel(0, 4, "Which football club does Lionel Messi play for?", "Barcelona", "Manchester United", "PSG")
        questionList.add(question41)

        val question42 = QuestionModel(1, 4, "What is the name of the club that won the 2020 Champions League?", "Bayern Munich", "Juventus", "Liverpool")
        questionList.add(question42)

        val question43 = QuestionModel(2, 4, "Which club does Cristiano Ronaldo play\n" +
                "for?", "Manchester City", "Juventus", "Real Madrid")
        questionList.add(question43)

        val question44 = QuestionModel(3, 4, "Which club is the record winner of the Champions League?", "Barcelona",
            "Manchester United", "Real Madrid")
        questionList.add(question44)

        val question45 = QuestionModel(4, 4, "Which club does Neymar play at?",
            "PSG", "Bayern Munich", "Juventus")
        questionList.add(question45)

        val question46 = QuestionModel(5, 4, "What is the name of the club that won the English Championship in the 2019/2020 season?",
            "Manchester City", "Liverpool", "Arsenal")
        questionList.add(question46)

        val question47 = QuestionModel(6, 4, "Which club is the record winner of Serie A (Italian Championship)?",
            "Atalanta", "Juventus", "Milan")
        questionList.add(question47)

        val question48 = QuestionModel(7, 4, "Which club does Kylian Mbappe play\n" +
                "for?", "Bayern Munich", "Monaco", "PSG")
        questionList.add(question48)

        val question49 = QuestionModel(8, 4, "What is the name of the football club from Germany that won the 2020 World Club Championship?",
            "Borussia Dortmund", "Bayern Munich", "Schalke 04")
        questionList.add(question49)

        val question410 = QuestionModel(9, 4, "When was FIFA founded?", "1900", "1904", "1908")
        questionList.add(question410)

        //quiz id = 5
        val question51 = QuestionModel(0, 5, "Who won the first FIFA World Cup?",
            "Brazil", "Uruguay", "Italy")
        questionList.add(question51)

        val question52 = QuestionModel(1, 5, "In what year was the first Football Olympiad held?",
            "1896", "1900", "1904")
        questionList.add(question52)

        val question53 = QuestionModel(2, 5, "Which team became the first champion of England?",
            "Manchester United", "Liverpool", "Preston North End")
        questionList.add(question53)

        val question54 = QuestionModel(3, 5, "Who scored the fastest goal in the history of football at the World Championships?",
            "Christiano Ronaldo", "Jose Batista", "Haidar Salahi")
        questionList.add(question54)

        val question55 = QuestionModel(4, 5, " Who scored the fastest goal in the history of football at the World Championships?"
            , "Christiano Ronaldo", "Jose Batista", "Haidar Salahi")
        questionList.add(question55)

        val question56 = QuestionModel(5, 5, "Which club holds the record for the number of wins in the UEFA Champions League?",
            "Milan", "Bayern", "Real Madrid")
        questionList.add(question56)

        val question57 = QuestionModel(6, 5, "Who scored the most goals in his career?",
            "Lionel Messi", "Cristiano Ronaldo", "Pele")
        questionList.add(question57)

        val question58 = QuestionModel(7, 5, "Who coached the German national team at the 2014 World Cup?",
            "Jose Mourinho", "Joao Molina", "Joachim Lev")
        questionList.add(question58)

        val question59 = QuestionModel(8, 5, "Which country holds the record for the number of victories in the FIFA World Cup?",
            "Brazil", "Germany", "Italy")
        questionList.add(question59)

        val question510 = QuestionModel(9, 5, "Which of the following players did not receive the Golden Ball?",
            "Neymar", "Luis Figo", "Gareth Bale")
        questionList.add(question510)


        //quiz id = 6
        val question61 = QuestionModel(0, 6, "Which football club does Lionel Messi play for?", "Barcelona", "Manchester United", "PSG")
        questionList.add(question61)

        val question62 = QuestionModel(1, 6, "What is the name of the club that won the 2020 Champions League?", "Bayern Munich", "Juventus", "Liverpool")
        questionList.add(question62)

        val question63 = QuestionModel(2, 6, "Which club does Cristiano Ronaldo play\n" +
                "for?", "Manchester City", "Juventus", "Real Madrid")
        questionList.add(question63)

        val question64 = QuestionModel(3, 6, "Which club is the record winner of the Champions League?", "Barcelona",
            "Manchester United", "Real Madrid")
        questionList.add(question64)

        val question65 = QuestionModel(4, 6, "Which club does Neymar play at?",
            "PSG", "Bayern Munich", "Juventus")
        questionList.add(question65)

        val question66 = QuestionModel(5, 6, "What is the name of the club that won the English Championship in the 2019/2020 season?",
            "Manchester City", "Liverpool", "Arsenal")
        questionList.add(question66)

        val question67 = QuestionModel(6, 6, "Which club is the record winner of Serie A (Italian Championship)?",
            "Atalanta", "Juventus", "Milan")
        questionList.add(question67)

        val question68 = QuestionModel(7, 6, "Which club does Kylian Mbappe play\n" +
                "for?", "Bayern Munich", "Monaco", "PSG")
        questionList.add(question68)

        val question69 = QuestionModel(8, 6, "What is the name of the football club from Germany that won the 2020 World Club Championship?",
            "Borussia Dortmund", "Bayern Munich", "Schalke 04")
        questionList.add(question69)

        val question610 = QuestionModel(9, 6, "When was FIFA founded?", "1900", "1904", "1908")
        questionList.add(question610)

        //quiz id = 7

        val question71 = QuestionModel(0, 7, "Who won the first FIFA World Cup?",
            "Brazil", "Uruguay", "Italy")
        questionList.add(question71)

        val question72 = QuestionModel(1, 7, "In what year was the first Football Olympiad held?",
            "1896", "1900", "1904")
        questionList.add(question72)

        val question73 = QuestionModel(2, 7, "Which team became the first champion of England?",
            "Manchester United", "Liverpool", "Preston North End")
        questionList.add(question73)

        val question74 = QuestionModel(3, 7, "Who scored the fastest goal in the history of football at the World Championships?",
            "Christiano Ronaldo", "Jose Batista", "Haidar Salahi")
        questionList.add(question74)

        val question75 = QuestionModel(4, 7, " Who scored the fastest goal in the history of football at the World Championships?"
            , "Christiano Ronaldo", "Jose Batista", "Haidar Salahi")
        questionList.add(question75)

        val question76 = QuestionModel(5, 7, "Which club holds the record for the number of wins in the UEFA Champions League?",
            "Milan", "Bayern", "Real Madrid")
        questionList.add(question76)

        val question77 = QuestionModel(6, 7, "Who scored the most goals in his career?",
            "Lionel Messi", "Cristiano Ronaldo", "Pele")
        questionList.add(question77)

        val question78 = QuestionModel(7, 7, "Who coached the German national team at the 2014 World Cup?",
            "Jose Mourinho", "Joao Molina", "Joachim Lev")
        questionList.add(question78)

        val question79 = QuestionModel(8, 7, "Which country holds the record for the number of victories in the FIFA World Cup?",
            "Brazil", "Germany", "Italy")
        questionList.add(question79)

        val question710 = QuestionModel(9, 7, "Which of the following players did not receive the Golden Ball?",
            "Neymar", "Luis Figo", "Gareth Bale")
        questionList.add(question710)

        //quiz id = 8

        val question81 = QuestionModel(0, 8, "Which football club does Lionel Messi play for?", "Barcelona", "Manchester United", "PSG")
        questionList.add(question81)

        val question82 = QuestionModel(1, 8, "What is the name of the club that won the 2020 Champions League?", "Bayern Munich", "Juventus", "Liverpool")
        questionList.add(question82)

        val question83 = QuestionModel(2, 8, "Which club does Cristiano Ronaldo play\n" +
                "for?", "Manchester City", "Juventus", "Real Madrid")
        questionList.add(question83)

        val question84 = QuestionModel(3, 8, "Which club is the record winner of the Champions League?", "Barcelona",
            "Manchester United", "Real Madrid")
        questionList.add(question84)

        val question85 = QuestionModel(4, 8, "Which club does Neymar play at?",
            "PSG", "Bayern Munich", "Juventus")
        questionList.add(question85)

        val question86 = QuestionModel(5, 8, "What is the name of the club that won the English Championship in the 2019/2020 season?",
            "Manchester City", "Liverpool", "Arsenal")
        questionList.add(question86)

        val question87 = QuestionModel(6, 8, "Which club is the record winner of Serie A (Italian Championship)?",
            "Atalanta", "Juventus", "Milan")
        questionList.add(question87)

        val question88 = QuestionModel(7, 8, "Which club does Kylian Mbappe play\n" +
                "for?", "Bayern Munich", "Monaco", "PSG")
        questionList.add(question88)

        val question89 = QuestionModel(8, 8, "What is the name of the football club from Germany that won the 2020 World Club Championship?",
            "Borussia Dortmund", "Bayern Munich", "Schalke 04")
        questionList.add(question89)

        val question810 = QuestionModel(9, 8, "When was FIFA founded?", "1900", "1904", "1908")
        questionList.add(question810)

        //quiz id = 9

        val question91 = QuestionModel(0, 9, "Who won the first FIFA World Cup?",
            "Brazil", "Uruguay", "Italy")
        questionList.add(question91)

        val question92 = QuestionModel(1, 9, "In what year was the first Football Olympiad held?",
            "1896", "1900", "1904")
        questionList.add(question92)

        val question93 = QuestionModel(2, 9, "Which team became the first champion of England?",
            "Manchester United", "Liverpool", "Preston North End")
        questionList.add(question93)

        val question94 = QuestionModel(3, 9, "Who scored the fastest goal in the history of football at the World Championships?",
            "Christiano Ronaldo", "Jose Batista", "Haidar Salahi")
        questionList.add(question94)

        val question95 = QuestionModel(4, 9, " Who scored the fastest goal in the history of football at the World Championships?"
            , "Christiano Ronaldo", "Jose Batista", "Haidar Salahi")
        questionList.add(question95)

        val question96 = QuestionModel(5, 9, "Which club holds the record for the number of wins in the UEFA Champions League?",
            "Milan", "Bayern", "Real Madrid")
        questionList.add(question96)

        val question97 = QuestionModel(6, 9, "Who scored the most goals in his career?",
            "Lionel Messi", "Cristiano Ronaldo", "Pele")
        questionList.add(question97)

        val question98 = QuestionModel(7, 9, "Who coached the German national team at the 2014 World Cup?",
            "Jose Mourinho", "Joao Molina", "Joachim Lev")
        questionList.add(question98)

        val question99 = QuestionModel(8, 9, "Which country holds the record for the number of victories in the FIFA World Cup?",
            "Brazil", "Germany", "Italy")
        questionList.add(question99)

        val question910 = QuestionModel(9, 9, "Which of the following players did not receive the Golden Ball?",
            "Neymar", "Luis Figo", "Gareth Bale")
        questionList.add(question910)

        return questionList
    }
}