fun main(args: Array<String>) {
    val myNumber: Int = 10

    println("Is my number $myNumber even? ${myNumber.isEven()}")
    println("Is my number $myNumber double? ${myNumber.toDouble()}")
}

// extension function is a function that extends/add a new method to an existing class
fun Int.isEven(): Boolean = this % 2 == 0

// but you can't replace the existing method with the extension function
// ? as far as i know
fun Int.toDouble(): Boolean = true

// extension function is useful when you need to add a custom behavior to an existing class
// like formatting currency directly in Int values