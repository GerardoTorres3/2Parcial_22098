package com.example.example.models

import androidx.annotation.DrawableRes

data class Pokemon(
    @DrawableRes val img: Int,
    val nombre: String,
)
