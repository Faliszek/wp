class WeatherCondition(type: String) {
    private val type = type

    override fun toString(): String {
        return "$type"
    }
}