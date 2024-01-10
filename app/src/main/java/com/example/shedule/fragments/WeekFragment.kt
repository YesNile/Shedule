package com.example.shedule.fragments

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shedule.adapters.WeekAdapter
import com.example.shedule.data.ScheduleStorage
import com.example.shedule.databinding.FragmentWeekBinding

class WeekFragment : Fragment() {

    private var binding: FragmentWeekBinding? = null
    private var adapter: WeekAdapter = WeekAdapter()
    @RequiresApi(Build.VERSION_CODES.O)
    private val firstWeek = ScheduleStorage.scheduleFirstWeek
    @RequiresApi(Build.VERSION_CODES.O)
    private val secondWeek = ScheduleStorage.scheduleSecondWeek

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWeekBinding.inflate(inflater, container, false)
        return binding?.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding?.rViewWeek) {
            this ?: return
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@WeekFragment.adapter
        }
        adapter.submitList(firstWeek)

        binding?.changeWeekButton?.setOnClickListener {
            when (binding?.dayInfo?.text) {
                "Первая неделя" ->  {
                    binding?.dayInfo?.text = "Вторая неделя"
                    adapter.submitList(secondWeek)
                }
                "Вторая неделя" -> {
                    binding?.dayInfo?.text = "Первая неделя"
                    adapter.submitList(firstWeek)
                }
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            WeekFragment().apply {}
    }
}