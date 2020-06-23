import java.time.Instant
import java.util.*

class Database {
    private val planes = mutableListOf<Plane>()
    private val flights = mutableListOf<Flight>()
    private val airports = mutableListOf<Airport>()

    init {
        planes.addAll(mutableListOf(
                PlaneFactory.create("Boeing 777-200"),
                PlaneFactory.create("Boeing 777-300"),
                PlaneFactory.create("Boeing 727"),
                PlaneFactory.create("Airbus A380-800"),
                PlaneFactory.create("Boeing 747-8")
        ))

        airports.addAll(mutableListOf(
                AirportFactory.create("Georgia"),
                AirportFactory.create("Beijing"),
                AirportFactory.create("California"),
                AirportFactory.create("Tokyo"),
                AirportFactory.create("Dubai")
        ))

        flights.addAll(mutableListOf(
                Flight(1, Date.from(Instant.now().minusMillis(start.random())), Date.from(Instant.now().plusMillis(endRange.random())), planes[0], airports[1], airports[2], airports[4], Passenger.generatePassengers(200)),
                Flight(2, Date.from(Instant.now().minusMillis(start.random())), Date.from(Instant.now().plusMillis(endRange.random())), planes[2], airports[4], airports[0], airports[4], Passenger.generatePassengers(320)),
                Flight(3, Date.from(Instant.now().minusMillis(start.random())), Date.from(Instant.now().plusMillis(endRange.random())), planes[1], airports[2], airports[1], airports[4], Passenger.generatePassengers(340)),
                Flight(4, Date.from(Instant.now().minusMillis(start.random())), Date.from(Instant.now().plusMillis(endRange.random())), planes[3], airports[0], airports[3], airports[4], Passenger.generatePassengers(130))
        ))
    }

    fun getFlights(): List<Flight> {
        return flights
    }

    fun getAirports(): List<Airport> {
        return airports
    }

}