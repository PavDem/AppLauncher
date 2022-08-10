package com.example.applauncher.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.applauncher.App
import com.example.applauncher.R

class AppViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    //Привязываем View из layout к переменным
    private val title = itemView.findViewById<TextView>(R.id.title)
    private val iconMain = itemView.findViewById<ImageView>(R.id.icon_main)
    private val iconSecond = itemView.findViewById<ImageView>(R.id.icon_second)

    //В этом методе кладем данные из Film в наши View
    fun bind(app: App) {
        //Устанавливаем заголовок
        title.text = app.name
        //Устанавливаем постер
        iconMain.setImageResource(app.idIconMain)
    }
}