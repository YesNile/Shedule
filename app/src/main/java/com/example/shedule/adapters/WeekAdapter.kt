package com.example.shedule.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shedule.data.Day
import com.example.shedule.databinding.DayOfWeekItemBinding

class WeekAdapter : RecyclerView.Adapter<WeekAdapter.WeekViewHolder>(){
    class WeekViewHolder (private val binding: DayOfWeekItemBinding) :RecyclerView.ViewHolder(binding.root) {

        private var adapter : CurrentDayAdapter = CurrentDayAdapter()

        fun bind(day: Day) = with(binding) {
            binding.dayOfWeekRecyclerView.adapter = adapter
            binding.dayOfWeekRecyclerView.layoutManager = LinearLayoutManager(binding.root.context)
            adapter.submitList(day.lessons)
            binding.dayOfWeek.text = day.ofWeek.toString()
        }
    }

    private val list: MutableList<Day> = mutableListOf()

    override fun onBindViewHolder(holder: WeekViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DayOfWeekItemBinding.inflate(inflater, parent, false)
        return WeekViewHolder(binding)
    }

    fun submitList(list: List<Day>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }
}