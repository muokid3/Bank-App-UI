package com.dm.berxley.bankapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.Widgets
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dm.berxley.bankapp.R
import com.dm.berxley.bankapp.ui.theme.Pink80

@Composable
fun WalletActionsSection(modifier: Modifier = Modifier) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        ActionItem(icon = Icons.Default.ArrowUpward, text = "Send", color = Color.Red.copy(0.35f))
        ActionItem(icon = Icons.Default.ArrowDownward, text = "Receive", color = Color.Green.copy(0.35f))
        ActionItem(icon = Icons.Default.GridView, text = "More", color = Color.Gray.copy(0.35f))

    }

}

@Composable
fun ActionItem(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    text: String,
    color: Color
) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.White)
                .background(color),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint = Color.Black,
                modifier = Modifier.size(20.dp)
            )

        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = text,
            fontFamily = Font(R.font.play).toFontFamily(),
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 16.sp
        )

    }

}