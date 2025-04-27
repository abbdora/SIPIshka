package com.example.astrology

data class ExpandableItem(
    val number: Int,
    val text: String,
    var isExpanded: Boolean = false
)
