package com.dm.berxley.bankapp.models

import androidx.compose.ui.graphics.Brush

data class CardItemContent(
    val cardType: String,
    val name: String,
    val cardNumber: String,
    val balance: Double,
    val color: Brush
)
