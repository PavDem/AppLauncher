package com.example.applauncher.adapter

import com.example.applauncher.model.Item
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter


class AppAdapter(): ListDelegationAdapter<List<Item>>() {
    init {
        delegatesManager.addDelegate(AppDelegateAdapter())
    }

    override fun setItems(items: List<Item>?) {
        super.setItems(items)
        notifyDataSetChanged()
    }
}