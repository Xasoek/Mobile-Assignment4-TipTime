package com.example.tiptime

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class TipUITests {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun calculateCustomTip() {

        // Enter bill amount
        composeTestRule
            .onNodeWithText("Bill Amount")
            .performTextInput("100")

        // Enter tip percentage
        composeTestRule
            .onNodeWithText("Tip Percentage")
            .performTextInput("20")

        // Expected result
        val expectedTip = NumberFormat
            .getCurrencyInstance()
            .format(20.0)

        // Verify result
        composeTestRule
            .onNodeWithText("Tip Amount: $expectedTip")
            .assertIsDisplayed()
    }
}