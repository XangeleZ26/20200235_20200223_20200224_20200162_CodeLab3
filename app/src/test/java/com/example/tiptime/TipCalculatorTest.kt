package com.example.tiptime

import org.junit.Assert
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {
    @Test
    fun calculateTip_20PercentNoRoundup() {
        val tipPercent = 20.00
        val amount = 10.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        Assert.assertEquals(expectedTip, actualTip)
    }

}