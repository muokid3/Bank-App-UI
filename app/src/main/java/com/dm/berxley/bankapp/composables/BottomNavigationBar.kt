package com.dm.berxley.bankapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.dm.berxley.bankapp.models.BottomNavItem
import com.dm.berxley.bankapp.screens.Screen
import com.dm.berxley.bankapp.viewmodels.MainViewModel

val natItems = listOf<BottomNavItem>(
    BottomNavItem("Home", Icons.Filled.Home, Icons.Outlined.Home),
    BottomNavItem("Wallet", Icons.Filled.Wallet, Icons.Outlined.Wallet),
    BottomNavItem("Notifications", Icons.Filled.Notifications, Icons.Outlined.Notifications),
    BottomNavItem("Account", Icons.Filled.AccountBox, Icons.Outlined.AccountBox),
)

@Composable
fun BottomNavigationBar(viewModel: MainViewModel, navController: NavController) {
    NavigationBar {
        Row(modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)) {
            natItems.forEachIndexed { index, bottomNavItem ->
                NavigationBarItem(
                    selected = index == viewModel.selectedBottomIndex.value,
                    onClick = {
                        when (index) {
                            0 -> {
                                navController.navigate(Screen.Home.route)
                                viewModel.setBottomIndex(0)
                            }

                            1 -> {
                                navController.navigate(Screen.Wallet.route)
                                viewModel.setBottomIndex(1)
                            }

                            2 -> {
                                navController.navigate(Screen.Notifications.route)
                                viewModel.setBottomIndex(2)
                            }

                            3 -> {
                                navController.navigate(Screen.Account.route)
                                viewModel.setBottomIndex(3)
                            }
                        }
                    },
                    icon = {
                        Icon(
                            imageVector = if (index == viewModel.selectedBottomIndex.value) bottomNavItem.selectedIcon else bottomNavItem.unselectedIcon,
                            contentDescription = bottomNavItem.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(
                            text = bottomNavItem.title,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )
            }

        }
    }
}