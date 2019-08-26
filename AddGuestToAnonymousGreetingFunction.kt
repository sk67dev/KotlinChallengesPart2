//SOLUTION 1: Using the it keyword.
fun main() {
    val greetingFunction: (String) -> String = {
        val guestName = "Helena"
        "Welcome to Blue Coral Resort $guestName and $it"
    }
    println(greetingFunction("Amelie"))
}


//SOLUTION 2:
//+ Type Inference Support
fun main() {
    val greetingFunction = { guest2: String ->
        val guestName = "Helena"
        "Welcome to Blue Coral Resort $guestName and $guest2"
    }
    println(greetingFunction("Amelie"))
}
