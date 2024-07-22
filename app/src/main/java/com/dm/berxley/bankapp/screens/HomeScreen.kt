package com.dm.berxley.bankapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dm.berxley.bankapp.composables.BottomNavigationBar
import com.dm.berxley.bankapp.composables.CardSection
import com.dm.berxley.bankapp.composables.CurrenciesSection
import com.dm.berxley.bankapp.composables.FinanceSection
import com.dm.berxley.bankapp.composables.WalletSection

@Composable
fun HomeScreen() {

    Column {
        WalletSection()
        Spacer(modifier = Modifier.height(16.dp))
        CardSection()
        Spacer(modifier = Modifier.height(16.dp))
        FinanceSection()
//                Spacer(modifier = Modifier.height(16.dp))
        CurrenciesSection()
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeScreen()
}