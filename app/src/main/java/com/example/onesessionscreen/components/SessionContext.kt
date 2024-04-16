package com.example.onesessionscreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SessionContext(
    text1 : String,
    text2 : String

){
  Column (
      modifier = Modifier.padding(horizontal = 5.dp),
  ){
      Text(text = text1,
          style = MaterialTheme.typography.bodyMedium)
      
      Spacer(modifier = Modifier.padding(3.dp))

      Text(text = text2,
          style = MaterialTheme.typography.bodyLarge,
          fontWeight = FontWeight.Bold,
          )

  }
}