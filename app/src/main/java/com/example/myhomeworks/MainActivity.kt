package com.example.myhomeworks
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        val weatherAdapter = WeatherAdapter(
            listOf(
                DailyWeather("Пн", true, -23),
                DailyWeather("Вт", true, -20),
                DailyWeather("Ср", false, -15),
                DailyWeather("Чт", true, -3),
                DailyWeather("Пт", false, +6),
                DailyWeather("Сб", false, +11),
                DailyWeather("Вс", true, +20),
            )
        )

        val rvWeather = findViewById<RecyclerView>(R.id.rvWeather)
        rvWeather.adapter = weatherAdapter
    }
} 