class Plane(val id: Int, val name: String = "", val capacity: Int) {
    init {
        println("New plane created")
    }


    override fun toString(): String {
        return "\nPlane: { $id, $name, capacity: $capacity}"
    }



}