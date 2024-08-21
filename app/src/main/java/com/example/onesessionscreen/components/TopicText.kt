package com.example.onesessionscreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopicText(
    text1: String,
    text2: String,
    text3: String,
) {
    Column(
        modifier = Modifier.padding(15.dp)
    ) {
        Text(text = text1,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp)
        Row(
            modifier = Modifier.padding(vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically,

            ) {

            Icon(imageVector = Icons.Default.CalendarToday, contentDescription = null)
            Spacer(modifier = Modifier.padding(3.dp))
            Text(text = text2)

            Spacer(modifier = Modifier.padding(8.dp))

            Icon(imageVector = Icons.Default.AccessTime, contentDescription = null)
            Spacer(modifier = Modifier.padding(3.dp))
            Text(text = text3)


        }


    }

}

