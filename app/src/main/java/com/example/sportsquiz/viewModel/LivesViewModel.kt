package com.example.sportsquiz.viewModel

import android.app.Application
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.CountDownTimer
import android.widget.TextView
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import java.util.*

class LivesViewModel(application: Application) : AndroidViewModel(application){

    private val sharedPreferences: SharedPreferences =
        application.getSharedPreferences(LIVES_KEY, MODE_PRIVATE)

    companion object {
        private const val LIVES_KEY = "lives"
        private const val LAST_LIFE_UPDATE_KEY = "last_life_update"

        private const val MAX_LIVES = 3
        private const val LIFE_RESTORE_TIME = 3600000 // 1 час в миллисекундах
    }

    fun getLives(): Int {
        return sharedPreferences.getInt(LIVES_KEY, MAX_LIVES)
    }

    fun useLife() {
        val lives = getLives()
        if (lives > 0) {
            sharedPreferences.edit().putInt(LIVES_KEY, lives - 1).apply()
            saveLastLifeUpdateTime(System.currentTimeMillis())
        }
    }

    fun startLifeRestoreTimer(lifeTextView: TextView) {
        val lastUpdate = sharedPreferences.getLong(LAST_LIFE_UPDATE_KEY, -1)
        if (lastUpdate == -1L) {
            saveLastLifeUpdateTime(System.currentTimeMillis())
            return
        }

        val elapsedTime = System.currentTimeMillis() - lastUpdate
        val remainingTime = LIFE_RESTORE_TIME - elapsedTime

        if (remainingTime <= 0) {
            restoreLives()
        } else {
            object : CountDownTimer(remainingTime, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    val seconds = millisUntilFinished / 1000 % 60
                    val minutes = millisUntilFinished / (1000 * 60) % 60

                    lifeTextView.text = String.format(
                        Locale.getDefault(),
                        "%02d:%02d",
                        minutes,
                        seconds
                    )
                }

                override fun onFinish() {
                    restoreLives()
                }
            }.start()
        }
    }

    private fun restoreLives() {
        val lives = getLives()
        if (lives < MAX_LIVES) {
            sharedPreferences.edit().putInt(LIVES_KEY, lives + 1).apply()
        }
        saveLastLifeUpdateTime(System.currentTimeMillis())
    }

    private fun saveLastLifeUpdateTime(time: Long) {
        sharedPreferences.edit().putLong(LAST_LIFE_UPDATE_KEY, time).apply()
    }
}

    /*private val sharedPreferences: SharedPreferences by lazy {
        application.getSharedPreferences(LIVES_KEY, MODE_PRIVATE)
    }

    companion object {
        private const val LIVES_KEY = "lives"
        private const val LAST_LIFE_TIME_KEY = "last_life_time"
        private const val MAX_LIVES = 3
        const val LIFE_RESTORE_TIME = 3600000 // 1 час в миллисекундах
    }

    fun getLives(): Int {
        return sharedPreferences.getInt(LIVES_KEY, MAX_LIVES)
    }

    val countLives = MutableLiveData(getLives())

    //
    fun useLife() {
        val lives = getLives()
        if (lives > 0) {
            sharedPreferences.edit().putInt(LIVES_KEY, lives - 1).apply()
            saveLastLifeTime(System.currentTimeMillis())
        }else{
            restoreLives()
        }
    }

    fun restoreLives() {
        val lastLifeTime = sharedPreferences.getLong(LAST_LIFE_TIME_KEY, -1)
        if (lastLifeTime != -1L) {
            val currentTime = System.currentTimeMillis()
            val elapsedTime = currentTime - lastLifeTime
            val additionalLives = (elapsedTime / LIFE_RESTORE_TIME).toInt()

            if (additionalLives > 0) {
                val currentLives = getLives()
                val totalLives = currentLives + additionalLives
                val restoredLives = if (totalLives > MAX_LIVES) MAX_LIVES else totalLives
                sharedPreferences.edit().putInt(LIVES_KEY, restoredLives).apply()
            }
        }
    }

    fun startLifeRestoreTimer(lifeTextView: TextView) {
        val lastUpdate = sharedPreferences.getLong(LAST_LIFE_UPDATE_KEY, -1)
        if (lastUpdate == -1L) {
            saveLastLifeUpdateTime(System.currentTimeMillis())
            return
        }

        val elapsedTime = System.currentTimeMillis() - lastUpdate
        val remainingTime = LIFE_RESTORE_TIME - elapsedTime

        if (remainingTime <= 0) {
            restoreLives()
        } else {
            object : CountDownTimer(remainingTime, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    val seconds = millisUntilFinished / 1000 % 60
                    val minutes = millisUntilFinished / (1000 * 60) % 60
                    val hours = millisUntilFinished / (1000 * 60 * 60) % 24

                    lifeTextView.text = String.format(
                        Locale.getDefault(),
                        "%d:%02d:%02d",
                        hours,
                        minutes,
                        seconds
                    )
                }

                override fun onFinish() {
                    restoreLives()
                }
            }.start()
        }
    }


    private fun saveLastLifeTime(time: Long) {
        sharedPreferences.edit().putLong(LAST_LIFE_TIME_KEY, time).apply()
    }*/