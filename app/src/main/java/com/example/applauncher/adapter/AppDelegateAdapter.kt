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
        val icon = itemView.findViewById<ImageView>(R.id.icon)
        val textName = itemView.findViewById<TextView>(R.id.text_name)
        val textDesc = itemView.findViewById<TextView>(R.id.text_desc)
    }

    override fun isForViewType(item: Item, items: MutableList<Item>, position: Int): Boolean {
        return item is App
    }

    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(item: App, holder: ViewHolder, payloads: MutableList<Any>) {
        holder.icon.setImageResource(item.idIcon)
        holder.textName.text = item.name
        holder.textDesc.text = item.desc
    }
}