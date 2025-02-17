fun main(args: Array<String>) {

    // immutable list
    val components = listOf("CPU", "GPU", "RAM")

    // mutable list
    val mutableComponents = mutableListOf("CPU", "GPU", "RAM")

    // access
    println(components[0])
    println(components.get(0))
    println(mutableComponents[1])
    println(mutableComponents.get(1))

    // there's more like array, set, and map
    // array is the same as list, but with fixed-size anc mutable
    // set is the same as list, but able only to store unique values
    // map is the list too, but with key-value pairs

    // array operations
    val myArray = arrayOf(1, 2, 3, 4, 5)
    myArray[0] = 10
    println(myArray[0])

    // set operations
    val mySet = mutableSetOf(1, 2, 3, 4, 5, 5)
    mySet.add(5)
    println(mySet)
    // the addition will not be added because there is already 5 in the set

    // map operations
    val myMap = mapOf("name" to "la source", "age" to 14, "isAdult" to false)
    println(myMap)
}
