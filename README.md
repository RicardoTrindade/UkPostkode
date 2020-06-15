UkPostkode
========

[![Status](https://github.com/RicardoTrindade/UkPostkode/workflows/Build/badge.svg)](https://github.com/RicardoTrindade/UkPostkode/workflows/Build/badge.svg)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.ricardo-trindade/ukpostkode/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.ricardo-trindade/ukpostkode)


Uk Postcode parsing library written in Kotlin. Similar to the gem [UkPostcode](https://github.com/threedaymonk/uk_postcode/).

# Instalation

With gradle
` implementation 'com.ricardo-trindade:ukpostkode:0.0.1' `

# Usage
```
  For the postcode N1 5QJ   
  
  val postcode = UkPostkode("N1 5QJ)
  postcode.outcode = "N1"
  postcode.incode = "5QJ"
  postcode.area = "N"
  postcode.district = "1"
  postcode.sector = "5"
  postcode.unit = "QJ"

```

# Contributing
Contributions are more than welcome, the project is still very young so feel free to open a PR!