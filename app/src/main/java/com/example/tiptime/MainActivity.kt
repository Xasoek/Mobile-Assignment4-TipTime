package com.example.tiptime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiptime.ui.theme.TipTimeTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TipTimeTheme {
                TipTimeLayout()
            }
        }
    }
}

@Composable
fun TipTimeLayout() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Calculate Tip",
            style = MaterialTheme.typography.headlineMedium
        )

        EditNumberField()

        Text(
            text = "Tip Amount: $0.00"
        )
    }
}
@Composable
fun EditNumberField(modifier: Modifier = Modifier) {

    var amountInput by remember {
        mutableStateOf("")
    }

    TextField(
        value = amountInput,
        onValueChange = { amountInput = it },
        label = { Text("Bill Amount") },
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun TipTimePreview() {
    TipTimeTheme {
        TipTimeLayout()
    }
}