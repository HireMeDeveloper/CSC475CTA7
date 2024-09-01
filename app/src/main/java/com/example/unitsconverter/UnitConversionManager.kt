package com.example.unitsconverter

class UnitConversionManager {
    companion object {
        private var instance: UnitConversionManager? = null

        fun getInstance(): UnitConversionManager {
            return instance ?: synchronized(this) {
                instance ?: UnitConversionManager().also { instance = it }
            }
        }
    }

    fun convertFahrenheitToCelsius(number: Double) : Double {
        return (number - 32.0) * (5.0/9.0)
    }

    fun convertCelsiusToFahrenheit(number: Double) : Double{
        return (number * (9.0/5.0)) + 32.0
    }
}