import java.time.Instant
import java.util.*


val endRange = LongRange(1800000, 7200000)
val start = LongRange(300000, 900000)

class BadWeatherEvent(private val flight: Flight) : TimerTask() {
    override fun run() {

        val weather = flight.to.apply {
            val listener = AirportWeatherListener()
        }


        with(weather) {
                weatherCondition = WeatherCondition("bad")
                flight.to = flight.backupAirport
                flight.id = flight.id + 4
                flight.passengers = flight.passengers
                flight.startTime = Date.from(Instant.now())
                flight.landingTime = Date.from(Instant.now().plusMillis(endRange.random()))
        }

    }
}

class Flight(var id: Int, var startTime: Date, var landingTime: Date, var p: Plane, var from: Airport, var to: Airport, var backupAirport: Airport, var passengers: List<Passenger>) {
    init {
        runEvents()
    }

    private fun runEvents() {
        val timer = Timer()

        if (to.id === 2) {
            timer.schedule(BadWeatherEvent(this), 5000)
        }

        if (to.id === 1) {
            timer.schedule(BadWeatherEvent(this), 10000)
        }

        if (to.id === 3) {
            timer.schedule(BadWeatherEvent(this), 13000)
        }

    }


    override fun toString(): String {
        val from = from.toString()
        val to = to.toString()
        val start = startTime.toString()
        val landing = landingTime.toString()
        val sep = '\t'

        return "|$sep$from$sep$sep$sep$sep$sep|$sep$to$sep|$sep$start$sep|$sep$landing$sep|\n"
    }

}

