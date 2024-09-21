package com.example.sample_data

import com.example.entitiy.City
import com.example.entitiy.Volunteer

fun volunteerList() = listOf(
    Volunteer(
        name = "Harish",
        email = "test@test.com",
        mobile = "1234567890",
        city = cityList().random()
    ),
    Volunteer(
        name = "Harish1",
        email = "test@test.com",
        mobile = "1234567890",
        city = cityList().random()
    )
)

fun cityList() = listOf(
    City(1,"Chennai"),
    City(2,"Vellore"),
    City(3,"Delhi")
)