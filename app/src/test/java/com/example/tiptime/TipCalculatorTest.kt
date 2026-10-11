package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {

    @Test
    fun calculateTip_20Percent() {
        val amount = 100.0
        val tipPercent = 20.0

        val tip = tipPercent / 100 * amount

        assertEquals(20.0, tip, 0.001)
    }

    @Test
    fun calculateTip_withRounding() {
        val amount = 123.0
        val tipPercent = 15.0

        val tip = tipPercent / 100 * amount
        val roundedTip = kotlin.math.ceil(tip)

        assertEquals(19.0, roundedTip, 0.001)
    }
}