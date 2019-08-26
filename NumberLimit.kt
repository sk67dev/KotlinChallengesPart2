fun main() {
    numLimit(10, 20, 5)
}
fun numLimit(lowest: Int, highest: Int, num: Int) {
    when(true){
        num >= lowest && num <= highest -> print(num)
        num < lowest -> print(lowest)
        num > highest -> print(highest)
    }
}