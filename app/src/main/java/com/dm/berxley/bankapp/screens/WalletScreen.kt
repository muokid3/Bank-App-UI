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
import com.dm.berxley.bankapp.composables.GraphsSection
import com.dm.berxley.bankapp.composables.SpendingSection
import com.dm.berxley.bankapp.composables.WalletActionsSection
import com.dm.berxley.bankapp.composables.WalletCardSection
import com.dm.berxley.bankapp.composables.MainTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WalletScreen() {

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = rememberTopAppBarState()
    )
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            MainTopAppBar(
                scrollBehavior = scrollBehavior,
                modifier = Modifier.fillMaxWidth(),
                title = "Wallet"
            )
        },
    ) { paddingValues ->
        MainWalletScreen(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        )
    }

}


@Composable
fun MainWalletScreen(modifier: Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState())) {
        WalletCardSection(modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(8.dp))
        WalletActionsSection(modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(12.dp))
        SpendingSection(modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(12.dp))
        GraphsSection(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(150.dp))
        Spacer(modifier = Modifier.height(100.dp))


    }
}

@Preview
@Composable
fun WalletPrev() {
    WalletScreen()
}