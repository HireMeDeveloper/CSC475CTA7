package com.example.unitsconverter.UnitTesting

import com.example.unitsconverter.UnitConversionManager
import org.junit.Assert.*
import org.junit.Test

class UnitConversionUnitTest {
    @Test
    fun FToCConversionIsCorrectTest1(){
        val conversionManager = UnitConversionManager.getInstance()

        val result = conversionManager.convertFahrenheitToCelsius(32.0)
        assertEquals(result, 0.0, 0.01)
    }

    @Test
    fun FToCConversionIsCorrectTest2(){
        val conversionManager = UnitConversionManager.getInstance()

        val result = conversionManager.convertFahrenheitToCelsius(122.0)
        assertEquals(result, 50.0, 0.01)
    }

    @Test
    fun FToCConversionIsCorrectTest3(){
        val conversionManager = UnitConversionManager.getInstance()

        val result = conversionManager.convertFahrenheitToCelsius(54.5)
        assertEquals(result, 12.5, 0.01)
    }

    @Test
    fun CToFConversionIsCorrectTest1(){
        val conversionManager = UnitConversionManager.getInstance()

        val result = conversionManager.convertCelsiusToFahrenheit(0.0)
        assertEquals(result, 32.0, 0.01)
    }

    @Test
    fun CToFConversionIsCorrectTest2(){
        val conversionManager = UnitConversionManager.getInstance()

        val result = conversionManager.convertCelsiusToFahrenheit(50.0)
        assertEquals(result, 122.0, 0.01)
    }

    @Test
    fun CToFConversionIsCorrectTest3(){
        val conversionManager = UnitConversionManager.getInstance()

        val result = conversionManager.convertCelsiusToFahrenheit(12.5)
        assertEquals(result, 54.5, 0.01)
    }

}