package com.dm.berxley.bankapp.screens

sealed class Screen(val title: String, val route: String) {
    object Home:Screen("Home", "home_screen")
    object Wallet:Screen("Wallet", "wallet_screen")
    object Transactions:Screen("Transactions", "transactions_screen")
    object Profile:Screen("Profile", "profile_screen")
}