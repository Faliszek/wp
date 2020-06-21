import java.time.Instant
import java.util.*

class Database {
    private val planes = mutableListOf<Plane>()
    private val flights = mutableListOf<Flight>()
    private val  airports = mutableListOf<Airport>()

    init {


        planes.addAll(mutableListOf(

            Plane(1,"Boeing 777-200", 440),
            Plane(2,"Boeing 777-300", 550),
            Plane(3,"Boeing 727",  280),
            Plane(4,"Airbus A380-800",853 ),
            Plane(5,"Boeing 747-8", 700)
        ))

        airports.addAll(mutableListOf(
            Airport(1,	"United States Hartsfield–Jackson Atlanta International Airport", "Georgia",	"United States"),
            Airport(2,	"China Beijing Capital International Airport	Chaoyang-Shunyi", "Beijing",	"China"),
            Airport(3,	"United States Los Angeles International Airport	Los Angeles", "California"	,"United States"	),
            Airport(4,	"Japan Tokyo Haneda Airport	Ōta", "Tokyo"	,"Japan"),
            Airport(5,	"United Arab Emirates Dubai International Airport", "Dubai"	,"United Arab Emirates")
        ))

        flights.addAll(mutableListOf(
            Flight(1,Date.from(Instant.now()),Date.from(Instant.ofEpochMilli(1592765337496)), planes[0],airports[1], airports[2], Passenger.generatePassengers(200) ),
            Flight(2,Date.from(Instant.now()),Date.from(Instant.ofEpochMilli(1592765337496)), planes[2],airports[4], airports[0], Passenger.generatePassengers(320) ),
            Flight(3,Date.from(Instant.now()),Date.from(Instant.ofEpochMilli(1592765337496)), planes[1],airports[2], airports[1], Passenger.generatePassengers(340) ),
            Flight(4,Date.from(Instant.now()),Date.from(Instant.ofEpochMilli(1592765337496)), planes[3],airports[0], airports[3], Passenger.generatePassengers(130) )
        ))
    }

    fun printFlights() {
        for(f in flights) println("Plane name: ${f.passengers} ")
    }

    fun getFlights(): List<Flight> {
        return flights
    }

}