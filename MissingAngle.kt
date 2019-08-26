
fun main() {
    missingAngle(80,10)
}
fun missingAngle(degree1: Int, degree2: Int){

    var result = 180 - (degree1 + degree2)

    when(true){

        result  <90 -> println("Acute")
        result == 90 -> println("Right")
        result  >90 -> println("Obtuse")
    }
}