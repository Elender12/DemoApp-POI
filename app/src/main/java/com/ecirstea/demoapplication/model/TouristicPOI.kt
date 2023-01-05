package com.ecirstea.demoapplication.model

data class TouristicPOI(
    val id: Int,
    val title: String,
    val geoCoordinates: Coordinate,
    val image: String
)