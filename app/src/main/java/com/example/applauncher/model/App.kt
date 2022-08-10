package com.example.applauncher

import androidx.annotation.DrawableRes
import com.example.applauncher.model.Item

class App(
    val id: Int,
    @DrawableRes val idIconMain: Int,
    val name: String,
    @DrawableRes val idIconSecond: Int
) : Item