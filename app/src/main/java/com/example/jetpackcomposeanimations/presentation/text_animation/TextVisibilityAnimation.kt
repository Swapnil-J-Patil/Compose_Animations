package com.example.jetpackcomposeanimations.presentation.text_animation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.AnnotatedString

@Composable
fun TextVisibilityAnimation(
    message: AnnotatedString
) {

    var showDetails by remember { mutableStateOf(false) }

    Column {
        ClickableText(
            text = message,
            onClick = {
                showDetails = !showDetails
            }
        )
        AnimatedVisibility(showDetails) {
            Text("showed hidden message")
        }
    }
}