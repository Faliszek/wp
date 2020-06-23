import kotlin.properties.Delegates


interface AirportWeatherChanger {

    fun onWeatherChanged(oldWeather: String, newWeather: String)
}

class AirportWeatherListener : AirportWeatherChanger {

    override fun onWeatherChanged(oldWeather: String, newWeather: String) {
        if(       newWeather == "bad") {

        }
     }
}

class Airport(val id: Int,
              val location: String,
              val country: String,
              val name: String,
              var weatherCondition: WeatherCondition,
              var temperature: Temperature
) {

    val listeners = mutableListOf<AirportWeatherChanger>()
    var text: String by Delegates.observable(weatherCondition.toString()) { _, oldWeather, newWeather ->
        listeners.forEach { it.onWeatherChanged(oldWeather, newWeather) }
    }


    override fun toString(): String {
        return "$location"
    }


}