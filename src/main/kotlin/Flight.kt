import java.util.*

class Flight(val id: Int, val startTime: Date, val landingTime: Date, val p: Plane, val from: Airport, val to: Airport, val passengers: List<Passenger>) {

    override fun toString(): String {
        val from = from.toString()
        val to = to.toString()
        val start = startTime.toString()
        val landing = landingTime.toString()
        val sep = '\t'

        return "|$sep$from$sep$sep$sep$sep$sep|$sep$to$sep|$sep$start$sep|$sep$landing$sep|\n"
    }

}