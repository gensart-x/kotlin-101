fun main() {
    val name = "genes"

    // String concatenation
    println("My name is $name")
    println("My name is ${name.length} characters long")

    // or you can do this also
    println("My name is " + name)

    // number concatenation
    val number = 123
    println("My number is $number")
    println("My number is ${number + 1}")

    // even you can do this
    println(if (number > 100) "My number is big" else "My number is small")
}
