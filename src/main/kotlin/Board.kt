import java.util.*

class BoardRenderer(flights: List<Flight>, airports: List<Airport>) : TimerTask() {
    private val flights = flights
    private val airports = airports

    override fun run() {
        val content = BoardAirportsRenderer.print(airports) + BoardFlightsRenderer.print(flights);
        print("\u001b[H\u001b[2J")
        print(content)
    }

}

object Board {

    fun run() {
        val db = Database()
        val flights = db.getFlights()
        val airports = db.getAirports()
        val timer = Timer()

        timer.schedule(BoardRenderer(flights, airports), 0, 1000)


    }

}