package com.dm.berxley.bankapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dm.berxley.bankapp.composables.BottomNavigationBar
import com.dm.berxley.bankapp.composables.CardSection
import com.dm.berxley.bankapp.composables.CurrenciesSection
import com.dm.berxley.bankapp.composables.FinanceSection
import com.dm.berxley.bankapp.composables.WalletSection
import com.dm.berxley.bankapp.ui.theme.BankAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BankAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }

    @Composable
    fun HomeScreen() {
        Scaffold(
            bottomBar = { BottomNavigationBar() }
        )
        { padding ->
            Column(
                Modifier.padding(padding)
            ) {
                WalletSection()
                Spacer(modifier = Modifier.height(16.dp))
                CardSection()
                Spacer(modifier = Modifier.height(16.dp))
                FinanceSection()
//                Spacer(modifier = Modifier.height(16.dp))
                CurrenciesSection()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun HomePreview() {
        HomeScreen()
    }
}



