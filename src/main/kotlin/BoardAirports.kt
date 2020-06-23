import java.util.*



object BoardAirportsRenderer {
    fun print(airports: List<Airport>): String {
        val leftAlignFormat = "| %-11s | %-27s | %-27s | %-27s | %-11s | %-11s|%n"
        val border = "+-------------+-----------------------------+-----------------------------+-----------------------------|-------------|------------+"
        val header = "| ID          | Country                     | Location                    | Weather condition           | Temp C      | Temp F     |"
        var content = ""

        for (a in airports) {
            content += String.format(leftAlignFormat,
                    a.id,
                    a.country,
                    a.location,
                    a.weatherCondition,
                    CelsiusTemperature(a.temperature.value),
                    FahrenheitTemperature(CelsiusTemperature(a.temperature.value))
            )

        }
        return String.format("%s%n%s%n%s%n%s%s%n", border, header, border, content, border)


    }
}


