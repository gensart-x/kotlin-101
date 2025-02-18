// question mark in kotlin really useful to manage null-safety in a program

fun main() {
    // act as variable
    // you can't assign this
    // val name: String = null

    // instead
    var name: String? = null

    // it tells the runtime that variable "name" may be string, or null

    // useful things is that you can check if it is null, elegantly
    // instead of
    if (name == null) {
        println("name is null")
    } else {
        println("name is $name")
    }

    // you do
    println("name is ${name?: "null"}")

    // above also is like
    println("name is ${if (name != null) name else "null"}")
}
