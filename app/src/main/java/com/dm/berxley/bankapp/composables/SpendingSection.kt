package com.dm.berxley.bankapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.DirectionsRun
import androidx.compose.material.icons.rounded.DirectionsRun
import androidx.compose.material.icons.rounded.Restaurant
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.Subscriptions
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dm.berxley.bankapp.R
import com.dm.berxley.bankapp.models.SpendingItem
import com.dm.berxley.bankapp.randomColor

@Composable
fun SpendingSection(modifier: Modifier = Modifier) {

    val state = rememberLazyListState()

    Text(
        modifier = Modifier.padding(horizontal = 16.dp),
        text = "Spending Breakdown",
        fontFamily = Font(R.font.play).toFontFamily(),
        fontSize = 22.sp
    )
    Spacer(modifier = Modifier.height(8.dp))

    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        state = state
    ) {
        itemsIndexed(spendingItems) { index, item ->
            SpendingItem(spendingItem = item, onItemClick = {})
        }
    }
}

@Composable
fun SpendingItem(spendingItem: SpendingItem, onItemClick: () -> Unit) {
    ElevatedCard(
        onClick = onItemClick,
        modifier = Modifier.size(120.dp),
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .background(spendingItem.color.copy(0.5f))
                .padding(14.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = spendingItem.icon,
                contentDescription = spendingItem.name,
                tint = Color.Black.copy(0.8f),
                modifier = Modifier.size(22.dp)
            )

            Column {
                Text(
                    text = spendingItem.name,
                    fontSize = 16.sp,
                    color = Color.Black.copy(0.8f)
                )
                Text(
                    text = "$ ${spendingItem.amount}",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontFamily = Font(R.font.play).toFontFamily()
                )
            }

        }

    }

}

val spendingItems = listOf(
    SpendingItem(
        name = "Food",
        amount = 123f,
        color = randomColor(),
        icon = Icons.Rounded.Restaurant
    ),
    SpendingItem(
        name = "Shopping",
        amount = 343f,
        color = randomColor(),
        icon = Icons.Rounded.ShoppingCart
    ),
    SpendingItem(
        name = "Subscriptions",
        amount = 546f,
        color = randomColor(),
        icon = Icons.Rounded.Subscriptions
    ),
    SpendingItem(
        name = "Health",
        amount = 433f,
        color = randomColor(),
        icon = Icons.AutoMirrored.Rounded.DirectionsRun
    )
)