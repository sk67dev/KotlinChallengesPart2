
fun main() {
calculateWeight(115.0)
}
enum class Planet(val relativeGravity: Double) {
    Mercury(0.38),
    Venus(0.91),
    Earth(1.00),
    Mars(0.38),
    Jupiter(2.34),
    Saturn(1.06),
    Uranus(0.92),
    Neptune(1.19),
    Pluto(0.06);

    fun convert(weight: Double): Double {
        return weight * relativeGravity
    }
}
fun calculateWeight(bodyWeight: Double, unit: String = "pounds") {
    val prefix = "My body weight is $bodyWeight $unit and on the different planets it equals:\n"
    println(Planet.values().joinToString(prefix = prefix, separator = ",\n") { planet ->
        "%s: %.2f".format(planet.name, planet.convert(bodyWeight))
    })
}






