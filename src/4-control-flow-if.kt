fun main() {
    // if statement
    val name = "la source"
    var age = 14

    if (age >= 18) {
        println("$name is an adult")
    } else {
        println("$name is a loli")
    }

    // if as an expression, or people also call this a ternary operator
    val laSource = if (age >= 18) "adult" else "loli"
    println(laSource)

    val laSourceItems =
            if (name == "la source") {
                println("can do things here")
                "bowl of water"
            } else {
                println("can't do things here")
                "empty bowl of water"
            }

    // even like this
    doLogicWithIfExpression()
}

fun doLogicWithIfExpression(): String {
    val a = 10
    val b = 5

    return if (a > b) {
        "a is greater than b"
    } else {
        "a is less than b"
    }
}
