package com.dm.berxley.bankapp.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavController, paddingValues: PaddingValues) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Screen.Home.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(Screen.Home.route) {
            HomeScreen()
        }

        composable(Screen.Wallet.route){
            WalletScreen()
        }

        composable(Screen.Profile.route){
            ProfileScreen()
        }
        composable(Screen.Notifications.route){
        }
    }

}