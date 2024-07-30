package com.dm.berxley.bankapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dm.berxley.bankapp.composables.BottomNavigationBar
import com.dm.berxley.bankapp.composables.CardSection
import com.dm.berxley.bankapp.composables.CurrenciesSection
import com.dm.berxley.bankapp.composables.FinanceSection
import com.dm.berxley.bankapp.composables.MainTopAppBar
import com.dm.berxley.bankapp.composables.WalletSection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = rememberTopAppBarState()
    )
    Scaffold(
       // modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            MainTopAppBar(
                scrollBehavior = scrollBehavior,
                modifier = Modifier.fillMaxWidth(),
                title = "Home"
            )
        }
    ) { paddingValues ->

        MainHomeScreen(modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize())
    }
}

@Composable
fun MainHomeScreen(modifier: Modifier) {

    Column(modifier = modifier.verticalScroll(rememberScrollState())) {
        WalletSection()
        Spacer(modifier = Modifier.height(8.dp))
        CardSection()
        Spacer(modifier = Modifier.height(8.dp))
        FinanceSection()
        CurrenciesSection()
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeScreen()
}