package com.example.a2parcial_22098.viewmodels

import com.example.a2parcial_22098.R
import com.example.a2parcial_22098.Persona.Persona1


class PersonaView {
    init {}

    fun getPersonList(): ArrayList<Persona1> {
        var peopleList: ArrayList<Persona1> = ArrayList<Persona1>()

        peopleList.add(Persona1(R.drawable.female01, "Estudiante", "Chica", 12))
        peopleList.add(Persona1(R.drawable.male01, "Estudiante", "Chico", 10))
        peopleList.add(Persona1(R.drawable.female02, "Youtuber", "Chico", 14))
        peopleList.add(Persona1(R.drawable.male02, "Profesor", "Chico", 24))
        peopleList.add(Persona1(R.drawable.female03, "Enfermera", "Chico", 22))
        peopleList.add(Persona1(R.drawable.male03, "Pescador", "Chico", 65))
        peopleList.add(Persona1(R.drawable.female04, "Mecánico", "Chica", 21))
        peopleList.add(Persona1(R.drawable.male04, "Cocinero", "Chico", 32))
        peopleList.add(Persona1(R.drawable.male04, "Has llegado al fin de esta larga lista de entrenadores", "", 0))

        return peopleList
    }
}