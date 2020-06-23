
class Plane(val id: Int,
            var name: String = "",
            val capacity: Int,
            val passengers: List<Passenger>

            ) {

    override fun toString(): String {
        return "\nPlane: { $id, $name, capacity: $capacity}"
    }
}