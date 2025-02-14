fun main(args: Array<String>) {
    val fridge = mutableListOf("apple", "grape", "mango", "pear", "strawberry", "peach", "avocado")

    println(fridge)

    // adding a fruit to the end of the list
    fridge.add("banana")
    println(fridge)

    // adding a fruit in specific index
    fridge.add(0, "kiwi")
    println(fridge)

    // removing a fruit from the list
    fridge.remove("banana")
    println(fridge)

    // removal using index
    fridge.removeAt(0)
    println(fridge)

    // loop each
    println("Fruits in the list:")
    fridge.forEach(
            fun(fruit: String) {
                println("> $fruit")
            }
    )
}
