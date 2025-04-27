package com.example.astrology

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpandableAdapter(private val items: List<ExpandableItem>) :
    RecyclerView.Adapter<ExpandableAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numberText: TextView = itemView.findViewById(R.id.number_text)
        val extraText: TextView = itemView.findViewById(R.id.extra_text)
        val expandableLayout: LinearLayout = itemView.findViewById(R.id.expandable_layout)
        val collapseButton: ImageButton = itemView.findViewById(R.id.collapse_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_expandable, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.numberText.text = item.number.toString()
        holder.extraText.text = item.text
        holder.expandableLayout.visibility = if (item.isExpanded) View.VISIBLE else View.GONE

        holder.numberText.setOnClickListener {
            item.isExpanded = true
            notifyItemChanged(position)
        }

        holder.collapseButton.setOnClickListener {
            item.isExpanded = false
            notifyItemChanged(position)
        }
    }

    override fun getItemCount() = items.size
}
