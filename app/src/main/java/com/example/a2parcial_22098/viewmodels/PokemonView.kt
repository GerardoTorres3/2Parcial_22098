package com.example.a2parcial_22098.viewmodels

import com.example.a2parcial_22098.R
import com.example.example.models.Pokemon

class PokemonView {
    init {}

    fun getPokeList(): ArrayList<Pokemon> {
        var pokeList: ArrayList<Pokemon> = ArrayList<Pokemon>()

        pokeList.add(Pokemon(R.drawable.pokemon01, "Spirigatito"))
        pokeList.add(Pokemon(R.drawable.pokemon02, "Fuecoco"))
        pokeList.add(Pokemon(R.drawable.pokemon03, "Quaxly"))

        return pokeList
    }
}