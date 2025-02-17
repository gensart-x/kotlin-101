// normally-defined function
fun add(a: Int, b: Int): Int {
    return a + b
}

// shorter function, often used if the return type is obvious, or if the body is short
fun addv2(a: Int, b: Int) = a + b

// anonymous function
val addv3 =
        fun(a: Int, b: Int): Int {
            return a + b
        }

// even you can do this in anonymous function
val addv4 = fun(a: Int, b: Int) = a + b

// lambda expression
val addv5 = { a: Int, b: Int -> a + b }

// function with default parameters
fun addv6(a: Int, b: Int = 1): Int = a + b

// function with named parameters. see the call line.
fun addv7(a: Int, b: Int): Int {
    return a + b
}

// you can also provide a function inside a function
fun addv8(a: Int, b: Int): Int {
    val addv81 = fun(c: Int, d: Int): Int = c + d

    return addv81(a, b)
}

fun main(args: Array<String>) {
    println(add(1, 2))
    println(addv2(1, 2))
    println(addv3(1, 2))
    println(addv4(1, 2))
    println(addv5(1, 2))
    println(addv6(1, 2))
    println(addv7(b = 1, a = 2))
    println(addv8(1, 2))
}
