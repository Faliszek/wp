interface Temperature {
    var value: Double
}

class CelsiusTemperature(override var value: Double) : Temperature {
    override fun toString(): String {
        return "$value C"
    }
 }

class FahrenheitTemperature(var celsiusTemperature: CelsiusTemperature) : Temperature {

    override var value: Double
        get() = convertCelsiusToFahrenheit(celsiusTemperature.value)
        set(temperatureInF) {
            celsiusTemperature.value = convertFahrenheitToCelsius(temperatureInF)
        }

    private fun convertFahrenheitToCelsius(f: Double): Double = (f - 32) * 5 / 9
    private fun convertCelsiusToFahrenheit(c: Double): Double = (c * 9 / 5) + 32

    override fun toString(): String {
        return "$value F"
    }

}