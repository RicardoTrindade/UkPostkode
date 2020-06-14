package com.ricardotrindade.ukpostkode

import org.junit.Assert.assertEquals
import org.junit.Test

class UkPostkodeTest {
    @Test fun testBase() {
        assertEquals("N1 5QJ", UkPostkode("N1 5QJ").full())
    }
}