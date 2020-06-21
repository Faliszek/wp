fun main(args: Array<String>) {
    val db = Database()
    val flights = db.getFlights()
    Board(flights)
}
