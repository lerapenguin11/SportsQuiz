package com.example.sportsquiz.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportsquiz.R
import com.example.sportsquiz.business.models.QuizListModel
import com.example.sportsquiz.presentation.adapter.listener.QuizListListener

class QuizListAdapter(val quizListListener: QuizListListener) : RecyclerView.Adapter<QuizListAdapter.QuizListViewHolder>(){

    private val quizList = mutableListOf<QuizListModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_test, parent, false)

        return QuizListViewHolder(view)
    }

    override fun getItemCount(): Int = quizList.size

    override fun onBindViewHolder(holder: QuizListViewHolder, position: Int) {
        val resultQuizList : QuizListModel = quizList[position]

        holder.title.text = resultQuizList.title

        holder.itemView.setOnClickListener {
            quizListListener.quizList(list = resultQuizList)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItem(resultQuizList : List<QuizListModel>){
        this.quizList.clear()
        this.quizList.addAll(resultQuizList)
        notifyDataSetChanged()
    }

    class QuizListViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val title : TextView = view.findViewById(R.id.tv_title)
    }
}