package com.example.shedule.data

import java.time.LocalTime

data class Lesson(
    val name: String?,
    val lecturer: String?,
    val cabinet: String?,
    val startTime: LocalTime?,
    val endTime: LocalTime?
){
    constructor(name: String) : this(name,
        null,
        null,
        null,
        null)
}
