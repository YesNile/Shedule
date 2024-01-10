package com.example.shedule.fragments

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shedule.data.Day
import com.example.shedule.data.Days
import java.time.DayOfWeek
import java.time.LocalDate
import com.example.shedule.adapters.CurrentDayAdapter
import com.example.shedule.data.ScheduleStorage
import com.example.shedule.databinding.FragmentTodayBinding

class CurrentDayFragment : Fragment() {

    private var binding: FragmentTodayBinding? = null
    private var adapter: CurrentDayAdapter = CurrentDayAdapter()

    @RequiresApi(Build.VERSION_CODES.O)
    fun getDayOfWeekSchedule(schedule: List<Day>): Day? {
        val currentDayOfWeek = when (LocalDate.now().dayOfWeek) {
            DayOfWeek.MONDAY -> Days.MONDAY
            DayOfWeek.TUESDAY -> Days.TUESDAY
            DayOfWeek.WEDNESDAY -> Days.WEDNESDAY
            DayOfWeek.THURSDAY -> Days.THURSDAY
            DayOfWeek.FRIDAY -> Days.FRIDAY
            DayOfWeek.SATURDAY -> Days.SATURDAY
            DayOfWeek.SUNDAY -> Days.SUNDAY
        }
        return schedule.find { it.ofWeek == currentDayOfWeek }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTodayBinding.inflate(inflater, container, false)
        return binding?.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        with(binding?.rViewToday) {
            this ?: return
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@CurrentDayFragment.adapter
        }

        val day = getDayOfWeekSchedule(ScheduleStorage.scheduleFirstWeek)

        if (day != null){
            adapter.submitList(day.lessons)
            binding?.dayInfo?.text = day.ofWeek.toString()
        }
        else{
            binding?.dayInfo?.text = "Сегодня пар нет"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            CurrentDayFragment().apply {}
    }
}