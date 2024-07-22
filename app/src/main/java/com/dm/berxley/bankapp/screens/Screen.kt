package com.dm.berxley.bankapp.screens

sealed class Screen(val title: String, val route: String) {
    object Home:Screen("Home", "home_screen")
    object Wallet:Screen("Wallet", "wallet_screen")
    object Notifications:Screen("Notifications", "notifications_screen")
    object Account:Screen("Account", "account_screen")
}