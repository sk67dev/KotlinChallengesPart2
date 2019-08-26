//SOLUTION 1: Using the it keyword
fun main() {
    val numLetters = "senselessness".count({ letter -> letter == 's' })
    print(numLetters)
}
/*
//SOLUTION 2
fun main() {
    val numLetters = "senselessness".count({ it == 's' })
    print(numLetters)
}
*/

