package com.example.basiccomposeui.ui.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccomposeui.R

@Composable
fun MoreOrLessCard() {

    Card(
        modifier = Modifier.padding(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF7F2F9)
        )
    ) {
        var expanded by rememberSaveable { mutableStateOf(false) }
        val smallString = stringResource(R.string.small_string_jetpack_compose)
        val expandedString = stringResource(R.string.expanded_string_jetpack_compose)

        Column(
            modifier = Modifier
                .padding(10.dp)
                .background(Color.LightGray)
        ) {
            Text("Jetpack Compose", fontSize = 24.sp, fontWeight = FontWeight.Bold)

            Text(
                "Modern UI toolkit  to build native Android UI",
                modifier = Modifier.padding(top = 8.dp),
                fontSize = 16.sp, fontWeight = FontWeight.Bold
            )

            Text(
                if (expanded) expandedString else smallString,
                modifier = Modifier.padding(top = 8.dp),
                fontSize = 12.sp
            )

            ClickableText(
                modifier = Modifier.align(Alignment.End),
                text = if (expanded) AnnotatedString("show less") else AnnotatedString("show more"),
                onClick = {
                    expanded = !expanded
                }
            )
        }
    }
}

@Preview
@Composable
fun PreviewMoreOrLessCard() {
    MoreOrLessCard()
}