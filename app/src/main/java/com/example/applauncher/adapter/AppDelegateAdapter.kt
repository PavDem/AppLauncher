package com.example.applauncher.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.applauncher.App
import com.example.applauncher.R
import com.example.applauncher.model.Item
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate


class AppDelegateAdapter:
    AbsListItemAdapterDelegate<App, Item, AppDelegateAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val iconMain = itemView.findViewById<ImageView>(R.id.icon_main)
        val textName = itemView.findViewById<TextView>(R.id.title)
        val iconSecond = itemView.findViewById<ImageView>(R.id.icon_second)
    }

    override fun isForViewType(item: Item, items: MutableList<Item>, position: Int): Boolean {
        return item is App
    }

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(item: App, holder: ViewHolder, payloads: MutableList<Any>) {
        holder.iconMain.setImageResource(item.idIconMain)
        holder.textName.text = item.name
        holder.iconSecond.setImageResource(item.idIconSecond)
    }
}