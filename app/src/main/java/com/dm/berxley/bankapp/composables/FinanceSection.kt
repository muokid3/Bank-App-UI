package com.dm.berxley.bankapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.StarHalf
import androidx.compose.material.icons.outlined.MonetizationOn
import androidx.compose.material.icons.outlined.StarHalf
import androidx.compose.material.icons.outlined.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dm.berxley.bankapp.models.FinanceItemContent
import com.dm.berxley.bankapp.ui.theme.BlueStart
import com.dm.berxley.bankapp.ui.theme.GreenStart
import com.dm.berxley.bankapp.ui.theme.OrangeStart
import com.dm.berxley.bankapp.ui.theme.PurpleStart


val financeItems = listOf(
    FinanceItemContent(
        name = "My \nBusiness",
        icon = Icons.AutoMirrored.Outlined.StarHalf,
        iconBg = OrangeStart
    ),

    FinanceItemContent(
        name = "My \nWallet",
        icon = Icons.Outlined.Wallet,
        iconBg = BlueStart
    ),

    FinanceItemContent(
        name = "Finance \nAnalytics",
        icon = Icons.AutoMirrored.Outlined.StarHalf,
        iconBg = PurpleStart
    ),

    FinanceItemContent(
        name = "My \nTransactions",
        icon = Icons.Outlined.MonetizationOn,
        iconBg = GreenStart
    ),

    )

@Composable
fun FinanceSection() {
    val state = rememberLazyListState()
    
    Column {
        Text(
            text = "Finance",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )


        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            state = state
        ) {
            items(financeItems.size) {
                FinanceItem(it)
            }
        }
    }
}

@Composable
fun FinanceItem(index: Int) {
    val finance = financeItems[index]


    Box {

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .size(120.dp)
                .clickable { }
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .padding(13.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(finance.iconBg)
                    .padding(16.dp)
            ) {
                Icon(
                    imageVector = finance.icon,
                    contentDescription = finance.name,
                    tint = Color.White
                )

            }

            Text(
                text = finance.name,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp
            )

        }

    }


}

@Preview(showBackground = true)
@Composable
fun FinancePrev() {
    FinanceSection()
}