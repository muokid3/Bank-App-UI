package com.dm.berxley.bankapp.screens

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.dm.berxley.bankapp.composables.WalletActionsSection
import com.dm.berxley.bankapp.composables.WalletCardSection
import com.dm.berxley.bankapp.composables.WalletTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WalletScreen() {

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = rememberTopAppBarState()
    )
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            WalletTopBar(
                scrollBehavior = scrollBehavior,
                modifier = Modifier.fillMaxWidth()
            )
        },
        bottomBar = { BottomNavigationBar() }
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
        Spacer(modifier = Modifier.height(24.dp))
        WalletCardSection(modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(24.dp))
        WalletActionsSection(modifier = Modifier.fillMaxWidth())
    }
}

@Preview
@Composable
fun WalletPrev() {
    WalletScreen()
}