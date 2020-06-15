package com.ricardotrindade.ukpostkode

/**
 * Base ukpostcode class, constructor receives a postcode string and parses it
 * returning the common fields.
 *
 * e.g For the postcode N1 5QJ
 * outcode: N1
 * incode: 5QJ
 * area: N
 * district: 1
 * sector: 5
 * unit: QJ
 */
class UkPostkode(postcode: String) {
    private val pattern = "^(([A-Z][A-Z]{0,1})([0-9][A-Z0-9]{0,1})) {0,}(([0-9])([A-Z]{2}))$".toRegex()
    var outcode: String
    var incode: String
    var area: String
    var district: String
    var unit: String
    var sector: String

    init {
        val (outcode,
                area,
                district,
                incode,
                sector,
                unit) = pattern.find(postcode.trim().toUpperCase())!!.destructured
        this.outcode = outcode
        this.area = area
        this.district = district
        this.incode = incode
        this.sector = sector
        this.unit = unit
    }

    /**
     * Returns the fully parsed postcode
     */
    fun full() = "$outcode $incode"
}