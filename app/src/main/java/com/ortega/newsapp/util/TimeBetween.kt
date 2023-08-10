package com.ortega.newsapp.util

import android.os.Build
import androidx.annotation.RequiresApi
import com.ortega.newsapp.util.Constants.API_DATE_FORMAT
import java.time.Duration
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class TimeBetween {

    @RequiresApi(Build.VERSION_CODES.S)
    fun getTimeBetween(
        apiDate: String,
        apiDateFormat: String = API_DATE_FORMAT,
        localDateTime: LocalDateTime = LocalDateTime.now()
    ): String {

        val formatter = DateTimeFormatter.ofPattern(apiDateFormat)
        val apiDateTime = LocalDateTime.parse(apiDate, formatter)
        val duration = Duration.between(apiDateTime, localDateTime)

        return if (duration.toMinutes() >= 60) {
            "${duration.toHours()} h"
        } else {
            "${duration.toMinutes()} m"
        }
    }


}
