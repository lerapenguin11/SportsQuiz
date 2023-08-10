package com.example.sportsquiz.viewModel

import android.app.Application
import android.content.Context.MODE_PRIVATE
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AwardsViewModel(application: Application) : AndroidViewModel(application)  {

    val pref = application.getSharedPreferences(PREFS_KEY_COUNT, MODE_PRIVATE)

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

    fun collectQuestion() {
        viewModelScope.launch {
            counterQuestion++
        }
    }

    fun saveToPrefs() {
        pref.edit()
            .putInt(PREFS_KEY_COUNT, myCountQuestion + counterQuestion)
            .apply()
        myCountQuestion = pref.getInt(PREFS_KEY_COUNT, 0)
    }

    private var check = -3

    fun check() : Int{
        viewModelScope.launch {
            check++
        }
        return check
    }

    companion object {
        private const val PREFS_KEY_COUNT = "COUNT_QUESTION"
    }
}