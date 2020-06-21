
fun main() {
    val db = Database()
    val flights = db.getFlights()
    Board(flights)
}
