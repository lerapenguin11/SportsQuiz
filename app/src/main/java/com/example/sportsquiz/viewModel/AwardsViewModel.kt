package com.example.sportsquiz.viewModel

import android.app.Application
import android.content.Context.MODE_PRIVATE
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AwardsViewModel(application: Application) : AndroidViewModel(application)  {

    val pref = application.getSharedPreferences(PREFS_KEY_COUNT, MODE_PRIVATE)

    fun getPoints() : Int{
        return pref.getInt(PREFS_KEY_COUNT, 0)
    }

    fun usePoint() {
        val points = getPoints()
        if (points >= 0) {
            pref.edit().putInt(PREFS_KEY_COUNT, points + counterQuestion*10).apply()
            counterQuestion = 0
        }
    }

    var myCountQuestion = pref.getInt(PREFS_KEY_COUNT, 0)
        set(value) {
            field = value
            myCountQuestionLiveData.value = value
        }

    val myCountQuestionLiveData = MutableLiveData(myCountQuestion)


    var counterQuestion = 0
        set(value) {
            field = value
            counterQuestionLiveData.value = value
        }
    val counterQuestionLiveData = MutableLiveData(counterQuestion)

    fun collectCoins() {
        viewModelScope.launch {
            counterQuestion++
        }
    }

    companion object {
        private const val PREFS_KEY_COUNT = "COUNT_QUESTION"
    }
}