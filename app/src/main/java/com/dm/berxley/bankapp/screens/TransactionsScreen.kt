package com.dm.berxley.bankapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowCircleDown
import androidx.compose.material.icons.filled.ArrowCircleUp
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dm.berxley.bankapp.composables.MainTopAppBar
import com.dm.berxley.bankapp.models.Transaction
import com.dm.berxley.bankapp.ui.theme.BlueEnd
import com.dm.berxley.bankapp.ui.theme.BlueStart
import com.dm.berxley.bankapp.ui.theme.GreenStart
import com.dm.berxley.bankapp.ui.theme.errorLight
import com.dm.berxley.bankapp.ui.theme.primaryLight
import com.dm.berxley.bankapp.ui.theme.secondaryLight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TransactionsScreen() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = rememberTopAppBarState()
    )

    val transactions = listOf(
        Transaction(
            imageVector = Icons.Filled.ArrowCircleDown,
            description = "Shell Sigona Petrol",
            date = "20th July 2024",
            amount = 235.54
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleUp,
            description = "M-Pesa to account top up",
            date = "21st July 2024",
            amount = 1000.00
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleDown,
            description = "Java Karen",
            date = "13rd July 2024",
            amount = 45.64
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleUp,
            description = "Salary July 2024",
            date = "27th July 2024",
            amount = 15000.54
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleUp,
            description = "Fuel Refund",
            date = "28th July 2024",
            amount = 567.00
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleDown,
            description = "Account to M-Pesa",
            date = "29th July 2024",
            amount = 5744.65
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleDown,
            description = "Carnivore Restaurant",
            date = "30th July 2024",
            amount = 735.00
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleDown,
            description = "Shell Sigona Petrol",
            date = "20th July 2024",
            amount = 235.54
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleUp,
            description = "M-Pesa to account top up",
            date = "21st July 2024",
            amount = 1000.00
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleDown,
            description = "Java Karen",
            date = "13rd July 2024",
            amount = 45.64
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleUp,
            description = "Salary July 2024",
            date = "27th July 2024",
            amount = 15000.54
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleUp,
            description = "Fuel Refund",
            date = "28th July 2024",
            amount = 567.00
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleDown,
            description = "Account to M-Pesa",
            date = "29th July 2024",
            amount = 5744.65
        ),
        Transaction(
            imageVector = Icons.Filled.ArrowCircleDown,
            description = "Carnivore Restaurant",
            date = "30th July 2024",
            amount = 735.00
        ),
    )

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            MainTopAppBar(
                scrollBehavior = scrollBehavior,
                modifier = Modifier.fillMaxWidth(),
                title = "Transactions"
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
        ) {
            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(horizontal = 16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.linearGradient(
                                listOf(
                                    MaterialTheme.colorScheme.primary,
                                    MaterialTheme.colorScheme.error
                                )
                            )
                        ),
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "12,533 USD", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Current Balance", fontSize = 15.sp)

                    }

                }

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedCard(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 8.dp),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.secondary)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "17,453 USD", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Received", fontSize = 14.sp)
                    }
                }
                OutlinedCard(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 8.dp),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.secondary)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "5,453 USD", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Sent", fontSize = 14.sp)
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Transactions History",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
            )
            Spacer(modifier = Modifier.height(8.dp))
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )

            LazyColumn {
                itemsIndexed(items = transactions) { index, item ->
                    TransactionItem(transaction = item)
                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                    )
                }

            }


        }
    }
}

@Composable
fun TransactionItem(transaction: Transaction) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        Icon(
            imageVector = transaction.imageVector,
            contentDescription = null,
            tint = if (transaction.imageVector == Icons.Filled.ArrowCircleDown) MaterialTheme.colorScheme.error else GreenStart,
            modifier = Modifier.size(36.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))

        Column(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically),
        ) {

            Text(text = transaction.description)
            Text(text = transaction.date)
        }

        Text(text = "KES ${transaction.amount}")
    }

}

@Preview(showBackground = true)
@Composable
fun TransactionsPrev() {
    TransactionsScreen()
}