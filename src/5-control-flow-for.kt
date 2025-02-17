fun main(args: Array<String>) {
    val myArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // basic for loop
    for (i in myArray) {
        println(i)
    }

    // for loop the index
    for (i in myArray.indices) {
        println("index at $i is ${myArray[i]}")
    }

    // for loop with range
    for (i in 5..10) {
        println(i)
    }

    // range also accepts step size
    for (i in 0..10 step 2) {
        println(i)
    }

    // even you can do this
    for (i in 10 downTo 0 step 2) {
        println(i)
    }

    // for loop with condition
    for (i in myArray.indices) {
        if (myArray[i] % 2 == 0) {
            println("even number at $i is ${myArray[i]}")
        }
    }

    // higher-order for loop
    myArray.forEach(
            fun(i: Int) {
                println("i is $i")
            }
    )

    // even better
    myArray.forEachIndexed(
            fun(index: Int, i: Int) {
                println("index at $index is $i")
            }
    )
}
