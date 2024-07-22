package com.dm.berxley.bankapp.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dm.berxley.bankapp.R
import com.dm.berxley.bankapp.randomColor
import me.bytebeats.views.charts.bar.BarChart
import me.bytebeats.views.charts.bar.BarChartData
import me.bytebeats.views.charts.bar.render.label.SimpleLabelDrawer
import me.bytebeats.views.charts.bar.render.xaxis.SimpleXAxisDrawer
import me.bytebeats.views.charts.bar.render.yaxis.SimpleYAxisDrawer

@Composable
fun GraphsSection(modifier: Modifier = Modifier) {
    Text(
        modifier = Modifier.padding(horizontal = 16.dp),
        text = "Spending Statistics",
        fontFamily = Font(R.font.play).toFontFamily(),
        fontSize = 25.sp
    )
    Spacer(modifier = Modifier.height(16.dp))
    Chart(modifier = modifier)

    

}

@Composable
fun Chart(modifier: Modifier = Modifier) {

    BarChart(
        modifier = modifier,
        barChartData = BarChartData(spendingByMonth),
        xAxisDrawer = SimpleXAxisDrawer(
            axisLineColor = MaterialTheme.colorScheme.onBackground.copy(0.2f),
            axisLineThickness = 2.dp
        ),
        yAxisDrawer = SimpleYAxisDrawer(
            axisLineColor = MaterialTheme.colorScheme.onBackground.copy(0.2f),
            axisLineThickness = 2.dp,
            labelValueFormatter = {
                "${it.toInt()}"
            }
        ),
        labelDrawer = SimpleLabelDrawer(
            drawLocation = SimpleLabelDrawer.DrawLocation.Outside,
            labelTextSize = 16.sp
        )
    )

}

val spendingByMonth = listOf(
    BarChartData.Bar(
        value = 24f,
        color = randomColor(50),
        label = "Jan"
    ),
    BarChartData.Bar(
        value = 43f,
        color = randomColor(50),
        label = "Feb"
    ),
    BarChartData.Bar(
        value = 98f,
        color = randomColor(50),
        label = "Mar"
    ),
    BarChartData.Bar(
        value = 76f,
        color = randomColor(50),
        label = "Apr"
    ),
    BarChartData.Bar(
        value = 86f,
        color = randomColor(50),
        label = "May"
    ),
    BarChartData.Bar(
        value = 65f,
        color = randomColor(50),
        label = "Jun"
    ),
    BarChartData.Bar(
        value = 45f,
        color = randomColor(50),
        label = "Jul"
    ),
    BarChartData.Bar(
        value = 80f,
        color = randomColor(50),
        label = "Aug"
    ),
)