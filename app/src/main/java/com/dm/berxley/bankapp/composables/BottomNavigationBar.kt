package com.dm.berxley.bankapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
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
import com.dm.berxley.bankapp.models.BottomNavItem

val natItems = listOf<BottomNavItem>(
    BottomNavItem("Home", Icons.Outlined.Home),
    BottomNavItem("Wallet", Icons.Outlined.Wallet),
    BottomNavItem("Notifications", Icons.Outlined.Notifications),
    BottomNavItem("Account", Icons.Outlined.AccountBox),
)

@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row(modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)) {
            natItems.forEachIndexed { index, bottomNavItem ->
                NavigationBarItem(selected = index == 0,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = bottomNavItem.icon,
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