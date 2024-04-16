package com.example.onesessionscreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.onesessionscreen.R
import com.example.onesessionscreen.ui.theme.md_theme_light_outline

@Composable
fun ProfileLayout(
    title1: String,
    title2: String,
) {

        Row(
            modifier = Modifier.padding(vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.flower),
                contentDescription = stringResource(
                    R.string.my_pic),
                modifier = Modifier
                    .clip(CircleShape)
                    .size(40.dp))
            Column(
                modifier = Modifier
                    .padding(horizontal = 5.dp)
                    .weight(1f)
            ) {
                Text(
                    text = title1,
                    color = MaterialTheme.colorScheme.primary,
                    textDecoration = TextDecoration.Underline)
                
                Text(text = title2)

                Divider(
                    color = MaterialTheme.colorScheme.onError,
                    modifier = Modifier.fillMaxWidth()

                )

            }
        }

    }


