package com.example.weatherapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class City(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "cityType") val cityType: String?,
    @ColumnInfo(name = "season") val season: List<String>?

    )