package com.dm.berxley.bankapp.models

import androidx.compose.ui.graphics.vector.ImageVector

data class Transaction(
    val imageVector: ImageVector,
    val description: String,
    val date: String,
    val amount: Double
)
