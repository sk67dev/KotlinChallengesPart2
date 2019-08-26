fun main() {
    val greetingFunction: () -> String = {
        val guestName = "Helena"
        "Welcome to Blue Coral Resort $guestName"
    }
    println(greetingFunction())
}

