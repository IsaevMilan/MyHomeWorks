package com.example.myhomeworks

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView




class WeatherViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val rootLayout: LinearLayout = itemView.findViewById(R.id.rootLayout)
    private val tvDay: TextView = itemView.findViewById(R.id.tvDay)
    private val ivClouds: ImageView = itemView.findViewById(R.id.ivClouds)
    private val tvTemperature: TextView = itemView.findViewById(R.id.tvTemperature)

    fun bind(item: DailyWeather) {
        val temp = item.temperature
        val tempString =
            if (temp > 0) R.string.plus_temperature
            else R.string.minus_temperature
        val tempColor = when {
            temp < -20 -> R.color.less_then_minus_20
            temp in -20..-15 -> R.color.purple_200
            temp in -14..-10 -> R.color.purple_700
            temp in -9..9 -> R.color.purple_500
            temp in 10..14 -> R.color.purple_500
            temp in 15..20 -> R.color.teal_700
            else -> R.color.teal_200

        }
        val cloudsIcon = if (item.clouds) androidx.core.R.drawable.notification_bg else R.drawable.if_weather_3_2682848_90785

        tvDay.text = item.day
        ivClouds.setImageResource(cloudsIcon)
        tvTemperature.text = itemView.context.getString(tempString, temp)
        rootLayout.setBackgroundColor(itemView.context.getColor(tempColor))
    }
} 