object AirportFactory {
    fun create(location: String): Airport =
            when (location) {
                "Georgia" -> Airport(1, location, "United States",  "United States Hartsfield–Jackson Atlanta International Airport", WeatherCondition("good"),  CelsiusTemperature(23.0))
                "Beijing" -> Airport(2, location, "China","China Beijing Capital International Airport Chaoyang-Shunyi",  WeatherCondition("good"), CelsiusTemperature(13.0))
                "California" -> Airport(3,  location, "United States", "United States Los Angeles International Airport	Los Angeles", WeatherCondition("good"),  CelsiusTemperature(35.0))
                "Tokyo" -> Airport(4, location, "Japan", "Japan Tokyo Haneda Airport	Ōta",  WeatherCondition("good"),  CelsiusTemperature(18.0))
                "Dubai" -> Airport(5,  location, "United Arab Emirates", "United Arab Emirates Dubai International Airport",WeatherCondition("good"),  CelsiusTemperature(35.0))
                else -> Airport(6,  location, "Country not provieded","Name not provided", WeatherCondition("good"),  CelsiusTemperature(20.0))
            }
}