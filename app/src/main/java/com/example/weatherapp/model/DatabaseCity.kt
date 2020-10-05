package com.example.weatherapp.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(City::class), version = 1)
abstract class DatabaseCity : RoomDatabase() {
    abstract fun userDao(): CityDao
}