class Airport(val id: Int, val name: String, val location: String, val country: String) {

    override fun toString(): String {
        return "$location, $country"
    }
}