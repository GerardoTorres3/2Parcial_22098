package com.example.a2parcial_22098.Persona

import androidx.annotation.DrawableRes

data class Persona1(
    @DrawableRes val img: Int,
    val trabajo: String,
    val genero: String,
    val edad: Int
)