package com.example.entitiy

data class Volunteer(
    val name: String,
    val email: String,
    val mobile: String,
    val city: City
)

data class City(
    val id: Int,
    val name: String
)


