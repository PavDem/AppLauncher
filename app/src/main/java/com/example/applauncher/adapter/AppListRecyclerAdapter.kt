package com.example.applauncher.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.applauncher.App
import com.example.applauncher.R
import com.example.applauncher.holders.AppViewHolder
import com.example.applauncher.model.Item
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate


class AppListRecyclerAdapter(private val clickListener: OnItemClickListener) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val items = mutableListOf<App>()
    //class MyHolder(var binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        return AppViewHolder(
            DataBindingUtil.inflate(inflater, R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //Проверяем какой у нас ViewHolder
        when (holder) {
            is AppViewHolder -> {
                //Вызываем метод bind(), который мы создали и передаем туда объект
                //из нашей базы данных с указанием позиции
                holder.bind(items[position])
                //Обрабатываем нажатие на весь элемент целиком(можно сделать на отдельный элемент
                //напрмер, картинку) и вызываем метод нашего листенера, который мы получаем из
                //конструктора адаптера
                //holder.itemView.item_container.setOnClickListener {
                    //clickListener.click(items[position])
                //}
            }
        }
    }

    /*fun addItems(newItems: List<Film>) {
        //val diffCallback = FilmDiffCallback(items, newFilms)
        //val diffResult = DiffUtil.calculateDiff(diffCallback)
        items.clear()
        items.addAll(newItems)
        //calculating wrong size, in need of fix
        //diffResult.dispatchUpdatesTo(this)
        //temporal workaround
        notifyDataSetChanged()
    }*/

    interface OnItemClickListener {
        fun click(app: App)
    }
}