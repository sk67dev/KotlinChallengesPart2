fun main() {
calculateGrade(99)
}
val calculateGrade = { grade: Int ->
    when(grade) {
        in 0..45 ->  println("Fail")
        in 46..75 -> println("Pass")
        in 76..100 -> println("Distinction")
        else -> false
    }
}