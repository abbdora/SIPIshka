package com.example.astrology

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)


        val dateTextView = view.findViewById<TextView>(R.id.date)

        val locale = Locale("ru")
        val dateFormat = SimpleDateFormat("EEEE, dd MMMM", locale)
        val currentDate = dateFormat.format(Date())
        val formattedDate = currentDate.replaceFirstChar { it.uppercase() }

        dateTextView.text = formattedDate

        return view
    }


}