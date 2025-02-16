fun main() {
    println(getMaximalNumber(1, 20, 3, 4, 5))
}

fun getMaximalNumber(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}
