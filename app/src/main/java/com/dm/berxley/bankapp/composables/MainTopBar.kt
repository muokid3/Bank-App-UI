package com.dm.berxley.bankapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dm.berxley.bankapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar(
    scrollBehavior: TopAppBarScrollBehavior,
    modifier: Modifier,
    title: String = "Bank App"
) {
    TopAppBar(
        title = {
            Box(modifier = modifier.padding(end = 20.dp)) {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(40.dp)
                        .background(MaterialTheme.colorScheme.primaryContainer)
                        .align(Alignment.CenterStart)
                )
                Text(
                    text = title,
                    fontSize = 22.sp,
                    fontFamily = Font(R.font.play).toFontFamily(),
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .align(Alignment.CenterStart)
                )

                Icon(
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = "Notifications",
                    modifier = Modifier
                        .size(32.dp)
                        .align(Alignment.CenterEnd)
                )


            }
        },
        scrollBehavior = scrollBehavior,
        modifier = modifier
    )

}