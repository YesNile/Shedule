package com.example.shedule.data

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalTime


object ScheduleStorage {
    @RequiresApi(Build.VERSION_CODES.O)
    val scheduleFirstWeek = listOf(
        Day(
            ofWeek = Days.TUESDAY,
            listOf(
                Lesson(
                    name = "ЭКОНОМИКА ПРОГРАММНОЙ ИНЖЕНЕРИИ (ЛЕК.)",
                    lecturer = "ТКАЧ Е.С",
                    cabinet = "АУД. 221 (Л.З.) (2 корпус)",
                    startTime = LocalTime.of(15, 0),
                    endTime = LocalTime.of(16, 30)
                ),
                Lesson(
                    name = null,
                    lecturer = null,
                    cabinet = null,
                    startTime = null,
                    endTime = null
                ),
                Lesson(
                    name = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ЛЕК.)",
                    lecturer = "БАРАБАНЩИКОВ И.В.",
                    cabinet = "АУД. 413",
                    startTime = LocalTime.of(18, 20),
                    endTime = LocalTime.of(19, 50)
                ),
                Lesson(
                    name = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ЛЕК.)",
                    lecturer = "БАРАБАНЩИКОВ И.В.",
                    cabinet = "АУД. 413",
                    startTime = LocalTime.of(19, 55),
                    endTime = LocalTime.of(21, 25)
                ),
            )
        ),
        Day(
            ofWeek = Days.WEDNESDAY,
            listOf(
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ",
                    lecturer = "Андрей и Влад",
                    cabinet = "АУД. 200",
                    startTime = LocalTime.of(18, 20),
                    endTime = LocalTime.of(19, 50)
                ),
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ",
                    lecturer = "Андрей и Влад",
                    cabinet = "АУД. 200",
                    startTime = LocalTime.of(19, 55),
                    endTime = LocalTime.of(21, 25)
                ),
            )
        ),
        Day(
            ofWeek = Days.THURSDAY,
            listOf(
                Lesson(
                    name = "АНАЛИЗ ДАННЫХ (ЛЕК.)",
                    lecturer = "АЛЮКОВ С.В",
                    cabinet = "А-13",
                    startTime = LocalTime.of(16, 40),
                    endTime = LocalTime.of(18, 10)
                ),
                Lesson(
                    name = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ПР.)",
                    lecturer = "БАРАБАНЩИКОВ И.В",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(18, 20),
                    endTime = LocalTime.of(19, 50)
                ),
                Lesson(
                    name = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ПР.)",
                    lecturer = "БАРАБАНЩИКОВ И.В",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(19, 55),
                    endTime = LocalTime.of(21, 25)
                ),
            )

        ),
        Day(
            ofWeek = Days.FRIDAY,

            listOf(
                Lesson(
                    name = "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)",
                    lecturer = "ПАВЛИЧЕНКОВ Е.А",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(19, 55),
                    endTime = LocalTime.of(21, 25)
                ),
            )
        ),
        Day(
            ofWeek = Days.SATURDAY,

            listOf(
                Lesson(
                    name = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ЛЕК.)",
                    lecturer = "ВЕРИГИН Н.В.",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(9, 40),
                    endTime = LocalTime.of(11, 10)
                ),
                Lesson(
                    name = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ПР.)",
                    lecturer = "ВЕРИГИН Н.В.",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(11, 20),
                    endTime = LocalTime.of(12, 50)
                ),
                Lesson(
                    name = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ПР.)",
                    lecturer = "ВЕРИГИН Н.В.",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(13, 15),
                    endTime = LocalTime.of(14, 45)
                ),
                Lesson(
                    name = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ПР.)",
                    lecturer = "ВЕРИГИН Н.В.",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(15, 0),
                    endTime = LocalTime.of(16, 30)
                ),
            )
        ),
    )

    @RequiresApi(Build.VERSION_CODES.O)
    val scheduleSecondWeek = listOf(
        Day(
            ofWeek = Days.TUESDAY,

            listOf(
                Lesson(
                    name = "ЭКОНОМИКА ПРОГРАММНОЙ ИНЖЕНЕРИИ (ПР.)",
                    lecturer = "ТКАЧ Е.С",
                    cabinet = "АУД. 304(2 корпус)",
                    startTime = LocalTime.of(16, 40),
                    endTime = LocalTime.of(18, 10)
                ),
                Lesson(
                    name = "ЭКОНОМИКА ПРОГРАММНОЙ ИНЖЕНЕРИИ (ПР.)",
                    lecturer = "ТКАЧ Е.С",
                    cabinet = "АУД. 304(2 корпус)",
                    startTime = LocalTime.of(18, 20),
                    endTime = LocalTime.of(19, 50)
                ),
            )
        ),
        Day(
            ofWeek = Days.WEDNESDAY,

            listOf(
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ЛЕК.)",
                    lecturer = "Андрей и Влад",
                    cabinet = "АУД. 200",
                    startTime = LocalTime.of(18, 20),
                    endTime = LocalTime.of(19, 50)
                ),
                Lesson(
                    name = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ПР.)",
                    lecturer = "Андрей и Влад",
                    cabinet = "АУД. 200",
                    startTime = LocalTime.of(19, 55),
                    endTime = LocalTime.of(21, 25)
                ),
            )
        ),
        Day(
            ofWeek = Days.THURSDAY,

            listOf(
                Lesson(
                    name = "АНАЛИЗ ДАННЫХ (ПР.)",
                    lecturer = "АЛЮКОВ С.В",
                    cabinet = "АУД. 132Б",
                    startTime = LocalTime.of(16, 40),
                    endTime = LocalTime.of(18, 10)
                ),
                Lesson(
                    name = "АНАЛИЗ ДАННЫХ (ПР.)",
                    lecturer = "АЛЮКОВ С.В",
                    cabinet = "АУД. 132Б",
                    startTime = LocalTime.of(18, 20),
                    endTime = LocalTime.of(19, 50)
                ),
                Lesson(
                    name = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ПР.)",
                    lecturer = "БАРАБАНЩИКОВ И.В",
                    cabinet = "АУД. 132А",
                    startTime = LocalTime.of(19, 55),
                    endTime = LocalTime.of(21, 25)
                ),
            )

        ),
        Day(
            ofWeek = Days.FRIDAY,

            listOf(
                Lesson(
                    name = "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ЛЕК.)",
                    lecturer = "ПАВЛИЧЕНКОВ Е.А",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(18, 20),
                    endTime = LocalTime.of(19, 50)
                ),
                Lesson(
                    name = "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)",
                    lecturer = "ПАВЛИЧЕНКОВ Е.А",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(19, 55),
                    endTime = LocalTime.of(21, 25)
                ),
            )

        ),
        Day(
            ofWeek = Days.SATURDAY,

            listOf(
                Lesson(
                    name = "ТЕСТИРОВАНИЕ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ (ПР.)",
                    lecturer = "БУЛАВИН Р.С",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(9, 40),
                    endTime = LocalTime.of(11, 10)
                ),
                Lesson(
                    name = "ТЕСТИРОВАНИЕ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ (ПР.)",
                    lecturer = "БУЛАВИН Р.С",
                    cabinet = "АУД. 132",
                    startTime = LocalTime.of(11, 20),
                    endTime = LocalTime.of(12, 50)
                ),
            )
        ),
    )
}