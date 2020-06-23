
object PlaneFactory {
    fun create(name: String): Plane =
            when (name) {
                "Boeing 777-200" -> Plane(1, name, 440, Passenger.generatePassengers(100))
                "Boeing 777-300" -> Plane(2, name, 550, Passenger.generatePassengers(230))
                "Boeing 727" -> Plane(3, name, 280, Passenger.generatePassengers(80))
                "Airbus A380-800" -> Plane(4, name, 853, Passenger.generatePassengers(450))
                "Boeing 747-8" -> Plane(5, name, 700, Passenger.generatePassengers(350))
                else -> Plane(6, name, 150, Passenger.generatePassengers(54))
            }
}