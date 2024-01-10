package com.example.shedule.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shedule.data.Lesson
import com.example.shedule.databinding.LessonItemBinding


class CurrentDayAdapter : RecyclerView.Adapter<CurrentDayAdapter.LessonViewHolder>() {
    class LessonViewHolder (
        private val binding: LessonItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(lesson: Lesson) = with(binding) {
            if(lesson.name != null) {
                lessonName.text = lesson.name
                cabinetNumber.text = lesson.cabinet
                lecturerName.text = lesson.lecturer
                classTime.text = lesson.startTime.toString() + " - " + lesson.endTime.toString()
            } else {
                lessonName.text = "Окно"
            }
        }
    }

    private val list: MutableList<Lesson> = mutableListOf()

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LessonItemBinding.inflate(inflater, parent, false)
        return LessonViewHolder(binding)
    }


    fun submitList(list: List<Lesson>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }}