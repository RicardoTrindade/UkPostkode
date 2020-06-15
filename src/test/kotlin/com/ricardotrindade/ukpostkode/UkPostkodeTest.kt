package com.ricardotrindade.ukpostkode

import org.junit.Assert.assertEquals
import org.junit.Test

class UkPostkodeTest {
    @Test fun testN15QJ() {
        val postcode = UkPostkode("N1 5QJ")
        assertEquals("N1 5QJ", postcode.full())

        assertEquals("5QJ", postcode.incode)
        assertEquals("N1", postcode.outcode)
        assertEquals("N", postcode.area)
        assertEquals("1", postcode.district)
        assertEquals("5", postcode.sector)
        assertEquals("QJ", postcode.unit)
    }

    @Test fun testE84AA() {
        val postcode = UkPostkode("E8 4AA")
        assertEquals("E8 4AA", postcode.full())

        assertEquals("4AA", postcode.incode)
        assertEquals("E8", postcode.outcode)
        assertEquals("E", postcode.area)
        assertEquals("8", postcode.district)
        assertEquals("4", postcode.sector)
        assertEquals("AA", postcode.unit)
    }
}