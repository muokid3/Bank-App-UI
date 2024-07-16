package com.dm.berxley.bankapp.composables

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dm.berxley.bankapp.R
import com.dm.berxley.bankapp.models.CardItemContent
import com.dm.berxley.bankapp.ui.theme.BlueEnd
import com.dm.berxley.bankapp.ui.theme.BlueStart
import com.dm.berxley.bankapp.ui.theme.GreenEnd
import com.dm.berxley.bankapp.ui.theme.GreenStart
import com.dm.berxley.bankapp.ui.theme.OrangeEnd
import com.dm.berxley.bankapp.ui.theme.OrangeStart
import com.dm.berxley.bankapp.ui.theme.PurpleEnd
import com.dm.berxley.bankapp.ui.theme.PurpleStart

val cardItemContents = listOf(
    CardItemContent(
        cardType = "Visa",
        cardNumber = "1234 5678 9123 4567",
        name = "Current Account",
        balance = 17.86,
        color = getGradient(PurpleStart, PurpleEnd)
    ),
    CardItemContent(
        cardType = "MASTER CARD",
        cardNumber = "9876 5432 1098 7654",
        name = "Savings Account",
        balance = 745.65,
        color = getGradient(BlueStart, BlueEnd)
    ),
    CardItemContent(
        cardType = "VISA",
        cardNumber = "5738 6027 6762 1902",
        name = "School Card",
        balance = 5.54,
        color = getGradient(OrangeStart, OrangeEnd)
    ),
    CardItemContent(
        cardType = "MASTER CARD",
        cardNumber = "5738 6027 6762 1902",
        name = "Trips Card",
        balance = 56.12,
        color = getGradient(GreenStart, GreenEnd)
    )
)

@Composable
fun CardSection() {
    LazyRow {

        items(cardItemContents.size) { index ->
            CardItem(index = index)
        }
    }
}

@Composable
fun CardItem(index: Int) {
    val card = cardItemContents[index]

    var lastItemPaddingEnd = 0.dp
    if (index == cardItemContents.size - 1){
        lastItemPaddingEnd = 16.dp
    }

    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardType == "MASTER CARD"){
        image = painterResource(id = R.drawable.ic_mastercard)
    }

    Box(modifier = Modifier
        .padding(start = 16.dp, end = lastItemPaddingEnd)){
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(250.dp)
                .height(160.dp)
                .clickable { }
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                modifier = Modifier.width(60.dp),
                painter = image,
                contentDescription = card.name)

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = card.name,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "$ ${card.balance}",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = card.cardNumber,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }



}

fun getGradient(startColor: Color, endColor: Color): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )

}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    CardSection()
}